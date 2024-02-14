package com.example.unitconverterapp.UnitConvertActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.core.view.isVisible
import com.example.unitconverterapp.R
import com.example.unitconverterapp.Room.UnitDao
import com.example.unitconverterapp.Room.UnitDatabase
import com.example.unitconverterapp.Room.UnitEntity
import com.example.unitconverterapp.databinding.ActivitySpeedBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.system.exitProcess
import kotlin.time.Duration.Companion.milliseconds

class Speed : AppCompatActivity() {

    lateinit var binding: ActivitySpeedBinding
    lateinit var database: UnitDatabase
    lateinit var unitDao: UnitDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySpeedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val convert_btn = findViewById<Button>(R.id.convert_btn)
        val units = resources.getStringArray(R.array.SpeedUnits)

//        Room
        database = UnitDatabase.getDatabase(this)
        unitDao = database.unitDao()

        val selectFrom = findViewById<Spinner>(R.id.select_from)
        val selectTo = findViewById<Spinner>(R.id.select_to)
        if(selectFrom != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, units)
            selectFrom.adapter = adapter
        }
        if (selectTo != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, units)
            selectTo.adapter = adapter
        }

        convert_btn.setOnClickListener {
            try{
//                Mile per hour
                if(selectFrom.selectedItem.toString() == "Mile per hour"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Mile per hour"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Foot per second"){
                        val result = unitFrom * 1.46667
                        binding.convertedDigit.text = "$result ft/s"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Meter per second"){
                        val result = unitFrom * 0.44704

                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result m/s"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilometer per hour"){
                        val result = unitFrom * 1.60934

                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result km/h"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Knot"){
                        val result = unitFrom * 0.868976
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.convertedDigit.text = "$result knots"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Foot per second
                if(selectFrom.selectedItem.toString() == "Foot per second"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Foot per second"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Mile per hour"){
                        val result = unitFrom * 0.681818
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.convertedDigit.text = "$result mph"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Meter per second"){
                        val result = unitFrom * 0.3048
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.convertedDigit.text = "$result m/s"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilometer per hour"){
                        val result = unitFrom * 1.09728
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.convertedDigit.text = "$result km/h"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Knot"){
                        val result = unitFrom * 0.592484
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.convertedDigit.text = "$result knots"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Meter per second
                if(selectFrom.selectedItem.toString() == "Meter per second"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Meter per second"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Mile per hour"){
                        val result = unitFrom * 2.23694
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.convertedDigit.text = "$result mph"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Foot per second"){
                        val result = unitFrom * 3.28084
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.convertedDigit.text = "$result ft/s"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilometer per hour"){
                        val result = unitFrom * 3.6
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.convertedDigit.text = "$result km/h"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Knot"){
                        val result = unitFrom * 1.94384
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.convertedDigit.text = "$result knots"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//               Kilometer per hour
                if(selectFrom.selectedItem.toString() == "Kilometer per hour"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Kilometer per hour"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Mile per hour"){
                        val result = unitFrom * 0.621371
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.convertedDigit.text = "$result mph"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Foot per second"){
                        val result = unitFrom * 0.911344
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.convertedDigit.text = "$result ft/s"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Meter per second"){
                        val result = unitFrom * 0.277778
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.convertedDigit.text = "$result m/h"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Knot"){
                        val result = unitFrom * 0.539957
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.convertedDigit.text = "$result knots"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//              Knot
                if(selectFrom.selectedItem.toString() == "Knot"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Knot"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Mile per hour"){
                        val result = unitFrom * 1.15078
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.convertedDigit.text = "$result mph"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Foot per second"){
                        val result = unitFrom * 1.68781
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.convertedDigit.text = "$result ft/s"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Meter per second"){
                        val result = unitFrom * 0.514444
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.convertedDigit.text = "$result m/h"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilometer per hour"){
                        val result = unitFrom * 1.852
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.convertedDigit.text = "$result km/s"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            catch (e:Exception){
                Toast.makeText(this, "Enter Digit", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun ClearUnit() {
        binding.fromDigitEdittext.text = null
    }

    private fun addDataInRoom(fromUName:String, fromUDigit:String, toUName:String, toUDigit:String) {
        val unitEntity = UnitEntity(null,fromUName,fromUDigit,toUName,toUDigit)
//      Add data in room

        GlobalScope.launch(Dispatchers.IO) {
            database.unitDao().insert(unitEntity)
        }
    }
}
