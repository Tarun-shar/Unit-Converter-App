package com.example.unitconverterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.unitconverterapp.databinding.ActivitySelectTypeBinding

class SelectType : AppCompatActivity() {

    lateinit var adapter: ItemAdapter
    lateinit var binding: ActivitySelectTypeBinding

    lateinit var dataList : ArrayList<ModelClass>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectTypeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dataList = ArrayList()

        dataList.add(ModelClass(1,"Length"))
        dataList.add(ModelClass(2,"Temperature"))
        dataList.add(ModelClass(3,"Weight"))
        dataList.add(ModelClass(5,"Time"))
        dataList.add(ModelClass(6,"Volume"))
        dataList.add(ModelClass(7,"Area"))
        dataList.add(ModelClass(8,"Energy"))
        dataList.add(ModelClass(9,"Pressure"))
        dataList.add(ModelClass(10,"Speed"))
        dataList.add(ModelClass(11,"Plane Angle"))
        dataList.add(ModelClass(12,"Frequency"))
        dataList.add(ModelClass(13,"Fuel Economy"))
        dataList.add(ModelClass(14,"Digital Storage"))

        adapter = ItemAdapter(dataList,this)

        binding.recyclerView.layoutManager = GridLayoutManager(this,2)
        binding.recyclerView.adapter = adapter

        binding.history.setOnClickListener {
            val intent = Intent (this@SelectType,History::class.java)
            startActivity(intent)
        }
    }
}