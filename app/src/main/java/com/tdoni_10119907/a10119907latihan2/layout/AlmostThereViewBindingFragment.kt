package com.tdoni_10119907.a10119907latihan2.layout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.tdoni_10119907.a10119907latihan2.R
import com.tdoni_10119907.a10119907latihan2.databinding.FragmentAlmostThereBinding
import com.tdoni_10119907.a10119907latihan2.module.ViewBindingFragment

// 4/30/2022
// 10119907
// T DONI INDRAPRASTA PRADANA
// IF10K

class AlmostThereViewBindingFragment : ViewBindingFragment<FragmentAlmostThereBinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding =
        FragmentAlmostThereBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        binding.btnVerify.setOnClickListener {
            findNavController().navigate(R.id.action_almostThereViewBindingFragment_to_verifyViewBindingFragment)
        }
    }
}