package com.example.wetro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.wetro.databinding.FrameSchemeBinding

class FragmentScheme: Fragment() {
    private lateinit var binding: FrameSchemeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FrameSchemeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Отдаем данные в frame_item_detail если есть изменения
    }

    companion object {
        const val MyTag = "FRAGMENT_SCHEME"
    }
}