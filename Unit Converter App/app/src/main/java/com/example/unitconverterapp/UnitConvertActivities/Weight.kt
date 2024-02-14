package com.example.unitconverterapp.UnitConvertActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.example.unitconverterapp.R
import com.example.unitconverterapp.databinding.ActivitySpeedBinding
import com.example.unitconverterapp.databinding.ActivityWeightBinding

class Weight : AppCompatActivity() {

    lateinit var binding: ActivityWeightBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeightBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val convert_btn = findViewById<Button>(R.id.convert_btn)
        val units = resources.getStringArray(R.array.WeightUnits)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, units)

        val selectFrom = findViewById<Spinner>(R.id.select_from)
        val selectTo = findViewById<Spinner>(R.id.select_to)
        if(selectFrom != null){
            selectFrom.adapter = adapter
        }
        if (selectTo != null){
            selectTo.adapter = adapter
        }

        convert_btn.setOnClickListener {
            try{
//                Kilogram
                if(selectFrom.selectedItem.toString() == "Kilogram"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Kilogram"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Gram"){
                        val result = unitFrom * 1000
                        binding.convertedDigit.text = "$result g"
                    }
                    else if(selectTo.selectedItem.toString() == "Milligram"){
                        val result = unitFrom * 1000000
                        binding.convertedDigit.text = "$result mg"
                    }
                    else if(selectTo.selectedItem.toString() == "Metric Ton"){
                        val result = unitFrom * 0.001
                        binding.convertedDigit.text = "$result t"
                    }
                    else if(selectTo.selectedItem.toString() == "Long Ton"){
                        val result = unitFrom * 0.0009842065
                        binding.convertedDigit.text = "$result lt"
                    }
                    else if(selectTo.selectedItem.toString() == "Short Ton"){
                        val result = unitFrom * 0.0011023113
                        binding.convertedDigit.text = "$result T"
                    }
                    else if(selectTo.selectedItem.toString() == "Pound"){
                        val result = unitFrom * 2.2046226218
                        binding.convertedDigit.text = "$result lbs"
                    }
                    else if(selectTo.selectedItem.toString() == "Ounce"){
                        val result = unitFrom * 35.2739619496
                        binding.convertedDigit.text = "$result oz"
                    }
                    else if(selectTo.selectedItem.toString() == "Carat"){
                        val result = unitFrom * 5000
                        binding.convertedDigit.text = "$result ct"
                    }
                    else if(selectTo.selectedItem.toString() == "Atomic Mass Unit"){
                        val result = unitFrom * 6.0221366516752E+26
                        binding.convertedDigit.text = "$result u"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Gram
                if(selectFrom.selectedItem.toString() == "Gram"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Gram"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Kilogram"){
                        val result = unitFrom * 0.001
                        binding.convertedDigit.text = "$result kg"
                    }
                    else if(selectTo.selectedItem.toString() == "Milligram"){
                        val result = unitFrom * 1000
                        binding.convertedDigit.text = "$result mg"
                    }
                    else if(selectTo.selectedItem.toString() == "Metric Ton"){
                        val result = unitFrom * 1.0E-6
                        binding.convertedDigit.text = "$result t"
                    }
                    else if(selectTo.selectedItem.toString() == "Long Ton"){
                        val result = unitFrom * 9.8420652761106E-7
                        binding.convertedDigit.text = "$result lt"
                    }
                    else if(selectTo.selectedItem.toString() == "Short Ton"){
                        val result = unitFrom * 1.1023113109244E-6
                        binding.convertedDigit.text = "$result T"
                    }
                    else if(selectTo.selectedItem.toString() == "Pound"){
                        val result = unitFrom * 0.00220462
                        binding.convertedDigit.text = "$result lbs"
                    }
                    else if(selectTo.selectedItem.toString() == "Ounce"){
                        val result = unitFrom * 0.035274
                        binding.convertedDigit.text = "$result oz"
                    }
                    else if(selectTo.selectedItem.toString() == "Carat"){
                        val result = unitFrom * 5
                        binding.convertedDigit.text = "$result ct"
                    }
                    else if(selectTo.selectedItem.toString() == "Atomic Mass Unit"){
                        val result = unitFrom * 6.0221366516752E+23
                        binding.convertedDigit.text = "$result u"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//               Milligram
                if(selectFrom.selectedItem.toString() == "Milligram"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Milligram"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Kilogram"){
                        val result = unitFrom * 1e-6
                        binding.convertedDigit.text = "$result kg"
                    }
                    else if(selectTo.selectedItem.toString() == "Gram"){
                        val result = unitFrom * 0.001
                        binding.convertedDigit.text = "$result g"
                    }
                    else if(selectTo.selectedItem.toString() == "Metric Ton"){
                        val result = unitFrom * 1.0E-9
                        binding.convertedDigit.text = "$result t"
                    }
                    else if(selectTo.selectedItem.toString() == "Long Ton"){
                        val result = unitFrom * 9.8420652761106E-10
                        binding.convertedDigit.text = "$result lt"
                    }
                    else if(selectTo.selectedItem.toString() == "Short Ton"){
                        val result = unitFrom * 1.1023113109244E-9
                        binding.convertedDigit.text = "$result T"
                    }
                    else if(selectTo.selectedItem.toString() == "Pound"){
                        val result = unitFrom * 2.2046e-6
                        binding.convertedDigit.text = "$result lbs"
                    }
                    else if(selectTo.selectedItem.toString() == "Ounce"){
                        val result = unitFrom * 3.5274e-5
                        binding.convertedDigit.text = "$result oz"
                    }
                    else if(selectTo.selectedItem.toString() == "Carat"){
                        val result = unitFrom * 0.005
                        binding.convertedDigit.text = "$result ct"
                    }
                    else if(selectTo.selectedItem.toString() == "Atomic Mass Unit"){
                        val result = unitFrom * 6.0221366516752E+20
                        binding.convertedDigit.text = "$result u"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Metric Ton
                if(selectFrom.selectedItem.toString() == "Metric Ton"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Metric Ton"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Kilogram"){
                        val result = unitFrom * 1000
                        binding.convertedDigit.text = "$result kg"
                    }
                    else if(selectTo.selectedItem.toString() == "Gram"){
                        val result = unitFrom * 1000000
                        binding.convertedDigit.text = "$result g"
                    }
                    else if(selectTo.selectedItem.toString() == "Milligram"){
                        val result = unitFrom * 1e+9
                        binding.convertedDigit.text = "$result mg"
                    }
                    else if(selectTo.selectedItem.toString() == "Long Ton"){
                        val result = unitFrom * 0.9842065276
                        binding.convertedDigit.text = "$result lt"
                    }
                    else if(selectTo.selectedItem.toString() == "Short Ton"){
                        val result = unitFrom * 1.1023113109
                        binding.convertedDigit.text = "$result T"
                    }
                    else if(selectTo.selectedItem.toString() == "Pound"){
                        val result = unitFrom * 2204.62
                        binding.convertedDigit.text = "$result lbs"
                    }
                    else if(selectTo.selectedItem.toString() == "Ounce"){
                        val result = unitFrom * 35274
                        binding.convertedDigit.text = "$result oz"
                    }
                    else if(selectTo.selectedItem.toString() == "Carat"){
                        val result = unitFrom * 5000000
                        binding.convertedDigit.text = "$result ct"
                    }
                    else if(selectTo.selectedItem.toString() == "Atomic Mass Unit"){
                        val result = unitFrom * 6.0221366516752E+29
                        binding.convertedDigit.text = "$result u"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Long Ton
                if(selectFrom.selectedItem.toString() == "Long Ton"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Long Ton"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Kilogram"){
                        val result = unitFrom * 1016.0469088
                        binding.convertedDigit.text = "$result kg"
                    }
                    else if(selectTo.selectedItem.toString() == "Gram"){
                        val result = unitFrom * 1016046.9088
                        binding.convertedDigit.text = "$result g"
                    }
                    else if(selectTo.selectedItem.toString() == "Milligram"){
                        val result = unitFrom * 1016046908.8
                        binding.convertedDigit.text = "$result mg"
                    }
                    else if(selectTo.selectedItem.toString() == "Metric Ton"){
                        val result = unitFrom * 1.0160469088
                        binding.convertedDigit.text = "$result t"
                    }
                    else if(selectTo.selectedItem.toString() == "Short Ton"){
                        val result = unitFrom * 1.12
                        binding.convertedDigit.text = "$result T"
                    }
                    else if(selectTo.selectedItem.toString() == "Pound"){
                        val result = unitFrom * 2240
                        binding.convertedDigit.text = "$result lbs"
                    }
                    else if(selectTo.selectedItem.toString() == "Ounce"){
                        val result = unitFrom * 35840
                        binding.convertedDigit.text = "$result oz"
                    }
                    else if(selectTo.selectedItem.toString() == "Carat"){
                        val result = unitFrom * 5080234.544
                        binding.convertedDigit.text = "$result ct"
                    }
                    else if(selectTo.selectedItem.toString() == "Atomic Mass Unit"){
                        val result = unitFrom * 6.1187733293058E+29
                        binding.convertedDigit.text = "$result u"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Short Ton
                if(selectFrom.selectedItem.toString() == "Short Ton"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Short Ton"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Kilogram"){
                        val result = unitFrom * 907.18474
                        binding.convertedDigit.text = "$result kg"
                    }
                    else if(selectTo.selectedItem.toString() == "Gram"){
                        val result = unitFrom * 907184.74
                        binding.convertedDigit.text = "$result g"
                    }
                    else if(selectTo.selectedItem.toString() == "Milligram"){
                        val result = unitFrom * 907184740
                        binding.convertedDigit.text = "$result mg"
                    }
                    else if(selectTo.selectedItem.toString() == "Metric Ton"){
                        val result = unitFrom * 0.90718474
                        binding.convertedDigit.text = "$result t"
                    }
                    else if(selectTo.selectedItem.toString() == "Long Ton"){
                        val result = unitFrom * 0.8928571429
                        binding.convertedDigit.text = "$result lt"
                    }
                    else if(selectTo.selectedItem.toString() == "Pound"){
                        val result = unitFrom * 2000
                        binding.convertedDigit.text = "$result lbs"
                    }
                    else if(selectTo.selectedItem.toString() == "Ounce"){
                        val result = unitFrom * 32000
                        binding.convertedDigit.text = "$result oz"
                    }
                    else if(selectTo.selectedItem.toString() == "Carat"){
                        val result = unitFrom * 4535923.7
                        binding.convertedDigit.text = "$result ct"
                    }
                    else if(selectTo.selectedItem.toString() == "Atomic Mass Unit"){
                        val result = unitFrom * 5.4631904725944E+29
                        binding.convertedDigit.text = "$result u"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Pound
                if(selectFrom.selectedItem.toString() == "Pound"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Pound"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Kilogram"){
                        val result = unitFrom * 0.45359237
                        binding.convertedDigit.text = "$result kg"
                    }
                    else if(selectTo.selectedItem.toString() == "Gram"){
                        val result = unitFrom * 453.59237
                        binding.convertedDigit.text = "$result g"
                    }
                    else if(selectTo.selectedItem.toString() == "Milligram"){
                        val result = unitFrom * 453592.37
                        binding.convertedDigit.text = "$result mg"
                    }
                    else if(selectTo.selectedItem.toString() == "Metric Ton"){
                        val result = unitFrom * 0.000453592
                        binding.convertedDigit.text = "$result t"
                    }
                    else if(selectTo.selectedItem.toString() == "Long Ton"){
                        val result = unitFrom * 0.0004464286
                        binding.convertedDigit.text = "$result lt"
                    }
                    else if(selectTo.selectedItem.toString() == "Short Ton"){
                        val result = unitFrom * 0.0005
                        binding.convertedDigit.text = "$result T"
                    }
                    else if(selectTo.selectedItem.toString() == "Ounce"){
                        val result = unitFrom * 16
                        binding.convertedDigit.text = "$result oz"
                    }
                    else if(selectTo.selectedItem.toString() == "Carat"){
                        val result = unitFrom * 2267.96185
                        binding.convertedDigit.text = "$result ct"
                    }
                    else if(selectTo.selectedItem.toString() == "Atomic Mass Unit"){
                        val result = unitFrom * 2.7315952362972E+26
                        binding.convertedDigit.text = "$result u"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//               Ounce
                if(selectFrom.selectedItem.toString() == "Ounce"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Ounce"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Kilogram"){
                        val result = unitFrom * 0.0283495
                        binding.convertedDigit.text = "$result kg"
                    }
                    else if(selectTo.selectedItem.toString() == "Gram"){
                        val result = unitFrom * 28.349523125
                        binding.convertedDigit.text = "$result g"
                    }
                    else if(selectTo.selectedItem.toString() == "Milligram"){
                        val result = unitFrom * 28349.523125
                        binding.convertedDigit.text = "$result mg"
                    }
                    else if(selectTo.selectedItem.toString() == "Metric Ton"){
                        val result = unitFrom * 2.83495E-5
                        binding.convertedDigit.text = "$result t"
                    }
                    else if(selectTo.selectedItem.toString() == "Long Ton"){
                        val result = unitFrom * 2.79018E-5
                        binding.convertedDigit.text = "$result lt"
                    }
                    else if(selectTo.selectedItem.toString() == "Short Ton"){
                        val result = unitFrom * 3.125E-5
                        binding.convertedDigit.text = "$result T"
                    }
                    else if(selectTo.selectedItem.toString() == "Pound"){
                        val result = unitFrom * 0.0625
                        binding.convertedDigit.text = "$result lbs"
                    }
                    else if(selectTo.selectedItem.toString() == "Carat"){
                        val result = unitFrom * 141.747615625
                        binding.convertedDigit.text = "$result ct"
                    }
                    else if(selectTo.selectedItem.toString() == "Atomic Mass Unit"){
                        val result = unitFrom * 1.7072470226858E+25
                        binding.convertedDigit.text = "$result u"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//               Carat
                if(selectFrom.selectedItem.toString() == "Carat"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Carat"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Kilogram"){
                        val result = unitFrom * 0.2
                        binding.convertedDigit.text = "$result kg"
                    }
                    else if(selectTo.selectedItem.toString() == "Gram"){
                        val result = unitFrom * 0.2
                        binding.convertedDigit.text = "$result g"
                    }
                    else if(selectTo.selectedItem.toString() == "Milligram"){
                        val result = unitFrom * 200
                        binding.convertedDigit.text = "$result mg"
                    }
                    else if(selectTo.selectedItem.toString() == "Metric Ton"){
                        val result = unitFrom * 2.0E-7
                        binding.convertedDigit.text = "$result t"
                    }
                    else if(selectTo.selectedItem.toString() == "Long Ton"){
                        val result = unitFrom * 1.9684130552221E-7
                        binding.convertedDigit.text = "$result lt"
                    }
                    else if(selectTo.selectedItem.toString() == "Short Ton"){
                        val result = unitFrom * 2.2046226218488E-7
                        binding.convertedDigit.text = "$result T"
                    }
                    else if(selectTo.selectedItem.toString() == "Pound"){
                        val result = unitFrom * 0.0004409245
                        binding.convertedDigit.text = "$result lbs"
                    }
                    else if(selectTo.selectedItem.toString() == "Ounce"){
                        val result = unitFrom * 0.0070547924
                        binding.convertedDigit.text = "$result oz"
                    }
                    else if(selectTo.selectedItem.toString() == "Atomic Mass Unit"){
                        val result = unitFrom * 1.204427330335E+23
                        binding.convertedDigit.text = "$result u"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//               Atomic Mass Unit
                if(selectFrom.selectedItem.toString() == "Atomic Mass Unit"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Atomic Mass Unit"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Kilogram"){
                        val result = unitFrom * 1.6605402E-27
                        binding.convertedDigit.text = "$result kg"
                    }
                    else if(selectTo.selectedItem.toString() == "Gram"){
                        val result = unitFrom * 1.6605402E-24
                        binding.convertedDigit.text = "$result g"
                    }
                    else if(selectTo.selectedItem.toString() == "Milligram"){
                        val result = unitFrom * 1.6605402E-21
                        binding.convertedDigit.text = "$result mg"
                    }
                    else if(selectTo.selectedItem.toString() == "Metric Ton"){
                        val result = unitFrom * 1.6605402E-30
                        binding.convertedDigit.text = "$result t"
                    }
                    else if(selectTo.selectedItem.toString() == "Long Ton"){
                        val result = unitFrom * 1.6343145042006E-30
                        binding.convertedDigit.text = "$result lt"
                    }
                    else if(selectTo.selectedItem.toString() == "Short Ton"){
                        val result = unitFrom * 1.8304322447046E-30
                        binding.convertedDigit.text = "$result T"
                    }
                    else if(selectTo.selectedItem.toString() == "Pound"){
                        val result = unitFrom * 3.6608644894093E-27
                        binding.convertedDigit.text = "$result lbs"
                    }
                    else if(selectTo.selectedItem.toString() == "Ounce"){
                        val result = unitFrom * 5.8573831830548E-26
                        binding.convertedDigit.text = "$result oz"
                    }
                    else if(selectTo.selectedItem.toString() == "Carat"){
                        val result = unitFrom * 8.3027009999999E-24
                        binding.convertedDigit.text = "$result ct"
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