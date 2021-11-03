package com.example.lakesoncreek.app.authentication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lakesoncreek.R
import com.example.lakesoncreek.databinding.FragmentLogInBinding
import com.google.firebase.auth.FirebaseAuth

class LogInFragment : Fragment() {

    lateinit var binding: FragmentLogInBinding
    lateinit var auth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        auth = FirebaseAuth.getInstance()
        binding.loginbtn.setOnClickListener {
            var email = binding.emaillogin.text.toString()
            var password = binding.passwordlogin.text.toString()

            loginUser(email, password)
        }
        // Inflate the layout for this fragment
        return binding.root
    }

    private fun loginUser(email:String, password:String){
        auth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
            task ->
            if (task.isSuccessful){
                binding.emaillogin.text.clear()
                binding.passwordlogin.text.clear()
            }
        }
    }
}