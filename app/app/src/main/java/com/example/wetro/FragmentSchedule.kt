package com.example.wetro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wetro.databinding.FrameScheduleBinding

class FragmentSchedule: Fragment() {
    private lateinit var binding: FrameScheduleBinding

    var adapter: Adapter = Adapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FrameScheduleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Отдаем данные в frame_item_detail если есть изменения
        setupRecycleView()
    }

    private fun setupRecycleView() {
        binding.recyclerView.layoutManager =
            LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        binding.recyclerView.adapter = adapter
    }

    companion object {
        const val MyTag = "FRAGMENT_SCHEDULE"
    }
}