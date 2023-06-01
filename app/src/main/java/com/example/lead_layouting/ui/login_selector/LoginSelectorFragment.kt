package com.example.lead_layouting.ui.login_selector

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lead_layouting.R
import com.example.lead_layouting.databinding.FragmentLoginSelectorBinding

class LoginSelectorFragment : Fragment() {
    private var _binding: FragmentLoginSelectorBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginSelectorBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            btnSignin.setOnClickListener {
                navigateToSignIn()
            }
            btnSignup.setOnClickListener {
                navigateToSignUp()
            }
        }
    }

    private fun navigateToSignIn() {
        val direction = LoginSelectorFragmentDirections.actionLoginSelectorFragmentToLoginFragment()
        findNavController().navigate(direction)
    }

    private fun navigateToSignUp() {
        val direction =
            LoginSelectorFragmentDirections.actionLoginSelectorFragmentToRegisterFragment()
        findNavController().navigate(direction)
    }
}
