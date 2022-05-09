package br.com.aula.petsave.common.presentation.animals_near

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import br.com.aula.petsave.common.presentation.AnimalsAdapter
import br.com.aula.petsave.databinding.FragmentAnimalsNearYouBinding

class AnimalsNearYouFragment : Fragment() {

    private val binding get() = _binding!!

    private var _binding: FragmentAnimalsNearYouBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentAnimalsNearYouBinding.inflate(inflater, container, false)

        return binding.root
    }

    private fun setupUI() {
        val adapter = createAdapter()
    }

    private fun createAdapter() : AnimalsAdapter {
        return AnimalsAdapter()
    }

    private fun setupRecyclerView(animalsNearYouAdapter: AnimalsAdapter) {
        binding.animalsRecyclerView.apply {
            adapter = animalsNearYouAdapter
            layoutManager = GridLayoutManager(requireContext(), ITEMS_PER_ROW)
            setHasFixedSize(true)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        private const val ITEMS_PER_ROW = 2
    }
}