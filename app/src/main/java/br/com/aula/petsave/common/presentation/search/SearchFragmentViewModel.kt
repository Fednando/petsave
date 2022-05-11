package br.com.aula.petsave.common.presentation.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.aula.petsave.common.domain.model.NoMoreAnimalsException
import br.com.aula.petsave.common.domain.model.animal.Animal
import br.com.aula.petsave.common.domain.model.pagination.Pagination
import br.com.aula.petsave.common.presentation.model.mappers.UiAnimalMapper
import br.com.aula.petsave.common.presentation.search.domain.GetSearchFilters
import br.com.aula.petsave.common.presentation.search.domain.SearchAnimals
import br.com.aula.petsave.common.presentation.search.domain.SearchAnimalsRemotely
import br.com.aula.petsave.common.presentation.search.domain.model.SearchParameters
import br.com.aula.petsave.common.presentation.search.domain.model.SearchResults
import br.com.aula.petsave.common.utils.DispatchersProvider
import br.com.aula.petsave.common.utils.createExceptionHandler
import com.raywenderlich.android.logging.Logger
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import io.reactivex.subjects.BehaviorSubject
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.concurrent.CancellationException
import javax.inject.Inject

@HiltViewModel
class SearchFragmentViewModel @Inject constructor(
    private val uiAnimalMapper: UiAnimalMapper,
    private val dispatchersProvider: DispatchersProvider,
    private val compositeDisposable: CompositeDisposable,
    private val getSearchFilters: GetSearchFilters,
    private val searchAnimals: SearchAnimals,
    private val searchAnimalsRemotely: SearchAnimalsRemotely
) : ViewModel() {

    private val _state = MutableLiveData<SearchViewState>()
    val state: LiveData<SearchViewState> get() = _state
    private val querySubject = BehaviorSubject.create<String>()
    private val ageSubject = BehaviorSubject.createDefault("")
    private val typeSubject = BehaviorSubject.createDefault("")

    private var remoteSearchJob: Job = Job()
    private var currentPage = 0

    init {
        _state.value = SearchViewState()
    }

    fun onEvent(event: SearchEvent) {
        when(event) {
            is SearchEvent.PrepareForSearch -> prepareForSearch()
            else -> onSearchParametersUpdate(event)
        }
    }

    private fun prepareForSearch(){
        loadFilterValues()
        setupSearchSubscription()
    }

    private fun setupSearchSubscription() {
        searchAnimals(querySubject, ageSubject, typeSubject)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { onSearchResults(it)},
                { onFailure(it) }
                ).addTo(compositeDisposable)
    }

    private fun onSearchResults(searchResults: SearchResults) {
        val( animals, searchParameters) = searchResults
        if(animals.isEmpty()){
            onEmptyCachResults(searchParameters)
        }else {
            onAnimalList(animals)
        }
    }

    private fun onAnimalList(animals: List<Animal>) {
        _state.value =
            state.value!!.updateToHasSearchResults(animals.map { uiAnimalMapper.mapToView(it) })
    }

    private fun onEmptyCachResults(searchParameters: SearchParameters){
        _state.value = state.value!!.updateToSearchingRemotely()
        searchRemotely(searchParameters)
    }

    private fun searchRemotely(searchParameters: SearchParameters) {
       val exceptionHandler = createExceptionHandler( message =
       "Failed to search remotely")

        remoteSearchJob = viewModelScope.launch(exceptionHandler) {
            val pagination = withContext(dispatchersProvider.io()) {
                Logger.d("Searching remotely")
                searchAnimalsRemotely(++currentPage, searchParameters)
            }

            remoteSearchJob.invokeOnCompletion {
                it?.printStackTrace()
            }

            onPaginationInfoObtained(pagination)
        }
    }

    private fun onPaginationInfoObtained(pagination: Pagination) {
        currentPage = pagination.currentPage
    }

    private fun onSearchParametersUpdate(event: SearchEvent) {
        remoteSearchJob.cancel(
            CancellationException("New search parameters incoming!")
        )

        when (event) {
            is SearchEvent.QueryInput -> updateQuery(event.input)
            is SearchEvent.AgeValueSelected -> updateAgeValue(event.age)
            is SearchEvent.TypeValueSelected -> updateTypeValue(event.type)
        }
    }

    private fun updateQuery(input: String) {
        resetPagination()  // 1
        querySubject.onNext(input)  // 2

        // 3
        if (input.isEmpty()) {
            setNoSearchQueryState()
        } else {
            setSearchingState()
        }
    }

    // 4
    private fun updateAgeValue(age: String) {
        ageSubject.onNext(age)
    }

    private fun setSearchingState() {
        _state.value = state.value!!.updateToSearching()
    }

    private fun setNoSearchQueryState() {
        _state.value = state.value!!.updateToNoSearchQuery()
    }

    private fun updateTypeValue(type: String) {
        typeSubject.onNext(type)
    }

    private fun resetPagination() {
        currentPage = 0
    }

    private fun loadFilterValues() {
        val exceptionHandler = createExceptionHandler(
            message = "Failed to get filter values!"
        )

        viewModelScope.launch(exceptionHandler) {
            val (ages, types) = withContext(dispatchersProvider.io()) {
                getSearchFilters()
            }
            updateStateWithFilterValues(ages, types)
        }
    }

    private fun createExceptionHandler(message: String): CoroutineExceptionHandler {
        return viewModelScope.createExceptionHandler(message) {
            onFailure(it)
        }
    }

    private fun onFailure(throwable: Throwable) {
        _state.value = if (throwable is NoMoreAnimalsException) {
            state.value!!.updateToNoResultsAvailable()
        } else {
            state.value!!.updateToHasFailure(throwable)
        }
    }

    private fun updateStateWithFilterValues(ages: List<String>, types: List<String>){
        _state.value = state.value!!.updateToReadyToSearch(ages, types)
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }
}