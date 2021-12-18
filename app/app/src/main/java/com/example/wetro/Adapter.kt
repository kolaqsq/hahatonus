package com.example.wetro

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wetro.databinding.ItemScheduleBinding


class Adapter: RecyclerView.Adapter<Adapter.Holder>() {
    // Добавленные переменные
    var listItem: List<Schedule> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemScheduleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val schedule = listItem[position]
        holder.bind(schedule)
    }

    override fun getItemCount(): Int {
        return listItem.size
    }

    inner class Holder internal constructor(private val binding: ItemScheduleBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(schedule: Schedule) = binding.run{
            textTimeCount.text = schedule.count
            textTimeCountMin.text = schedule.countMin
            textTimeIn.text = schedule.timeIn
            textTimeOut.text = schedule.timeOut
            textRoute.text = schedule.route

        }
    }
}