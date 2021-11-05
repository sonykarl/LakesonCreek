package com.example.lakesoncreek.app.authentication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
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

            viewModel.repositoryImp.email = binding.emaillogin.text.toString()
            viewModel.repositoryImp.password = binding.passwordlogin.text.toString()
            viewModel.logInUser()

        }
        // Inflate the layout for this fragment
        return binding.root
    }

}