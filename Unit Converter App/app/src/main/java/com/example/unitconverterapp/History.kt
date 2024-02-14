package com.example.unitconverterapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.unitconverterapp.Room.UnitDatabase
import com.example.unitconverterapp.Room.UnitEntity
import com.example.unitconverterapp.databinding.ActivityHistoryBinding


class History : AppCompatActivity() {

    lateinit var historyItemAdapter: HistoryItemAdapter
    lateinit var dataList: List<UnitEntity>

    lateinit var binding:ActivityHistoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dataList = ArrayList()

        val database = UnitDatabase.getDatabase(this)

        database.unitDao().getAllUnits().observe(this){unitLists ->

            dataList = unitLists

            historyItemAdapter = HistoryItemAdapter(dataList,this)
//            binding.historyRecyclerView.layoutManager = LinearLayoutManager(this)
            binding.historyRecyclerView.adapter = historyItemAdapter

            historyItemAdapter.notifyDataSetChanged()
        }
    }
}