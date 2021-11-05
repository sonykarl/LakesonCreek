package com.example.lakesoncreek.app.authentication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.lakesoncreek.R
import com.example.lakesoncreek.databinding.FragmentLogInBinding
import com.google.firebase.auth.FirebaseAuth

class LogInFragment : Fragment() {

    lateinit var binding: FragmentLogInBinding
    lateinit var viewModel: LogInViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentLogInBinding.inflate(inflater,container,false)
        viewModel = ViewModelProvider(this).get(LogInViewModel::class.java)

        binding.loginbtn.setOnClickListener {

            val email = binding.emaillogin.text.toString()
            val password = binding.passwordlogin.text.toString()
            val navigation = findNavController().navigate(R.id.action_logInFragment_to_homepageFragment)
            viewModel.loginUser(email,password,navigation)

        }
        // Inflate the layout for this fragment
        return binding.root
    }

}