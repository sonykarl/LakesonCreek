package com.example.lakesoncreek.presentation.authentication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.lakesoncreek.R
import com.example.lakesoncreek.presentation.authentication.viewmodels.ForgotPasswordViewModel
import com.example.lakesoncreek.databinding.FragmentForgotPasswordBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ForgotPasswordFragment : Fragment() {
    lateinit var binding: FragmentForgotPasswordBinding
    lateinit var viewModel: ForgotPasswordViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentForgotPasswordBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(ForgotPasswordViewModel::class.java)
        var navigation = findNavController().navigate(R.id.action_forgotPasswordFragment_to_logInFragment)
        var email = binding.email.text.toString()

        binding.sendcode.setOnClickListener {
            viewModel.forgotpassword(email, navigation)
        }

        return binding.root
    }
}