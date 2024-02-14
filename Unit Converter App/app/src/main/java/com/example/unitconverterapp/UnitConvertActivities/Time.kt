package com.example.unitconverterapp.UnitConvertActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.example.unitconverterapp.R
import com.example.unitconverterapp.databinding.ActivityTimeBinding

class Time : AppCompatActivity() {

    lateinit var binding: ActivityTimeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTimeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val convert_btn = findViewById<Button>(R.id.convert_btn)
        val units = resources.getStringArray(R.array.TimeUnits)

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
//                Nanosecond
                if(selectFrom.selectedItem.toString() == "Nanosecond"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Nanosecond"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Microsecond"){
                        val result = unitFrom * 0.001
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Millisecond"){
                        val result = unitFrom * 1e-6
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Second"){
                        val result = unitFrom * 1e-9
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Minute"){
                        val result = unitFrom * 1.6667e-11
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Hour"){
                        val result = unitFrom * 2.7778e-13
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Day"){
                        val result = unitFrom * 1.1574e-14
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Week"){
                        val result = unitFrom * 1.6534e-15
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Month"){
                        val result = unitFrom * 3.8052e-16
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Calendar year"){
                        val result = unitFrom * 3.171e-17
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Decade"){
                        val result = unitFrom * 3.171e-18
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Century"){
                        val result = unitFrom * 3.171e-19
                        binding.convertedDigit.text = "$result"
                    }

                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Microsecond
                if(selectFrom.selectedItem.toString() == "Microsecond"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Microsecond"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Nanosecond"){
                        val result = unitFrom * 1000
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Millisecond"){
                        val result = unitFrom * 0.001
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Second"){
                        val result = unitFrom * 1e-6
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Minute"){
                        val result = unitFrom * 1.6667e-8
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Hour"){
                        val result = unitFrom * 2.7778e-10
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Day"){
                        val result = unitFrom * 1.1574e-11
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Week"){
                        val result = unitFrom * 1.6534e-12
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Month"){
                        val result = unitFrom * 3.8052e-13
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Calendar year"){
                        val result = unitFrom * 3.171e-14
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Decade"){
                        val result = unitFrom * 3.171e-15
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Century"){
                        val result = unitFrom * 3.171e-16
                        binding.convertedDigit.text = "$result"
                    }

                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Millisecond
                if(selectFrom.selectedItem.toString() == "Millisecond"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Millisecond"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Nanosecond"){
                        val result = unitFrom * 1e+6
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Microsecond"){
                        val result = unitFrom * 1000
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Second"){
                        val result = unitFrom * 0.001
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Minute"){
                        val result = unitFrom * 1.6667e-5
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Hour"){
                        val result = unitFrom * 2.7778e-7
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Day"){
                        val result = unitFrom * 1.1574e-8
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Week"){
                        val result = unitFrom * 1.6534e-9
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Month"){
                        val result = unitFrom * 3.8052e-10
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Calendar year"){
                        val result = unitFrom * 3.171e-11
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Decade"){
                        val result = unitFrom * 3.171e-12
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Century"){
                        val result = unitFrom * 3.171e-13
                        binding.convertedDigit.text = "$result"
                    }

                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Second
                if(selectFrom.selectedItem.toString() == "Second"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Second"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Nanosecond"){
                        val result = unitFrom * 1e+9
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Microsecond"){
                        val result = unitFrom * 1e+6
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Millisecond"){
                        val result = unitFrom * 1000
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Minute"){
                        val result = unitFrom * 0.0166667
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Hour"){
                        val result = unitFrom * 0.000277778
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Day"){
                        val result = unitFrom * 1.1574e-5
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Week"){
                        val result = unitFrom * 1.6534e-6
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Month"){
                        val result = unitFrom * 3.8052e-7
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Calendar year"){
                        val result = unitFrom * 3.171e-8
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Decade"){
                        val result = unitFrom * 3.171e-9
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Century"){
                        val result = unitFrom * 3.171e-10
                        binding.convertedDigit.text = "$result"
                    }

                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Minute
                if(selectFrom.selectedItem.toString() == "Minute"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Minute"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Nanosecond"){
                        val result = unitFrom * 6e+10
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Microsecond"){
                        val result = unitFrom * 6e+7
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Millisecond"){
                        val result = unitFrom * 60000
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Second"){
                        val result = unitFrom * 60
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Hour"){
                        val result = unitFrom * 0.0166667
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Day"){
                        val result = unitFrom * 0.000694444
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Week"){
                        val result = unitFrom * 9.9206e-5
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Month"){
                        val result = unitFrom * 2.2831e-5
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Calendar year"){
                        val result = unitFrom * 1.9026e-6
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Decade"){
                        val result = unitFrom * 1.9026e-7
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Century"){
                        val result = unitFrom * 1.9026e-8
                        binding.convertedDigit.text = "$result"
                    }

                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Hour
                if(selectFrom.selectedItem.toString() == "Hour"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Hour"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Nanosecond"){
                        val result = unitFrom * 3.6e+12
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Microsecond"){
                        val result = unitFrom * 3.6e+9
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Millisecond"){
                        val result = unitFrom * 3.6e+6
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Second"){
                        val result = unitFrom * 3600
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Minute"){
                        val result = unitFrom * 60
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Day"){
                        val result = unitFrom * 0.0416667
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Week"){
                        val result = unitFrom * 0.00595238
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Month"){
                        val result = unitFrom * 0.00136986
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Calendar year"){
                        val result = unitFrom * 0.000114155
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Decade"){
                        val result = unitFrom * 1.1416e-5
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Century"){
                        val result = unitFrom * 1.1416e-6
                        binding.convertedDigit.text = "$result"
                    }

                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Day
                if(selectFrom.selectedItem.toString() == "Day"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Day"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Nanosecond"){
                        val result = unitFrom * 8.64e+13
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Microsecond"){
                        val result = unitFrom * 8.64e+10
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Millisecond"){
                        val result = unitFrom * 8.64e+7
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Second"){
                        val result = unitFrom * 86400
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Minute"){
                        val result = unitFrom * 1440
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Hour"){
                        val result = unitFrom * 24
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Week"){
                        val result = unitFrom * 0.142857
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Month"){
                        val result = unitFrom * 0.0328767
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Calendar year"){
                        val result = unitFrom * 0.00273973
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Decade"){
                        val result = unitFrom * 0.000273973
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Century"){
                        val result = unitFrom * 2.7397e-5
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Week
                if(selectFrom.selectedItem.toString() == "Week"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Week"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Nanosecond"){
                        val result = unitFrom * 6.048e+14
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Microsecond"){
                        val result = unitFrom * 6.048e+11
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Millisecond"){
                        val result = unitFrom * 6.048e+8
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Second"){
                        val result = unitFrom * 604800
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Minute"){
                        val result = unitFrom * 10080
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Hour"){
                        val result = unitFrom * 168
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Day"){
                        val result = unitFrom * 7
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Month"){
                        val result = unitFrom * 0.230137
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Calendar year"){
                        val result = unitFrom * 0.0191781
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Decade"){
                        val result = unitFrom * 0.00191781
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Century"){
                        val result = unitFrom * 0.000191781
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Month
                if(selectFrom.selectedItem.toString() == "Month"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Month"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Nanosecond"){
                        val result = unitFrom * 2.628e+15
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Microsecond"){
                        val result = unitFrom * 2.628e+12
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Millisecond"){
                        val result = unitFrom * 2.628e+9
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Second"){
                        val result = unitFrom * 2.628e+6
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Minute"){
                        val result = unitFrom * 43800
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Hour"){
                        val result = unitFrom * 730.001
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Day"){
                        val result = unitFrom * 30.4167
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Week"){
                        val result = unitFrom * 4.34524
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Calendar year"){
                        val result = unitFrom * 0.0833334
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Decade"){
                        val result = unitFrom * 0.00833334
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Century"){
                        val result = unitFrom * 0.000833334
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Calendar year
                if(selectFrom.selectedItem.toString() == "Calendar year"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Calendar year"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Nanosecond"){
                        val result = unitFrom * 3.154e+16
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Microsecond"){
                        val result = unitFrom * 3.154e+13
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Millisecond"){
                        val result = unitFrom * 3.154e+10
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Second"){
                        val result = unitFrom * 3.154e+7
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Minute"){
                        val result = unitFrom * 525600
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Hour"){
                        val result = unitFrom * 8760
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Day"){
                        val result = unitFrom * 365
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Week"){
                        val result = unitFrom * 52.1429
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Month"){
                        val result = unitFrom * 12
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Decade"){
                        val result = unitFrom * 0.1
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Century"){
                        val result = unitFrom * 0.01
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Decade
                if(selectFrom.selectedItem.toString() == "Decade"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Decade"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Nanosecond"){
                        val result = unitFrom * 3.154e+17
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Microsecond"){
                        val result = unitFrom * 3.154e+14
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Millisecond"){
                        val result = unitFrom * 3.154e+11
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Second"){
                        val result = unitFrom * 3.154e+8
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Minute"){
                        val result = unitFrom * 5.256e+6
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Hour"){
                        val result = unitFrom * 87600
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Day"){
                        val result = unitFrom * 3650
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Week"){
                        val result = unitFrom * 521.429
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Month"){
                        val result = unitFrom * 120
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Calendar year"){
                        val result = unitFrom * 10
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Century"){
                        val result = unitFrom * 0.1
                        binding.convertedDigit.text = "$result"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Century
                if(selectFrom.selectedItem.toString() == "Century"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Century"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Nanosecond"){
                        val result = unitFrom * 3.154e+18
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Microsecond"){
                        val result = unitFrom * 3.154e+15
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Millisecond"){
                        val result = unitFrom * 3.154e+12
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Second"){
                        val result = unitFrom * 3.154e+9
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Minute"){
                        val result = unitFrom * 5.256e+7
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Hour"){
                        val result = unitFrom * 876000
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Day"){
                        val result = unitFrom * 36500
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Week"){
                        val result = unitFrom * 5214.29
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Month"){
                        val result = unitFrom * 1200
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Calendar year"){
                        val result = unitFrom * 100
                        binding.convertedDigit.text = "$result"
                    }
                    else if(selectTo.selectedItem.toString() == "Decade"){
                        val result = unitFrom * 10
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