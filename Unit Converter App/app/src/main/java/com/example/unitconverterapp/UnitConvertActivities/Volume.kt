package com.example.unitconverterapp.UnitConvertActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.example.unitconverterapp.R
import com.example.unitconverterapp.databinding.ActivityVolumeBinding

class Volume : AppCompatActivity() {

    lateinit var binding: ActivityVolumeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVolumeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val convert_btn = findViewById<Button>(R.id.convert_btn)
        val units = resources.getStringArray(R.array.VolumeUnits)

        val selectFrom = findViewById<Spinner>(R.id.select_from)
        val selectTo = findViewById<Spinner>(R.id.select_to)
        if(selectFrom != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, units)
            selectFrom.adapter = adapter
        }
        if(selectTo != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, units)
            selectTo.adapter = adapter
        }

        convert_btn.setOnClickListener {
            try{
//                US liquid gallon gal (US)
                if(selectFrom.selectedItem.toString() == "US liquid gallon"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "US liquid gallon"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid quart"){
                        val result = unitFrom * 4
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid pint"){
                        val result = unitFrom * 8
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US legal cup"){
                        val result = unitFrom * 15.7725
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Fluid ounce"){
                        val result = unitFrom * 128
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US tablespoon"){
                        val result = unitFrom * 256
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US teaspoon"){
                        val result = unitFrom * 768
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic meter"){
                        val result = unitFrom * 0.00378541
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Liter"){
                        val result = unitFrom * 3.78541
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Milliliter"){
                        val result = unitFrom * 3785.41
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial gallon"){
                        val result = unitFrom * 0.832674
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial quart"){
                        val result = unitFrom * 3.3307
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial cup"){
                        val result = unitFrom * 13.3228
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial pint"){
                        val result = unitFrom * 6.66139
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imp. fluid ounce"){
                        val result = unitFrom * 133.228
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial tablespoon"){
                        val result = unitFrom * 213.165
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial teaspoon"){
                        val result = unitFrom * 639.494
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic foot"){
                        val result = unitFrom * 0.133681
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic inch"){
                        val result = unitFrom * 231
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                US liquid quart
                if(selectFrom.selectedItem.toString() == "US liquid quart"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "US liquid quart"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid gallon"){
                        val result = unitFrom * 0.25
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid pint"){
                        val result = unitFrom * 2
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US legal cup"){
                        val result = unitFrom * 3.94314
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Fluid ounce"){
                        val result = unitFrom * 32
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US tablespoon"){
                        val result = unitFrom * 64
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US teaspoon"){
                        val result = unitFrom * 192
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic meter"){
                        val result = unitFrom * 0.000946353
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Liter"){
                        val result = unitFrom * 0.946353
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Milliliter"){
                        val result = unitFrom * 946.353
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial gallon"){
                        val result = unitFrom * 0.208169
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial quart"){
                        val result = unitFrom * 0.832674
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial pint"){
                        val result = unitFrom * 1.66535
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial cup"){
                        val result = unitFrom * 3.3307
                        binding.convertedDigit.text = "$result"
                    }

                    else if(selectTo.selectedItem.toString() == "Imp. fluid ounce"){
                        val result = unitFrom * 33.307
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial tablespoon"){
                        val result = unitFrom * 53.2911
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial teaspoon"){
                        val result = unitFrom * 159.873
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic foot"){
                        val result = unitFrom * 0.0334201
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic inch"){
                        val result = unitFrom * 57.75
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//               US liquid pint
                if(selectFrom.selectedItem.toString() == "US liquid pint"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "US liquid pint"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid gallon"){
                        val result = unitFrom * 0.125
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid quart"){
                        val result = unitFrom * 0.5
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US legal cup"){
                        val result = unitFrom * 1.97157
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Fluid ounce"){
                        val result = unitFrom * 16
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US tablespoon"){
                        val result = unitFrom * 32
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US teaspoon"){
                        val result = unitFrom * 96
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic meter"){
                        val result = unitFrom * 0.000473176
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Liter"){
                        val result = unitFrom * 0.473176
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Milliliter"){
                        val result = unitFrom * 473.176
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial gallon"){
                        val result = unitFrom * 0.104084
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial quart"){
                        val result = unitFrom * 0.416337
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial pint"){
                        val result = unitFrom * 0.832674
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial cup"){
                        val result = unitFrom * 1.66535
                        binding.convertedDigit.text = "$result"
                    }

                    else if(selectTo.selectedItem.toString() == "Imp. fluid ounce"){
                        val result = unitFrom * 16.6535
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial tablespoon"){
                        val result = unitFrom * 26.6456
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial teaspoon"){
                        val result = unitFrom * 79.9367
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic foot"){
                        val result = unitFrom * 0.0167101
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic inch"){
                        val result = unitFrom * 28.875
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//               US liquid cup
                if(selectFrom.selectedItem.toString() == "US liquid cup"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "US liquid cup"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid gallon"){
                        val result = unitFrom * 0.0634013
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid quart"){
                        val result = unitFrom * 0.253605
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US legal pint"){
                        val result = unitFrom * 0.50721
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Fluid ounce"){
                        val result = unitFrom * 8.11537
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US tablespoon"){
                        val result = unitFrom * 16.2307
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US teaspoon"){
                        val result = unitFrom * 48.6922
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic meter"){
                        val result = unitFrom * 0.00024
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Liter"){
                        val result = unitFrom * 0.24
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Milliliter"){
                        val result = unitFrom * 240
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial gallon"){
                        val result = unitFrom * 0.0527926
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial quart"){
                        val result = unitFrom * 0.21117
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial pint"){
                        val result = unitFrom * 0.422341
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial cup"){
                        val result = unitFrom * 0.844682
                        binding.convertedDigit.text = "$result"
                    }

                    else if(selectTo.selectedItem.toString() == "Imp. fluid ounce"){
                        val result = unitFrom * 8.44682
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial tablespoon"){
                        val result = unitFrom * 13.5149
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial teaspoon"){
                        val result = unitFrom * 40.5447
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic foot"){
                        val result = unitFrom * 0.00847552
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic inch"){
                        val result = unitFrom * 14.6457
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//               Fluid ounce
                if(selectFrom.selectedItem.toString() == "Fluid ounce"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Fluid ounce"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid gallon"){
                        val result = unitFrom * 0.0078125
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid quart"){
                        val result = unitFrom * 0.03125
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US legal pint"){
                        val result = unitFrom * 0.0625
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid cup"){
                        val result = unitFrom * 0.123223
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US tablespoon"){
                        val result = unitFrom * 2
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US teaspoon"){
                        val result = unitFrom * 6
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic meter"){
                        val result = unitFrom * 2.9574e-5
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Liter"){
                        val result = unitFrom * 0.0295735
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Milliliter"){
                        val result = unitFrom * 29.5735
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial gallon"){
                        val result = unitFrom * 0.00650527
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial quart"){
                        val result = unitFrom * 0.0260211
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial pint"){
                        val result = unitFrom * 0.0520421
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial cup"){
                        val result = unitFrom * 0.104084
                        binding.convertedDigit.text = "$result"
                    }

                    else if(selectTo.selectedItem.toString() == "Imp. fluid ounce"){
                        val result = unitFrom * 1.04084
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial tablespoon"){
                        val result = unitFrom * 1.66535
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial teaspoon"){
                        val result = unitFrom * 4.99604
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic foot"){
                        val result = unitFrom * 0.00104438
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic inch"){
                        val result = unitFrom * 1.80469
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//               US tablespoon
                if(selectFrom.selectedItem.toString() == "US tablespoon"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "US tablespoon"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid gallon"){
                        val result = unitFrom * 0.00390625
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid quart"){
                        val result = unitFrom * 0.015625
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US legal pint"){
                        val result = unitFrom * 0.03125
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid cup"){
                        val result = unitFrom * 0.0616115
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Fluid ounce"){
                        val result = unitFrom * 0.5
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US teaspoon"){
                        val result = unitFrom * 3
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic meter"){
                        val result = unitFrom * 1.4787e-5
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Liter"){
                        val result = unitFrom * 0.0147868
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Milliliter"){
                        val result = unitFrom * 14.7868
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial gallon"){
                        val result = unitFrom * 0.00325263
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial quart"){
                        val result = unitFrom * 0.0130105
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial pint"){
                        val result = unitFrom * 0.0260211
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial cup"){
                        val result = unitFrom * 0.0520421
                        binding.convertedDigit.text = "$result"
                    }

                    else if(selectTo.selectedItem.toString() == "Imp. fluid ounce"){
                        val result = unitFrom * 0.520421
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial tablespoon"){
                        val result = unitFrom * 0.832674
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial teaspoon"){
                        val result = unitFrom * 2.49802
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic foot"){
                        val result = unitFrom * 0.00052219
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic inch"){
                        val result = unitFrom * 0.902344
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//              US teaspoon
                if(selectFrom.selectedItem.toString() == "US teaspoon"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "US teaspoon"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid gallon"){
                        val result = unitFrom * 0.00130208
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid quart"){
                        val result = unitFrom * 0.00520833
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US legal pint"){
                        val result = unitFrom * 0.0104167
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid cup"){
                        val result = unitFrom * 0.0205372
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Fluid ounce"){
                        val result = unitFrom * 0.166667
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US tablespoon"){
                        val result = unitFrom * 0.333333
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic meter"){
                        val result = unitFrom * 4.9289e-6
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Liter"){
                        val result = unitFrom * 0.00492892
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Milliliter"){
                        val result = unitFrom * 4.92892
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial gallon"){
                        val result = unitFrom * 0.00108421
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial quart"){
                        val result = unitFrom * 0.00433684
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial pint"){
                        val result = unitFrom * 0.00867369
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial cup"){
                        val result = unitFrom * 0.0173474
                        binding.convertedDigit.text = "$result"
                    }

                    else if(selectTo.selectedItem.toString() == "Imp. fluid ounce"){
                        val result = unitFrom * 0.173474
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial tablespoon"){
                        val result = unitFrom * 0.277558
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial teaspoon"){
                        val result = unitFrom * 0.832674
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic foot"){
                        val result = unitFrom * 0.000174063
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic inch"){
                        val result = unitFrom * 0.300781
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//              Cubic meter
                if(selectFrom.selectedItem.toString() == "Cubic meter"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Cubic meter"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid gallon"){
                        val result = unitFrom * 264.172
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid quart"){
                        val result = unitFrom * 1056.69
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US legal pint"){
                        val result = unitFrom * 2113.38
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid cup"){
                        val result = unitFrom * 4166.67
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Fluid ounce"){
                        val result = unitFrom * 33814
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US tablespoon"){
                        val result = unitFrom * 67628
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US teaspoon"){
                        val result = unitFrom * 202884
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Liter"){
                        val result = unitFrom * 1000
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Milliliter"){
                        val result = unitFrom * 1e+6
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial gallon"){
                        val result = unitFrom * 219.969
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial quart"){
                        val result = unitFrom * 879.877
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial pint"){
                        val result = unitFrom * 1759.75
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial cup"){
                        val result = unitFrom * 3519.51
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imp. fluid ounce"){
                        val result = unitFrom * 35195.1
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial tablespoon"){
                        val result = unitFrom * 56312.1
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial teaspoon"){
                        val result = unitFrom * 168936
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic foot"){
                        val result = unitFrom * 35.3147
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic inch"){
                        val result = unitFrom * 61023.7
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//              Liter
                if(selectFrom.selectedItem.toString() == "Liter"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Liter"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid gallon"){
                        val result = unitFrom * 0.264172
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid quart"){
                        val result = unitFrom * 1.05669
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US legal pint"){
                        val result = unitFrom * 2.11338
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid cup"){
                        val result = unitFrom * 4.16667
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Fluid ounce"){
                        val result = unitFrom * 33.814
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US tablespoon"){
                        val result = unitFrom * 67.628
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US teaspoon"){
                        val result = unitFrom * 202.884
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic meter"){
                        val result = unitFrom * 0.001
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Milliliter"){
                        val result = unitFrom * 1000
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial gallon"){
                        val result = unitFrom * 0.219969
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial quart"){
                        val result = unitFrom * 0.879877
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial pint"){
                        val result = unitFrom * 1.75975
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial cup"){
                        val result = unitFrom * 3.51951
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imp. fluid ounce"){
                        val result = unitFrom * 35.1951
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial tablespoon"){
                        val result = unitFrom * 56.3121
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial teaspoon"){
                        val result = unitFrom * 168.936
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic foot"){
                        val result = unitFrom * 0.0353147
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic inch"){
                        val result = unitFrom * 61.0237
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//              Milliliter
                if(selectFrom.selectedItem.toString() == "Milliliter"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Milliliter"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid gallon"){
                        val result = unitFrom * 0.000264172
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid quart"){
                        val result = unitFrom * 0.00105669
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US legal pint"){
                        val result = unitFrom * 0.00211338
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid cup"){
                        val result = unitFrom * 0.00416667
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Fluid ounce"){
                        val result = unitFrom * 0.033814
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US tablespoon"){
                        val result = unitFrom * 0.067628
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US teaspoon"){
                        val result = unitFrom * 0.202884
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic meter"){
                        val result = unitFrom * 1e-6
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Liter"){
                        val result = unitFrom * 0.001
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial gallon"){
                        val result = unitFrom * 0.000219969
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial quart"){
                        val result = unitFrom * 0.000879877
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial pint"){
                        val result = unitFrom * 0.00175975
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial cup"){
                        val result = unitFrom * 0.00351951
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imp. fluid ounce"){
                        val result = unitFrom * 0.0351951
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial tablespoon"){
                        val result = unitFrom * 0.0563121
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial teaspoon"){
                        val result = unitFrom * 0.168936
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic foot"){
                        val result = unitFrom * 3.5315e-5
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic inch"){
                        val result = unitFrom * 0.0610237
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Imperial gallon
                if(selectFrom.selectedItem.toString() == "Imperial gallon"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Imperial gallon"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid gallon"){
                        val result = unitFrom * 1.20095
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid quart"){
                        val result = unitFrom * 4.8038
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US legal pint"){
                        val result = unitFrom * 9.6076
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid cup"){
                        val result = unitFrom * 18.942
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Fluid ounce"){
                        val result = unitFrom * 153.722
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US tablespoon"){
                        val result = unitFrom * 307.443
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US teaspoon"){
                        val result = unitFrom * 922.33
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic meter"){
                        val result = unitFrom * 0.00454609
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Liter"){
                        val result = unitFrom * 4.54609
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Milliliter"){
                        val result = unitFrom * 4546.09
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial quart"){
                        val result = unitFrom * 4
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial pint"){
                        val result = unitFrom * 8
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial cup"){
                        val result = unitFrom * 16
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imp. fluid ounce"){
                        val result = unitFrom * 160
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial tablespoon"){
                        val result = unitFrom * 256
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial teaspoon"){
                        val result = unitFrom * 768
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic foot"){
                        val result = unitFrom * 0.160544
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic inch"){
                        val result = unitFrom * 277.419
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Imperial quart
                if(selectFrom.selectedItem.toString() == "Imperial quart"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Imperial quart"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid gallon"){
                        val result = unitFrom * 0.300237
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid quart"){
                        val result = unitFrom * 1.20095
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US legal pint"){
                        val result = unitFrom * 2.4019
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid cup"){
                        val result = unitFrom * 4.73551
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Fluid ounce"){
                        val result = unitFrom * 38.4304
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US tablespoon"){
                        val result = unitFrom * 76.8608
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US teaspoon"){
                        val result = unitFrom * 230.582
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic meter"){
                        val result = unitFrom * 0.00113652
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Liter"){
                        val result = unitFrom * 1.13652
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Milliliter"){
                        val result = unitFrom * 1136.52
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial gallon"){
                        val result = unitFrom * 0.25
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial pint"){
                        val result = unitFrom * 2
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial cup"){
                        val result = unitFrom * 4
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imp. fluid ounce"){
                        val result = unitFrom * 40
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial tablespoon"){
                        val result = unitFrom * 64
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial teaspoon"){
                        val result = unitFrom * 192
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic foot"){
                        val result = unitFrom * 0.0401359
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic inch"){
                        val result = unitFrom * 69.3549
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Imperial pint
                if(selectFrom.selectedItem.toString() == "Imperial pint"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Imperial pint"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid gallon"){
                        val result = unitFrom * 0.150119
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid quart"){
                        val result = unitFrom * 0.600475
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US legal pint"){
                        val result = unitFrom * 1.20095
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid cup"){
                        val result = unitFrom * 2.36776
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Fluid ounce"){
                        val result = unitFrom * 19.2152
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US tablespoon"){
                        val result = unitFrom * 38.4304
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US teaspoon"){
                        val result = unitFrom * 115.291
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic meter"){
                        val result = unitFrom * 0.000568261
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Liter"){
                        val result = unitFrom * 0.568261
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Milliliter"){
                        val result = unitFrom * 568.261
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial gallon"){
                        val result = unitFrom * 0.125
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial quart"){
                        val result = unitFrom * 0.5
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial cup"){
                        val result = unitFrom * 2
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imp. fluid ounce"){
                        val result = unitFrom * 20
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial tablespoon"){
                        val result = unitFrom * 32
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial teaspoon"){
                        val result = unitFrom * 96
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic foot"){
                        val result = unitFrom * 0.020068
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic inch"){
                        val result = unitFrom * 34.6774
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Imperial cup
                if(selectFrom.selectedItem.toString() == "Imperial cup"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Imperial cup"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid gallon"){
                        val result = unitFrom * 0.0750594
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid quart"){
                        val result = unitFrom * 0.300237
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US legal pint"){
                        val result = unitFrom * 0.600475
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid cup"){
                        val result = unitFrom * 1.18388
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Fluid ounce"){
                        val result = unitFrom * 9.6076
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US tablespoon"){
                        val result = unitFrom * 19.2152
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US teaspoon"){
                        val result = unitFrom * 57.6456
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic meter"){
                        val result = unitFrom * 0.000284131
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Liter"){
                        val result = unitFrom * 0.284131
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Milliliter"){
                        val result = unitFrom * 284.131
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial gallon"){
                        val result = unitFrom * 0.0625
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial quart"){
                        val result = unitFrom * 0.25
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial pint"){
                        val result = unitFrom * 0.5
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imp. fluid ounce"){
                        val result = unitFrom * 10
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial tablespoon"){
                        val result = unitFrom * 16
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial teaspoon"){
                        val result = unitFrom * 48
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic foot"){
                        val result = unitFrom * 0.010034
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic inch"){
                        val result = unitFrom * 17.3387
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Imp. fluid ounce
                if(selectFrom.selectedItem.toString() == "Imp. fluid ounce"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Imp. fluid ounce"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid gallon"){
                        val result = unitFrom * 0.00750594
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid quart"){
                        val result = unitFrom * 0.0300237
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US legal pint"){
                        val result = unitFrom * 0.0600475
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid cup"){
                        val result = unitFrom * 0.118388
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Fluid ounce"){
                        val result = unitFrom * 0.96076
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US tablespoon"){
                        val result = unitFrom * 1.92152
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US teaspoon"){
                        val result = unitFrom * 5.76456
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic meter"){
                        val result = unitFrom * 2.8413e-5
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Liter"){
                        val result = unitFrom * 0.0284131
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Milliliter"){
                        val result = unitFrom * 28.4131
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial gallon"){
                        val result = unitFrom * 0.00625
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial quart"){
                        val result = unitFrom * 0.025
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial pint"){
                        val result = unitFrom * 0.05
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial cup"){
                        val result = unitFrom * 0.1
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial tablespoon"){
                        val result = unitFrom * 1.6
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial teaspoon"){
                        val result = unitFrom * 4.8
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic foot"){
                        val result = unitFrom * 0.0010034
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic inch"){
                        val result = unitFrom * 1.73387
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Imperial tablespoon
                if(selectFrom.selectedItem.toString() == "Imperial tablespoon"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Imperial tablespoon"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid gallon"){
                        val result = unitFrom * 0.00469121
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid quart"){
                        val result = unitFrom * 0.0187649
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US legal pint"){
                        val result = unitFrom * 0.0375297
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid cup"){
                        val result = unitFrom * 0.0739924
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Fluid ounce"){
                        val result = unitFrom * 0.600475
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US tablespoon"){
                        val result = unitFrom * 1.20095
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US teaspoon"){
                        val result = unitFrom * 3.60285
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic meter"){
                        val result = unitFrom * 1.7758e-5
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Liter"){
                        val result = unitFrom * 0.0177582
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Milliliter"){
                        val result = unitFrom * 17.7582
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial gallon"){
                        val result = unitFrom * 0.00390625
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial quart"){
                        val result = unitFrom * 0.015625
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial pint"){
                        val result = unitFrom * 0.03125
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial cup"){
                        val result = unitFrom * 0.0625
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imp. fluid ounce"){
                        val result = unitFrom * 0.625
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial teaspoon"){
                        val result = unitFrom * 3
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic foot"){
                        val result = unitFrom * 0.000627124
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic inch"){
                        val result = unitFrom * 1.08367
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Imperial teaspoon
                if(selectFrom.selectedItem.toString() == "Imperial teaspoon"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Imperial teaspoon"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid gallon"){
                        val result = unitFrom * 0.00156374
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid quart"){
                        val result = unitFrom * 0.00625495
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US legal pint"){
                        val result = unitFrom * 0.0125099
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid cup"){
                        val result = unitFrom * 0.0246641
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Fluid ounce"){
                        val result = unitFrom * 0.200158
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US tablespoon"){
                        val result = unitFrom * 0.400317
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US teaspoon"){
                        val result = unitFrom * 1.20095
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic meter"){
                        val result = unitFrom * 5.9194e-6
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Liter"){
                        val result = unitFrom * 0.00591939
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Milliliter"){
                        val result = unitFrom * 5.91939
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial gallon"){
                        val result = unitFrom * 0.00130208
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial quart"){
                        val result = unitFrom * 0.00520834
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial pint"){
                        val result = unitFrom * 0.0104167
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial cup"){
                        val result = unitFrom * 0.0208333
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imp. fluid ounce"){
                        val result = unitFrom * 0.208333
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial tablespoon"){
                        val result = unitFrom * 0.333333
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic foot"){
                        val result = unitFrom * 0.000209041
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic inch"){
                        val result = unitFrom * 0.361223
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Cubic foot
                if(selectFrom.selectedItem.toString() == "Cubic foot"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Cubic foot"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid gallon"){
                        val result = unitFrom * 7.48052
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid quart"){
                        val result = unitFrom * 29.9221
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US legal pint"){
                        val result = unitFrom * 59.8442
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid cup"){
                        val result = unitFrom * 117.987
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Fluid ounce"){
                        val result = unitFrom * 957.506
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US tablespoon"){
                        val result = unitFrom * 1915.01
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US teaspoon"){
                        val result = unitFrom * 5745.04
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic meter"){
                        val result = unitFrom * 0.0283168
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Liter"){
                        val result = unitFrom * 28.3168
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Milliliter"){
                        val result = unitFrom * 28316.8
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial gallon"){
                        val result = unitFrom * 6.22884
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial quart"){
                        val result = unitFrom * 24.9153
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial pint"){
                        val result = unitFrom * 49.8307
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial cup"){
                        val result = unitFrom * 99.6614
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imp. fluid ounce"){
                        val result = unitFrom * 996.614
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial tablespoon"){
                        val result = unitFrom * 1594.58
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial teaspoon"){
                        val result = unitFrom * 4783.74
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic inch"){
                        val result = unitFrom * 1728
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Cubic inch
                if(selectFrom.selectedItem.toString() == "Cubic inch"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Cubic inch"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid gallon"){
                        val result = unitFrom * 0.004329
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid quart"){
                        val result = unitFrom * 0.017316
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US legal pint"){
                        val result = unitFrom * 0.034632
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US liquid cup"){
                        val result = unitFrom * 0.0682794
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Fluid ounce"){
                        val result = unitFrom * 0.554113
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US tablespoon"){
                        val result = unitFrom * 1.10823
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "US teaspoon"){
                        val result = unitFrom * 3.32468
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic meter"){
                        val result = unitFrom * 1.6387e-5
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Liter"){
                        val result = unitFrom * 0.0163871
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Milliliter"){
                        val result = unitFrom * 16.3871
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial gallon"){
                        val result = unitFrom * 0.00360465
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial quart"){
                        val result = unitFrom * 0.0144186
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial pint"){
                        val result = unitFrom * 0.0288372
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial cup"){
                        val result = unitFrom * 0.0576744
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imp. fluid ounce"){
                        val result = unitFrom * 0.576744
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial tablespoon"){
                        val result = unitFrom * 0.92279
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Imperial teaspoon"){
                        val result = unitFrom * 2.76837
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Cubic foot"){
                        val result = unitFrom * 0.000578704
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