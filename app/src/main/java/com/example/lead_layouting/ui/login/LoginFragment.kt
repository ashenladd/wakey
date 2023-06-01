    package com.example.lead_layouting.ui.login

    import android.os.Bundle
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import androidx.fragment.app.Fragment
    import androidx.navigation.fragment.findNavController
    import com.example.lead_layouting.databinding.FragmentLoginBinding

    class LoginFragment : Fragment() {
        private var _binding: FragmentLoginBinding? = null
        private val binding get() = _binding!!

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            _binding = FragmentLoginBinding.inflate(layoutInflater)
            return binding.root
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            binding.apply {
                btnSignin.setOnClickListener {
                    val username = tietUsername.text.toString()
                    if(username.isNotBlank()){
                        navigateToHome(username)
                    }else{
                        navigateToHome()
                    }
                }
                tvLabelLoginToSignup.setOnClickListener{
                    navigateToRegister()
                }
            }

        }

        fun navigateToHome(nama:String?=null) {
            val direction = LoginFragmentDirections.actionLoginFragmentToHomeFragment(nama)
            findNavController().navigate(direction)
        }
        fun navigateToRegister(){
            val direction = LoginFragmentDirections.actionLoginFragmentToRegisterFragment()
            findNavController().navigate(direction)
        }

    }