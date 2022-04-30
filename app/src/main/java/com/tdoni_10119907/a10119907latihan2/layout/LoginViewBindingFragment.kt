package com.tdoni_10119907.a10119907latihan2.layout

import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.core.content.res.ResourcesCompat
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.tdoni_10119907.a10119907latihan2.R
import com.tdoni_10119907.a10119907latihan2.databinding.FragmentLoginBinding
import com.tdoni_10119907.a10119907latihan2.module.SpanLinkBuilder
import com.tdoni_10119907.a10119907latihan2.module.ViewBindingFragment

// 4/30/2022
// 10119907
// T DONI INDRAPRASTA PRADANA
// IF10K

class LoginViewBindingFragment : ViewBindingFragment<FragmentLoginBinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding = FragmentLoginBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        binding.txtViewRegister.movementMethod = LinkMovementMethod.getInstance()
        val text = binding.txtViewRegister.text.toString()
        val result = SpanLinkBuilder()
            .setText(text)
            .setColorId(ResourcesCompat.getColor(resources, R.color.white, null))
            .setStartLinkIndex(text.indexOf(getString(R.string.register)))
            .setEndLinkIndex(text.length)
            .setLinkCallback { findNavController().navigate(R.id.action_loginViewBindingFragment_to_registerViewBindingFragment) }
            .build()
        binding.txtViewRegister.text = result
    }
}