package com.example.lakesoncreek.app.authentication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.lakesoncreek.R
import com.example.lakesoncreek.databinding.FragmentSignUpBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignUpFragment : Fragment() {

    lateinit var binding: FragmentSignUpBinding
    lateinit var viewModel: SignUpViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(SignUpViewModel::class.java)

        binding.SignUp.setOnClickListener {
            val email = binding.EmailSignUp.text.toString()
            val password = binding.passwordsignup.text.toString()
            val navigation = findNavController().navigate(R.id.action_signUpFragment_to_homepageFragment)
            viewModel.signUpuser(email, password, navigation)

        }
        // Inflate the layout for this fragment
        return binding.root
    }

}