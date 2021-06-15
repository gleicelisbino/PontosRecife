package com.example.pontosrecife

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.pontosrecife.databinding.FragmentCentroIntroBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * Classe responsável pelo comportamento do fragment_title
 */
class CentroIntroFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentCentroIntroBinding>(
            inflater,
            R.layout.fragment_centro_intro, container, false
        )

        binding.button.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_centroIntroFragment_to_titleFragment)
        }

        binding.acessarButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_centroIntroFragment_to_centroCardFragment)
        }

        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }

}