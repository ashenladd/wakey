package com.example.lead_layouting.ui.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lead_layouting.R
import com.example.lead_layouting.databinding.FragmentHomeBinding
import com.example.lead_layouting.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
        private var _binding: FragmentRegisterBinding? =null
        private val binding get()= _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegisterBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            btnSignup.setOnClickListener{
                val email = tietEmail.text.toString()
                if(email != ""){
                    navigateToHome(email)
                }else{
                    Log.d("Debug","Ini Username {$email}")
                    navigateToHome()
                }
            }
            tvLabelSignupToLogin.setOnClickListener {
                navigateToLogin()
            }
        }
    }

    fun navigateToHome(nama:String?=null){
        val direction = RegisterFragmentDirections.actionRegisterFragmentToHomeFragment(nama)
        findNavController().navigate(direction)
    }
    fun navigateToLogin(){
        val direction = RegisterFragmentDirections.actionRegisterFragmentToLoginFragment()
        findNavController().navigate(direction)
    }


}