package com.example.unitconverterapp.UnitConvertActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.example.unitconverterapp.R
import com.example.unitconverterapp.databinding.ActivityFuelEconomyBinding

class FuelEconomy : AppCompatActivity() {

    lateinit var binding:ActivityFuelEconomyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFuelEconomyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val convert_btn = findViewById<Button>(R.id.convert_btn)
        val units = resources.getStringArray(R.array.FuelEconomyUnits)

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
//                Miles per gallon
                if(selectFrom.selectedItem.toString() == "Miles per gallon"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Miles per gallon"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Miles per gallon (Imperial)"){
                        val result = unitFrom * 1.20095
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilometer per liter"){
                        val result = unitFrom * 0.425144
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Liter per 100 kilometers"){
                        val result = unitFrom * 235.215
                        binding.convertedDigit.text = "$result"
                    }

                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Miles per gallon (Imperial)
                if(selectFrom.selectedItem.toString() == "Miles per gallon (Imperial)"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Miles per gallon (Imperial)"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Miles per gallon"){
                        val result = unitFrom * 0.832674
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilometer per liter"){
                        val result = unitFrom * 0.354006
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Liter per 100 kilometers"){
                        val result = unitFrom * 282.481
                        binding.convertedDigit.text = "$result"
                    }

                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Kilometer per liter
                if(selectFrom.selectedItem.toString() == "Kilometer per liter"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Kilometer per liter"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Miles per gallon"){
                        val result = unitFrom * 2.35215
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Miles per gallon (Imperial)"){
                        val result = unitFrom * 2.82481
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Liter per 100 kilometers"){
                        val result = unitFrom * 100
                        binding.convertedDigit.text = "$result"
                    }

                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Liter per 100 kilometers
                if(selectFrom.selectedItem.toString() == "Liter per 100 kilometers"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Liter per 100 kilometers"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Miles per gallon"){
                        val result = unitFrom * 235.215
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Miles per gallon (Imperial)"){
                        val result = unitFrom * 282.481
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilometer per liter"){
                        val result = unitFrom * 100
                        binding.convertedDigit.text = "$result"
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
}