package com.example.unitconverterapp.UnitConvertActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.example.unitconverterapp.R
import com.example.unitconverterapp.databinding.ActivityPressureBinding

class Pressure : AppCompatActivity() {

    lateinit var binding: ActivityPressureBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPressureBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val convert_btn = findViewById<Button>(R.id.convert_btn)
        val units = resources.getStringArray(R.array.PressureUnits)

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
//                Bar
                if(selectFrom.selectedItem.toString() == "Bar"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Bar"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Pascal"){
                        val result = unitFrom*100000
                        binding.convertedDigit.text = "$result Pa"
                    }
                    else if(selectTo.selectedItem.toString() == "Pound per square inch"){
                        val result = unitFrom*14.503773773
                        binding.convertedDigit.text = "$result psi"
                    }
                    else if(selectTo.selectedItem.toString() == "Standard atmosphere"){
                        val result = unitFrom*0.9869232667
                        binding.convertedDigit.text = "$result atm"
                    }
                    else if(selectTo.selectedItem.toString() == "Torr"){
                        val result = unitFrom*750.061682704
                        binding.convertedDigit.text = "$result Torr"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Pascal
                else if(selectFrom.selectedItem.toString() == "Pascal"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Pascal"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bar"){
                        val result = unitFrom*1.0E-5
                        binding.convertedDigit.text = "$result bar"
                    }
                    else if(selectTo.selectedItem.toString() == "Pound per square inch"){
                        val result = unitFrom % 6894.75729
                        binding.convertedDigit.text = "$result psi"
                    }
                    else if(selectTo.selectedItem.toString() == "Standard atmosphere"){
                        val result = unitFrom * 9.8692326671601E-6
                        binding.convertedDigit.text = "$result atm"
                    }
                    else if(selectTo.selectedItem.toString() == "Torr"){
                        val result = unitFrom * 0.0075006168
                        binding.convertedDigit.text = "$result Torr"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Pound per square inch
                else if(selectFrom.selectedItem.toString() == "Pound per square inch"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Pound per square inch"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bar"){
                        val result = unitFrom * 0.0689475729
                        binding.convertedDigit.text = "$result bar"
                    }
                    else if(selectTo.selectedItem.toString() == "Pascal"){
                        val result = unitFrom * 6894.7572931783
                        binding.convertedDigit.text = "$result Pa"
                    }
                    else if(selectTo.selectedItem.toString() == "Standard atmosphere"){
                        val result = unitFrom * 0.0680459639
                        binding.convertedDigit.text = "$result atm"
                    }
                    else if(selectTo.selectedItem.toString() == "Torr"){
                        val result = unitFrom * 51.7149325716
                        binding.convertedDigit.text = "$result Torr"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Standard Atmosphere
                else if(selectFrom.selectedItem.toString() == "Standard atmosphere"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Standard atmosphere"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bar"){
                        val result = unitFrom * 1.01325
                        binding.convertedDigit.text = "$result bar"
                    }
                    else if(selectTo.selectedItem.toString() == "Pascal"){
                        val result = unitFrom * 101325
                        binding.convertedDigit.text = "$result Pa"
                    }
                    else if(selectTo.selectedItem.toString() == "Pound per square inch"){
                        val result = unitFrom * 14.6959
                        binding.convertedDigit.text = "$result psi"
                    }
                    else if(selectTo.selectedItem.toString() == "Torr"){
                        val result = unitFrom * 760
                        binding.convertedDigit.text = "$result Torr"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Torr
                else if(selectFrom.selectedItem.toString() == "Torr"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Torr"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bar"){
                        val result = unitFrom * 0.0013332237
                        binding.convertedDigit.text = "$result bar"
                    }
                    else if(selectTo.selectedItem.toString() == "Pascal"){
                        val result = unitFrom * 133.3223684211
                        binding.convertedDigit.text = "$result Pa"
                    }
                    else if(selectTo.selectedItem.toString() == "Pound per square inch"){
                        val result = unitFrom * 0.019337
                        binding.convertedDigit.text = "$result psi"
                    }
                    else if(selectTo.selectedItem.toString() == "Standard atmosphere"){
                        val result = unitFrom * 0.00131579
                        binding.convertedDigit.text = "$result atm"
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