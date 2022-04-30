package com.tdoni_10119907.a10119907latihan2.layout

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.tdoni_10119907.a10119907latihan2.databinding.FragmentHomeBinding
import com.tdoni_10119907.a10119907latihan2.module.ViewBindingFragment

// 4/30/2022
// 10119907
// T DONI INDRAPRASTA PRADANA
// IF10K

class HomeViewBindingFragment : ViewBindingFragment<FragmentHomeBinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding = FragmentHomeBinding::inflate
}