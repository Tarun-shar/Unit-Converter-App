package com.example.unitconverterapp.UnitConvertActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.example.unitconverterapp.R
import com.example.unitconverterapp.databinding.ActivityFrequencyBinding

class Frequency : AppCompatActivity() {
    lateinit var binding:ActivityFrequencyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFrequencyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val convert_btn = findViewById<Button>(R.id.convert_btn)
        val units = resources.getStringArray(R.array.FrequencyUnits)

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
//                Hertz
                if(selectFrom.selectedItem.toString() == "Hertz"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Hertz"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Kilohertz"){
                        val result = unitFrom * 0.001
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Megahertz"){
                        val result = unitFrom * 1e-6
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Gigahertz"){
                        val result = unitFrom * 1e-9
                        binding.convertedDigit.text = "$result"
                    }

                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Kilohertz
                if(selectFrom.selectedItem.toString() == "Kilohertz"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Kilohertz"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Hertz"){
                        val result = unitFrom * 1000
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Megahertz"){
                        val result = unitFrom * 0.001
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Gigahertz"){
                        val result = unitFrom * 1e-6
                        binding.convertedDigit.text = "$result"
                    }

                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Megahertz
                if(selectFrom.selectedItem.toString() == "Megahertz"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Megahertz"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Hertz"){
                        val result = unitFrom * 1e+6
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilohertz"){
                        val result = unitFrom * 1000
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Gigahertz"){
                        val result = unitFrom * 0.001
                        binding.convertedDigit.text = "$result"
                    }

                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Gigahertz
                if(selectFrom.selectedItem.toString() == "Gigahertz"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Gigahertz"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Hertz"){
                        val result = unitFrom * 1e+9
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilohertz"){
                        val result = unitFrom * 1e+6
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Megahertz"){
                        val result = unitFrom * 1000
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