package com.tdoni_10119907.a10119907latihan2.layout

import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.View
import androidx.core.content.res.ResourcesCompat
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.tdoni_10119907.a10119907latihan2.R
import com.tdoni_10119907.a10119907latihan2.databinding.FragmentVerifyBinding
import com.tdoni_10119907.a10119907latihan2.module.SpanLinkBuilder
import com.tdoni_10119907.a10119907latihan2.module.ViewBindingFragment

// 4/30/2022
// 10119907
// T DONI INDRAPRASTA PRADANA
// IF10K

class VerifyViewBindingFragment : ViewBindingFragment<FragmentVerifyBinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding = FragmentVerifyBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        binding.btnSend.setOnClickListener {
            findNavController().navigate(R.id.action_verifyViewBindingFragment_to_homeViewBindingFragment)
        }

        binding.txtViewResendVerificationCode.movementMethod = LinkMovementMethod.getInstance()
        val text = binding.txtViewResendVerificationCode.text.toString()
        val result = SpanLinkBuilder()
            .setText(text)
            .setStartLinkIndex(text.indexOf(getString(R.string.resend)))
            .setEndLinkIndex(text.length)
            .build()
        binding.txtViewResendVerificationCode.text = result
    }
}