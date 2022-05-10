package br.com.aula.petsave.common.presentation.animals_near

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.aula.petsave.R
import br.com.aula.petsave.common.presentation.AnimalsAdapter
import br.com.aula.petsave.common.presentation.Event
import br.com.aula.petsave.databinding.FragmentAnimalsNearYouBinding
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnimalsNearYouFragment : Fragment() {

    private val binding get() = _binding!!

    private var _binding: FragmentAnimalsNearYouBinding? = null

    private val viewModel: AnimalNearYourFragmentViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentAnimalsNearYouBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupUI()
        requestInitialAnimalsList()
    }

    private fun requestInitialAnimalsList() {
        viewModel.onEvent(AnimalsNearYouEvent.RequestInitialAnimalList)
    }

    private fun setupUI() {
        val adapter = createAdapter()
        setupRecyclerView(adapter)
        observeViewStateUpdates(adapter)
    }

    private fun createAdapter() : AnimalsAdapter {
        return AnimalsAdapter()
    }

    private fun updateScreenState(
        state: AnimalsNearYouViewState,
        adapter: AnimalsAdapter
    ) {
        binding.progressBar.isVisible = state.loading
        adapter.submitList(state.animals)
        handleNoMoreAnimalsNearby(state.noMoreAnimalsNearBy)
        handleFailures(state.failure)
    }

    private fun observeViewStateUpdates(adapter: AnimalsAdapter) {
        viewModel.state.observe(viewLifecycleOwner){
            updateScreenState(it, adapter)
        }
    }

    private fun handleNoMoreAnimalsNearby( noMoreAnimalsNearby: Boolean ) {

    }

    private fun handleFailures(failure: Event<Throwable>?){
        val unhandledFailure = failure?.getContentIfNotHandled() ?: return

        val fallbackMessage = getString(R.string.an_error_occurred)
        val snackbarMessage = if(unhandledFailure.message.isNullOrEmpty()){
            fallbackMessage
        }else {
            unhandledFailure.message!!
        }

        if (snackbarMessage.isNotEmpty()){
            Snackbar.make(requireView(), snackbarMessage, Snackbar.LENGTH_SHORT).show()
        }
    }

    private fun setupRecyclerView(animalsNearYouAdapter: AnimalsAdapter) {
        binding.animalsRecyclerView.apply {
            adapter = animalsNearYouAdapter
            layoutManager = GridLayoutManager(requireContext(), ITEMS_PER_ROW)
            setHasFixedSize(true)
            addOnScrollListener(createInfiniteScrollListener(layoutManager as GridLayoutManager))
        }
    }

    private fun createInfiniteScrollListener(
        layoutManager: GridLayoutManager
    ) : RecyclerView.OnScrollListener {
        return object : InfiniteScrollListener(
            layoutManager, AnimalNearYourFragmentViewModel.UI_PAGE_SIZE
        ){
            override fun loadMoreItems() = requestMoreAnimals()
            override fun isLastPage(): Boolean = viewModel.isLoadingMoreAnimals
            override fun isLoading(): Boolean = viewModel.isLastPage
        }
    }


    private fun requestMoreAnimals() {
        viewModel.onEvent(AnimalsNearYouEvent.RequestMoreAnimals)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        private const val ITEMS_PER_ROW = 2
    }
}