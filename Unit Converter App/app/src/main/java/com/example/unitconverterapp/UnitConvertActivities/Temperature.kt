package com.example.unitconverterapp.UnitConvertActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.example.unitconverterapp.R
import com.example.unitconverterapp.databinding.ActivityTemperatureBinding
import java.lang.Exception

class Temperature : AppCompatActivity() {

    lateinit var binding: ActivityTemperatureBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTemperatureBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val convert_btn = findViewById<Button>(R.id.convert_btn)
        val units = resources.getStringArray(R.array.TemperatureUnits)

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

//                Celsius
                if(selectFrom.selectedItem.toString() == "Celsius(°C)"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Celsius(°C)"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Kelvin(K)"){
                        val result = unitFrom+273.15
                        binding.convertedDigit.text = "$result K"
                    }
                    else if(selectTo.selectedItem.toString() == "Fahrenheit(°F)"){

                        val result = unitFrom * 9/5 + 32
                        binding.convertedDigit.text = "$result °F"

                    }
                    else if(selectTo.selectedItem.toString() == "Rankine(°R)"){
                        val result = (unitFrom + 273.15)*9/5
                        binding.convertedDigit.text = "$result °R"

                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }

                }

//                Kelvin
                if(selectFrom.selectedItem.toString() == "Kelvin(K)"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Kelvin(K)"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Celsius(°C)"){
                        val result = unitFrom - 273.15
                        binding.convertedDigit.text = "$result °C"
                    }
                    else if(selectTo.selectedItem.toString() == "Fahrenheit(°F)"){
                        val result = unitFrom * 9/5 - 459.67
                        binding.convertedDigit.text = "$result °F"
                    }
                    else if(selectTo.selectedItem.toString() == "Rankine(°R)"){
                        val result = unitFrom * 9/5
                        binding.convertedDigit.text = "$result °R"

                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }

                }

//                Fahrenheit
                if(selectFrom.selectedItem.toString() == "Fahrenheit(°F)"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Fahrenheit(°F)"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Kelvin(K)"){
                        val result = (unitFrom + 459.67)*5/9
                        binding.convertedDigit.text = "$result K"
                    }
                    else if(selectTo.selectedItem.toString() == "Celsius(°C)"){
                        val result = (unitFrom-32)*5/9
                        binding.convertedDigit.text = "$result °C"
                    }
                    else if(selectTo.selectedItem.toString() == "Rankine(°R)"){
                        val result = unitFrom + 459.67
                        binding.convertedDigit.text = "$result °R"

                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Rankine
                if(selectFrom.selectedItem.toString() == "Rankine(°R)"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Rankine(°R)"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Kelvin(K)"){
                        val result = unitFrom * 5/9
                        binding.convertedDigit.text = "$result K"
                    }
                    else if(selectTo.selectedItem.toString() == "Celsius(°C)"){
                        val result = unitFrom * 5/9 - 273.15
                        binding.convertedDigit.text = "$result °C"
                    }
                    else if(selectTo.selectedItem.toString() == "Fahrenheit(°F)"){
                        val result = unitFrom - 459.67
                        binding.convertedDigit.text = "$result °F"

                    }
                }

            }
            catch (e:Exception){
                Toast.makeText(this, "Enter Digit", Toast.LENGTH_SHORT).show()
            }
        }

    }
}