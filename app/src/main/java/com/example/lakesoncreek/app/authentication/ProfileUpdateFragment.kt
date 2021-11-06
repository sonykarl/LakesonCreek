package com.example.lakesoncreek.app.authentication

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.lakesoncreek.R
import com.example.lakesoncreek.databinding.FragmentProfileUpdateBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserProfileChangeRequest
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ProfileUpdateFragment : Fragment() {

    lateinit var viewModel: ProfileUpdateViewModel
    lateinit var binding: FragmentProfileUpdateBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentProfileUpdateBinding.inflate(inflater,container,false)
        viewModel = ViewModelProvider(this).get(ProfileUpdateViewModel::class.java)

        var fullname = binding.usernameupdate.text.toString()
        var photo = Uri.parse("https://www.istockphoto.com/photo/headshot-of-44-year-old-mixed-race-man-in-casual-polo-shirt-gm1264106963-370146003?utm_source=unsplash&utm_medium=affiliate&utm_campaign=srp_photos_top&utm_content=https%3A%2F%2Funsplash.com%2Fs%2Fphotos%2Fface&utm_term=face%3A%3Asearch-aggressive-affiliates-v2%3Aa")
        var navigation = findNavController().navigate(R.id.action_profileUpdateFragment_to_homepageFragment)

        binding.button.setOnClickListener {
            viewModel.updateProfile(fullname,photo,navigation)
        }

        // Inflate the layout for this fragment
        return binding.root
    }

}