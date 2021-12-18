package com.example.wetro

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.example.wetro.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var bindingMain: ActivityMainBinding

    private var schemeFragment: FragmentScheme = FragmentScheme()
    private var scheduleFragment: FragmentSchedule = FragmentSchedule()
    private val fragmentList: MutableList<Fragment> = mutableListOf()
    private var position: Int = 0

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)

        fragmentList.add(schemeFragment)
        fragmentList.add(scheduleFragment)
        val transactionInitialization = supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container, fragmentList[0], FragmentScheme.MyTag)
            .add(R.id.fragment_container, fragmentList[1], FragmentSchedule.MyTag)
            .detach(fragmentList[1])
            .addToBackStack("initialization fragment")
        transactionInitialization.commit()
        position = 0

        bindingMain.bottomNavigation.setOnItemSelectedListener { item ->
            when(item.title) {
                "Схема" -> {
                    if (position != 0){
                        changeFragment(0)
                    } else Log.d("pos", "Fragment 0 Already work")
                    true
                }
                "Расписание" -> {
                    if (position != 1){
                        changeFragment(1)
                    } else Log.d("pos", "Fragment 1 Already work")
                    true
                }
                else -> false
            }
            true
        }

        // Иницилизация списка для Adapter
        scheduleFragment.adapter.listItem = ScheduleHolder.createCollectionSchedule()
        scheduleFragment.adapter.notifyDataSetChanged()
    }

    private fun changeFragment(pos: Int){
        when (pos){
            0 -> {
                val transactionInitialization = supportFragmentManager
                    .beginTransaction()
                    .detach(fragmentList[1])
                    .attach(fragmentList[0])
                    .addToBackStack("changed fragment")
                transactionInitialization.commit()
            }
            1 -> {
                val transactionInitialization = supportFragmentManager
                    .beginTransaction()
                    .detach(fragmentList[0])
                    .attach(fragmentList[1])
                    .addToBackStack("changed fragment")
                transactionInitialization.commit()
            }
        }
        position = pos
    }
}