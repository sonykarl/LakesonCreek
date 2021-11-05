package com.example.lakesoncreek.app.authentication

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.lakesoncreek.R
import com.example.lakesoncreek.databinding.FragmentProfileUpdateBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserProfileChangeRequest
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ProfileUpdateFragment : Fragment() {
    lateinit var auth: FirebaseAuth
    lateinit var binding: FragmentProfileUpdateBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentProfileUpdateBinding.inflate(inflater,container,false)
        binding.button.setOnClickListener {
            updateProfile()
        }
        
        auth = FirebaseAuth.getInstance()
        // Inflate the layout for this fragment
        return binding.root
    }
    private fun updateProfile(){
        auth.currentUser?.let {user ->
            val username = binding.usernameupdate.text.toString()
            val photoURI = Uri.parse("android.resource://com.example.lakesoncreek/${R.drawable.ic_launcher_background}")

            val profileupdate = UserProfileChangeRequest.Builder()
                .setDisplayName(username)
                .setPhotoUri(photoURI)
                .build()

            CoroutineScope(Dispatchers.IO).launch {
                user.updateProfile(profileupdate)
            }
        }
    }
}