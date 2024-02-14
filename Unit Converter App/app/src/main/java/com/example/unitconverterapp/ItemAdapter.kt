package com.example.unitconverterapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.unitconverterapp.UnitConvertActivities.Area
import com.example.unitconverterapp.UnitConvertActivities.DigitalStorage
import com.example.unitconverterapp.UnitConvertActivities.Energy
import com.example.unitconverterapp.UnitConvertActivities.Frequency
import com.example.unitconverterapp.UnitConvertActivities.FuelEconomy
import com.example.unitconverterapp.UnitConvertActivities.Length
import com.example.unitconverterapp.UnitConvertActivities.PlanAngle
import com.example.unitconverterapp.UnitConvertActivities.Pressure
import com.example.unitconverterapp.UnitConvertActivities.Speed
import com.example.unitconverterapp.UnitConvertActivities.Temperature
import com.example.unitconverterapp.UnitConvertActivities.Time
import com.example.unitconverterapp.UnitConvertActivities.Volume
import com.example.unitconverterapp.UnitConvertActivities.Weight

class ItemAdapter(val dataList:ArrayList<ModelClass>, val context:Context):RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    class ViewHolder(val ItemView: View) : RecyclerView.ViewHolder(ItemView){
        val unitType: TextView = ItemView.findViewById(R.id.unitType)
        val cardView: CardView = ItemView.findViewById(R.id.cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_file,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.unitType.text = dataList[position].unitType

        val id = dataList[position].id
        holder.cardView.setOnClickListener {
            when(id){
                1-> {
                    val intent = Intent(context,Length::class.java)
                    context.startActivity(intent)
                }
                2 ->{
                    val intent = Intent(context,Temperature::class.java)
                    context.startActivity(intent)
                }
                3 ->{
                    val intent = Intent(context, Weight::class.java)
                    context.startActivity(intent)
                }
                5 ->{
                    val intent = Intent(context,Time::class.java)
                    context.startActivity(intent)
                }
                6 ->{
                    val intent = Intent(context, Volume::class.java)
                    context.startActivity(intent)
                }
                7 ->{
                    val intent = Intent(context, Area::class.java)
                    context.startActivity(intent)
                }
                8 ->{
                    val intent = Intent(context,Energy::class.java)
                    context.startActivity(intent)
                }
                9 ->{
                    val intent = Intent(context,Pressure::class.java)
                    context.startActivity(intent)
                }
                10 ->{
                    val intent = Intent(context, Speed::class.java)
                    context.startActivity(intent)
                }
                11 ->{
                    val intent = Intent(context, PlanAngle::class.java)
                    context.startActivity(intent)
                }
                12 ->{
                    val intent = Intent(context,Frequency::class.java)
                    context.startActivity(intent)
                }
                13 ->{
                    val intent = Intent(context,FuelEconomy::class.java)
                    context.startActivity(intent)
                }
                14 ->{
                    val intent = Intent(context,DigitalStorage::class.java)
                    context.startActivity(intent)
                }
            }
        }
    }
}
