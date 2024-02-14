package com.example.unitconverterapp.UnitConvertActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.example.unitconverterapp.R
import com.example.unitconverterapp.databinding.ActivityPlanAngleBinding

class PlanAngle : AppCompatActivity() {

    lateinit var binding: ActivityPlanAngleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlanAngleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val convert_btn  = findViewById<Button>(R.id.convert_btn)
        val units = resources.getStringArray(R.array.PlaneAngleUnits)

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
//                Arcsecond
                if(selectFrom.selectedItem.toString() == "Arcsecond"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Arcsecond"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Degree"){
                        val result = unitFrom * 0.000277778
                        binding.convertedDigit.text = "$result deg"
                    }
                    else if(selectTo.selectedItem.toString() == "Gradian"){
                        val result = unitFrom * 0.00030864197530864197
                        binding.convertedDigit.text = "$result grad"
                    }
                    else if(selectTo.selectedItem.toString() == "Milliradian"){
                        val result = unitFrom * 0.004848
                        binding.convertedDigit.text = "$result mrad"
                    }
                    else if(selectTo.selectedItem.toString() == "Minute of arc"){
                        val result = unitFrom * 0.0166667
                        binding.convertedDigit.text = "$result arcmin"
                    }
                    else if(selectTo.selectedItem.toString() == "Radian"){
                        val result = unitFrom * 4.8481E-6
                        binding.convertedDigit.text = "$result rad"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Degree
                else if(selectFrom.selectedItem.toString() == "Degree"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Degree"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Arcsecond"){
                        val result = unitFrom * 3600
                        binding.convertedDigit.text = "$result arcsec"
                    }
                    else if(selectTo.selectedItem.toString() == "Gradian"){
                        val result = unitFrom * 1.11111
                        binding.convertedDigit.text = "$result grad"
                    }
                    else if(selectTo.selectedItem.toString() == "Milliradian"){
                        val result = unitFrom * 17.4533
                        binding.convertedDigit.text = "$result mrad"
                    }
                    else if(selectTo.selectedItem.toString() == "Minute of arc"){
                        val result = unitFrom * 60
                        binding.convertedDigit.text = "$result arcmin"
                    }
                    else if(selectTo.selectedItem.toString() == "Radian"){
                        val result = unitFrom * 0.0174533
                        binding.convertedDigit.text = "$result rad"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Gradian
                else if(selectFrom.selectedItem.toString() == "Gradian"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Gradian"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Arcsecond"){
                        val result = unitFrom * 3240
                        binding.convertedDigit.text = "$result arcsec"
                    }
                    else if(selectTo.selectedItem.toString() == "Degree"){
                        val result = unitFrom * 0.9
                        binding.convertedDigit.text = "$result deg"
                    }
                    else if(selectTo.selectedItem.toString() == "Milliradian"){
                        val result = unitFrom * 15.708
                        binding.convertedDigit.text = "$result mrad"
                    }
                    else if(selectTo.selectedItem.toString() == "Minute of arc"){
                        val result = unitFrom * 54
                        binding.convertedDigit.text = "$result arcmin"
                    }
                    else if(selectTo.selectedItem.toString() == "Radian"){
                        val result = unitFrom * 0.015708
                        binding.convertedDigit.text = "$result rad"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Milliradian
                else if(selectFrom.selectedItem.toString() == "Milliradian"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Milliradian"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Arcsecond"){
                        val result = unitFrom * 206.265
                        binding.convertedDigit.text = "$result arcsec"
                    }
                    else if(selectTo.selectedItem.toString() == "Degree"){
                        val result = unitFrom * 0.0572958
                        binding.convertedDigit.text = "$result deg"
                    }
                    else if(selectTo.selectedItem.toString() == "Gradian"){
                        val result = unitFrom * 0.063662
                        binding.convertedDigit.text = "$result grad"
                    }
                    else if(selectTo.selectedItem.toString() == "Minute of arc"){
                        val result = unitFrom * 3.43775
                        binding.convertedDigit.text = "$result arcmin"
                    }
                    else if(selectTo.selectedItem.toString() == "Radian"){
                        val result = unitFrom * 0.001
                        binding.convertedDigit.text = "$result rad"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Minute of arc
                else if(selectFrom.selectedItem.toString() == "Minute of arc"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Minute of arc"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Arcsecond"){
                        val result = unitFrom * 60
                        binding.convertedDigit.text = "$result arcsec"
                    }
                    else if(selectTo.selectedItem.toString() == "Degree"){
                        val result = unitFrom * 0.0166667
                        binding.convertedDigit.text = "$result deg"
                    }
                    else if(selectTo.selectedItem.toString() == "Gradian"){
                        val result = unitFrom * 0.0185185
                        binding.convertedDigit.text = "$result grad"
                    }
                    else if(selectTo.selectedItem.toString() == "Milliradian"){
                        val result = unitFrom * 0.290888
                        binding.convertedDigit.text = "$result mrad"
                    }
                    else if(selectTo.selectedItem.toString() == "Radian"){
                        val result = unitFrom * 0.000290888
                        binding.convertedDigit.text = "$result rad"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Radian
                else if(selectFrom.selectedItem.toString() == "Radian"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Radian"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Arcsecond"){
                        val result = unitFrom * 206265
                        binding.convertedDigit.text = "$result arcsec"
                    }
                    else if(selectTo.selectedItem.toString() == "Degree"){
                        val result = unitFrom * 57.2958
                        binding.convertedDigit.text = "$result deg"
                    }
                    else if(selectTo.selectedItem.toString() == "Gradian"){
                        val result = unitFrom * 63.662
                        binding.convertedDigit.text = "$result grad"
                    }
                    else if(selectTo.selectedItem.toString() == "Milliradian"){
                        val result = unitFrom * 1000
                        binding.convertedDigit.text = "$result mrad"
                    }
                    else if(selectTo.selectedItem.toString() == "Minute of arc"){
                        val result = unitFrom * 3437.75
                        binding.convertedDigit.text = "$result arcmin"
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
