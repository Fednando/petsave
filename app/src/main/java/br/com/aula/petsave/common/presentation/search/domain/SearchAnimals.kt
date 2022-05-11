package br.com.aula.petsave.common.presentation.search.domain

import android.util.Log
import br.com.aula.petsave.common.domain.repository.AnimalRepository
import br.com.aula.petsave.common.presentation.search.domain.model.SearchParameters
import br.com.aula.petsave.common.presentation.search.domain.model.SearchResults
import io.reactivex.BackpressureStrategy
import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.functions.Function3
import io.reactivex.subjects.BehaviorSubject
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class SearchAnimals @Inject constructor(
    private val animalRepository: AnimalRepository
) {
    operator fun invoke(
        querySubject: BehaviorSubject<String>,
        ageSubject: BehaviorSubject<String>,
        typeSubject: BehaviorSubject<String>
    ): Flowable<SearchResults> {
        val query = querySubject
            .debounce(500L, TimeUnit.MICROSECONDS) // 1
            .map { it.trim() } // 2
            .filter { it.length >= 2 } //4

        val age = ageSubject.replaceUIEmptyValue()
        val type = typeSubject.replaceUIEmptyValue()

        // 1 - combineLatest joins the lastes result of each stream,
        // using the combining function.

        // 2 - The toFlowable operator transforms the stream into a Flowable.
        // You need to do this to wire the stream up to the Flowable you'll
        // get from the repository

        // 3 - SwitchMap discards any old events in favor of new ones. The is exactly
        // what you want for a search.

        return Observable.combineLatest(query, age, type, combiningFunction)
            .toFlowable(BackpressureStrategy.LATEST)
            .switchMap {
                    parameters: SearchParameters ->
                animalRepository.searchCachedAnimalsBy(parameters)
            }
    }

    private val combiningFunction: Function3<String, String, String, SearchParameters>
        get() = Function3 { query, age, type ->
            SearchParameters(query, age, type)
        }

    private fun BehaviorSubject<String>.replaceUIEmptyValue() =
        map { if(it == GetSearchFilters.NO_FILTER_SELECTED) "" else it }
}