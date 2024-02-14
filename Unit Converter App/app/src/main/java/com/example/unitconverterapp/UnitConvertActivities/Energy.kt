package com.example.unitconverterapp.UnitConvertActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.example.unitconverterapp.R
import com.example.unitconverterapp.databinding.ActivityEnergyBinding

class Energy : AppCompatActivity() {
    lateinit var binding: ActivityEnergyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEnergyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val convert_btn = findViewById<Button>(R.id.convert_btn)
        val units = resources.getStringArray(R.array.EnergyUnits)

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
//                Joule
                if(selectFrom.selectedItem.toString() == "Joule"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Joule"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Kilojoule"){
                        val result = unitFrom * 0.001
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Gram calorie"){
                        val result = unitFrom * 0.239006
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilocalorie"){
                        val result = unitFrom * 0.000239006
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Watt hour"){
                        val result = unitFrom * 0.000277778
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilowatt hour"){
                        val result = unitFrom * 2.7778e-7
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Electronvolt"){
                        val result = unitFrom * 6.242e+18
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "British thermal unit"){
                        val result = unitFrom * 0.000947817
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US therm"){
                        val result = unitFrom * 9.4804e-9
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Foot-pound"){
                        val result = unitFrom * 0.737562
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Kilojoule
                if(selectFrom.selectedItem.toString() == "Kilojoule"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Kilojoule"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Joule"){
                        val result = unitFrom * 1000
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Gram calorie"){
                        val result = unitFrom * 239.006
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilocalorie"){
                        val result = unitFrom * 0.239006
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Watt hour"){
                        val result = unitFrom * 0.277778
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilowatt hour"){
                        val result = unitFrom * 0.000277778
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Electronvolt"){
                        val result = unitFrom * 6.242e+21
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "British thermal unit"){
                        val result = unitFrom * 0.947817
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US therm"){
                        val result = unitFrom * 9.4804e-6
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Foot-pound"){
                        val result = unitFrom * 737.562
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Gram calorie
                if(selectFrom.selectedItem.toString() == "Gram calorie"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Gram calorie"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Joule"){
                        val result = unitFrom * 4.184
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilojoule"){
                        val result = unitFrom * 0.004184
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilocalorie"){
                        val result = unitFrom * 0.001
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Watt hour"){
                        val result = unitFrom * 0.00116222
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilowatt hour"){
                        val result = unitFrom * 1.1622e-6
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Electronvolt"){
                        val result = unitFrom * 2.611e+19
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "British thermal unit"){
                        val result = unitFrom * 0.00396567
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US therm"){
                        val result = unitFrom * 3.9666e-8
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Foot-pound"){
                        val result = unitFrom * 3.08596
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Kilocalorie
                if(selectFrom.selectedItem.toString() == "Kilocalorie"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Kilocalorie"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Joule"){
                        val result = unitFrom * 4184
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilojoule"){
                        val result = unitFrom * 4.184
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Gram calorie"){
                        val result = unitFrom * 1000
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Watt hour"){
                        val result = unitFrom * 1.16222
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilowatt hour"){
                        val result = unitFrom * 0.00116222
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Electronvolt"){
                        val result = unitFrom * 2.611e+22
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "British thermal unit"){
                        val result = unitFrom * 3.96567
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US therm"){
                        val result = unitFrom * 3.9666e-5
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Foot-pound"){
                        val result = unitFrom * 3085.96
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Watt hour
                if(selectFrom.selectedItem.toString() == "Watt hour"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Watt hour"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Joule"){
                        val result = unitFrom * 3600
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilojoule"){
                        val result = unitFrom * 3.6
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Gram calorie"){
                        val result = unitFrom * 860.421
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilocalorie"){
                        val result = unitFrom * 0.860421
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilowatt hour"){
                        val result = unitFrom * 0.001
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Electronvolt"){
                        val result = unitFrom * 2.247e+22
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "British thermal unit"){
                        val result = unitFrom * 3.41214
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US therm"){
                        val result = unitFrom * 3.413e-5
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Foot-pound"){
                        val result = unitFrom * 2655.22
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Kilowatt hour
                if(selectFrom.selectedItem.toString() == "Kilowatt hour"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Kilowatt hour"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Joule"){
                        val result = unitFrom * 3.6e+6
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilojoule"){
                        val result = unitFrom * 3600
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Gram calorie"){
                        val result = unitFrom * 860421
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilocalorie"){
                        val result = unitFrom * 860.421
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Watt hour"){
                        val result = unitFrom * 1000
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Electronvolt"){
                        val result = unitFrom * 2.247e+25
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "British thermal unit"){
                        val result = unitFrom * 3412.14
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US therm"){
                        val result = unitFrom * 0.0341296
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Foot-pound"){
                        val result = unitFrom * 2.655e+6
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Electronvolt
                if(selectFrom.selectedItem.toString() == "Electronvolt"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Electronvolt"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Joule"){
                        val result = unitFrom * 1.6022e-19
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilojoule"){
                        val result = unitFrom * 1.6022e-22
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Gram calorie"){
                        val result = unitFrom * 3.8293e-20
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilocalorie"){
                        val result = unitFrom * 3.8293e-23
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Watt hour"){
                        val result = unitFrom * 4.4505e-23
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilowatt hour"){
                        val result = unitFrom * 4.4505e-26
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "British thermal unit"){
                        val result = unitFrom * 1.5186e-22
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US therm"){
                        val result = unitFrom * 1.5189e-27
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Foot-pound"){
                        val result = unitFrom * 1.1817e-19
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                British thermal unit
                if(selectFrom.selectedItem.toString() == "British thermal unit"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "British thermal unit"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Joule"){
                        val result = unitFrom * 1055.06
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilojoule"){
                        val result = unitFrom * 1.05506
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Gram calorie"){
                        val result = unitFrom * 252.164
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilocalorie"){
                        val result = unitFrom * 0.252164
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Watt hour"){
                        val result = unitFrom * 0.293071
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilowatt hour"){
                        val result = unitFrom * 0.000293071
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Electronvolt"){
                        val result = unitFrom * 6.585e+21
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US therm"){
                        val result = unitFrom * 1.0002e-5
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Foot-pound"){
                        val result = unitFrom * 778.169
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//               US therm
                if(selectFrom.selectedItem.toString() == "US therm"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "US therm"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Joule"){
                        val result = unitFrom * 1.055e+8
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilojoule"){
                        val result = unitFrom * 105480
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Gram calorie"){
                        val result = unitFrom * 2.521e+7
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilocalorie"){
                        val result = unitFrom * 25210.4
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Watt hour"){
                        val result = unitFrom * 29300.1
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilowatt hour"){
                        val result = unitFrom * 29.3001
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Electronvolt"){
                        val result = unitFrom * 6.584e+26
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "British thermal unit"){
                        val result = unitFrom * 99976.1
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Foot-pound"){
                        val result = unitFrom * 7.78e+7
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//               Foot-pound
                if(selectFrom.selectedItem.toString() == "Foot-pound"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Foot-pound"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Joule"){
                        val result = unitFrom * 1.35582
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilojoule"){
                        val result = unitFrom * 0.00135582
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Gram calorie"){
                        val result = unitFrom * 0.324048
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilocalorie"){
                        val result = unitFrom * 0.000324048
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Watt hour"){
                        val result = unitFrom * 0.000376616
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilowatt hour"){
                        val result = unitFrom * 3.7662e-7
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Electronvolt"){
                        val result = unitFrom * 8.462e+18
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "British thermal unit"){
                        val result = unitFrom * 0.00128507
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US therm"){
                        val result = unitFrom * 1.2854e-8
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