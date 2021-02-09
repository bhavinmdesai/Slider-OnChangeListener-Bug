package com.example.toptalandroid.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.toptalandroid.R
import kotlinx.android.synthetic.main.fragment_default.*
import kotlinx.android.synthetic.main.fragment_second.button

class DefaultFragment : Fragment() {

    companion object {
        private const val TAG = "DefaultFragment"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_default, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        slider.addOnChangeListener { _, _, _ ->
            Log.v(TAG, "OnChangeListener called")
        }

        button.setOnClickListener {
            findNavController().navigate(R.id.action_defaultFragment_to_secondFragment)
        }
    }
}