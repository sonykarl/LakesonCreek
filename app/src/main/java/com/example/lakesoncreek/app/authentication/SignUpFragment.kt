package com.example.lakesoncreek.app.authentication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lakesoncreek.R
import com.example.lakesoncreek.databinding.FragmentSignUpBinding
import com.google.firebase.auth.FirebaseAuth

class SignUpFragment : Fragment() {

    lateinit var auth: FirebaseAuth
    lateinit var binding: FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpBinding.inflate(inflater, container, false)
        auth = FirebaseAuth.getInstance()
        binding.SignUp.setOnClickListener {
            val email = binding.EmailSignUp.text.toString()
            val password = binding.passwordsignup.text.toString()
            registerUser(email, password)
        }
        // Inflate the layout for this fragment
        return binding.root
    }

    private fun registerUser(email:String, password: String){
        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
            task ->
            if (task.isSuccessful){
                binding.EmailSignUp.text.clear()
                binding.passwordsignup.text.clear()
            }
        }
    }

}