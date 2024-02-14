package com.example.unitconverterapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.unitconverterapp.Room.UnitDatabase
import com.example.unitconverterapp.Room.UnitEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class HistoryItemAdapter(val dataList:List<UnitEntity>, val context:Context):RecyclerView.Adapter<HistoryItemAdapter.ViewHolder>() {

    private val database = UnitDatabase.getDatabase(context)

    class ViewHolder(val ItemView:View): RecyclerView.ViewHolder(ItemView){

        val fromUnitName: TextView = ItemView.findViewById(R.id.fromUnitName)
        val fromUnitNum: TextView = ItemView.findViewById(R.id.fromUnitNum)
        val toUnitName: TextView = ItemView.findViewById(R.id.toUnitName)
        val toUnitNum: TextView = ItemView.findViewById(R.id.toUnitNum)
        val delete_card:ImageView = ItemView.findViewById(R.id.delete_card)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryItemAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.history_item_file,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: HistoryItemAdapter.ViewHolder, position: Int) {
        val module = dataList[position]

        holder.fromUnitName.text = module.fromUnitName
        holder.fromUnitNum.text = module.fromUnitNumber
        holder.toUnitName.text = module.toUnitName
        holder.toUnitNum.text = module.toUnitNumber

        holder.delete_card.setOnClickListener {

            GlobalScope.launch {
                database.unitDao().delete(module)

            }
        }


    }
}