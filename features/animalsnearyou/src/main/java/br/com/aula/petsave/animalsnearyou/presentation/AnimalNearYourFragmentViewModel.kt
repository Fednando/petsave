package br.com.aula.petsave.common.presentation.animals_near

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.aula.petsave.common.domain.model.NetworkException
import br.com.aula.petsave.common.domain.model.NetworkUnavailableException
import br.com.aula.petsave.common.domain.model.NoMoreAnimalsException
import br.com.aula.petsave.common.domain.model.animal.Animal
import br.com.aula.petsave.common.domain.model.pagination.Pagination
import br.com.aula.petsave.common.presentation.Event
import br.com.aula.petsave.common.presentation.animals_near.domain.GetAnimals
import br.com.aula.petsave.common.presentation.animals_near.domain.RequestNextPageOfAnimals
import br.com.aula.petsave.common.presentation.model.mappers.UiAnimalMapper
import br.com.aula.petsave.common.utils.DispatchersProvider
import br.com.aula.petsave.common.utils.createExceptionHandler
import com.raywenderlich.android.logging.Logger
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.*
import javax.inject.Inject

@HiltViewModel
class AnimalNearYourFragmentViewModel @Inject constructor(
    private val uiAnimalMapper: UiAnimalMapper,
    private val dispatchersProvider: DispatchersProvider,
    private val compositeDisposable: CompositeDisposable,
    private val requestNextPageOfAnimals: RequestNextPageOfAnimals,
    private val getAnimals: GetAnimals
) : ViewModel() {


    val state: LiveData<AnimalsNearYouViewState> get() = _state
    private val _state = MutableLiveData<AnimalsNearYouViewState>()
    private var currentPage = 0

    var isLoadingMoreAnimals: Boolean = false
    var isLastPage = false

    init {
        _state.value = AnimalsNearYouViewState()
        subscribeToAnimalUpdates()
    }

    private fun subscribeToAnimalUpdates() {
        getAnimals()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { onNewAnimalList(it) },
                { onFailure(it) }
            )
            .addTo(compositeDisposable)
    }

    private fun onNewAnimalList(animals: List<Animal>) {
        Logger.d("Got more animals!")

        val animalsNearYou = animals.map {
            uiAnimalMapper.mapToView(it)
        }

        val currentList = state.value!!.animals
        val newAnimals = animalsNearYou.subtract(currentList)
        val updatedList = currentList + newAnimals

        _state.value = state.value!!.copy(
            loading = false,
            animals = updatedList
        )
    }

    fun onEvent(event: AnimalsNearYouEvent) {
        when(event) {
            is AnimalsNearYouEvent.RequestInitialAnimalList -> {
                loadAnimals()
            }
            is AnimalsNearYouEvent.RequestMoreAnimals -> {
                loadNextAnimalPage()
            }
        }
    }

    private fun loadAnimals() {
        if(state.value!!.animals.isEmpty()){
            loadNextAnimalPage()
        }
    }

    private fun loadNextAnimalPage() {
        isLoadingMoreAnimals = true

        val errorMessage = "Failed to fetch nearby animals"
        val exceptionHandler = viewModelScope.createExceptionHandler(errorMessage) { onFailure(it) }

        viewModelScope.launch(exceptionHandler) {
            val pagination = withContext(dispatchersProvider.io()) {
                Logger.d("Requesting more animals.")

                requestNextPageOfAnimals(++currentPage)
            }

            onPaginationInfoObtained(pagination)
            isLoadingMoreAnimals = false
        }
    }

    private fun onPaginationInfoObtained(pagination: Pagination) {
        currentPage = pagination.currentPage
    }

    private fun onFailure(failure: Throwable) {
        when(failure) {
            is NetworkException,
            is NetworkUnavailableException -> {
                _state.value = state.value!!.copy(
                    loading = false,
                    failure = Event(failure)
                )
            }
            is NoMoreAnimalsException -> {
                _state.value = state.value!!.copy(
                    noMoreAnimalsNearBy = true,
                    failure = Event(failure)
                )
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }

    companion object {
        const val UI_PAGE_SIZE = Pagination.DEFAULT_PAGE_SIZE
    }
}