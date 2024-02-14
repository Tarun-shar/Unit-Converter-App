package com.example.unitconverterapp.UnitConvertActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.example.unitconverterapp.R
import com.example.unitconverterapp.databinding.ActivityLengthBinding

class Length : AppCompatActivity() {

    lateinit var binding: ActivityLengthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLengthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val convert_btn = findViewById<Button>(R.id.convert_btn)
        val units = resources.getStringArray(R.array.LengthUnits)

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
//                meter
                if(selectFrom.selectedItem.toString() == "Meter"){
                        val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                        if(selectTo.selectedItem.toString() == "Meter"){
                            Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                            binding.convertedDigit.text = ""
                        }
                        else if(selectTo.selectedItem.toString() == "Kilometer"){
                            val result = unitFrom/1000.0
                            binding.convertedDigit.text = "$result km"
                        }
                        else if(selectTo.selectedItem.toString() == "Centimeter"){
                            val result = unitFrom*100
                            binding.convertedDigit.text = "$result cm"
                        }
                        else if(selectTo.selectedItem.toString() == "Millimeter"){
                            val result = unitFrom*1000
                            binding.convertedDigit.text = "$result mm"
                        }
                        else if(selectTo.selectedItem.toString() == "Micrometer"){
                            val result = unitFrom*1000000
                            binding.convertedDigit.text = "$result µm"
                        }
                        else if(selectTo.selectedItem.toString() == "Nanometer"){
                            val result = unitFrom*1000000000
                            binding.convertedDigit.text = "$result nm"
                        }
                        else if(selectTo.selectedItem.toString() == "Mile"){
                            val result = unitFrom*0.0006213712
                            binding.convertedDigit.text = "$result mi"
                        }
                        else if(selectTo.selectedItem.toString() == "Yard"){
                            val result = unitFrom*1.0936132983
                            binding.convertedDigit.text = "$result yd"
                        }
                        else if(selectTo.selectedItem.toString() == "Foot"){
                            val result = unitFrom*3.280839895
                            binding.convertedDigit.text = "$result ft"
                        }
                        else if(selectTo.selectedItem.toString() == "Inch"){
                            val result = unitFrom*39.3700787402
                            binding.convertedDigit.text = "$result in"
                        }
                        else if(selectTo.selectedItem.toString() == "Nautical Mile"){
                            val result = unitFrom*0.0005399568
                            binding.convertedDigit.text = "$result nautical mile"
                        }
                        else{
                            Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                        }
                    }

//                kilometer
                else if(selectFrom.selectedItem.toString() == "Kilometer"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Kilometer"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Meter"){
                        val result = unitFrom*1000
                        binding.convertedDigit.text = "$result m"
                    }
                    else if(selectTo.selectedItem.toString() == "Centimeter"){
                        val result = unitFrom*100000
                        binding.convertedDigit.text = "$result cm"
                    }
                    else if(selectTo.selectedItem.toString() == "Millimeter"){
                        val result = unitFrom*1000000
                        binding.convertedDigit.text = "$result mm"
                    }
                    else if(selectTo.selectedItem.toString() == "Micrometer"){
                        val result = unitFrom*1000000000
                        binding.convertedDigit.text = "$result µm"
                    }
                    else if(selectTo.selectedItem.toString() == "Nanometer"){
                        val result = unitFrom*1000000000000
                        binding.convertedDigit.text = "$result nm"
                    }
                    else if(selectTo.selectedItem.toString() == "Mile"){
                        val result = unitFrom*0.6213711922
                        binding.convertedDigit.text = "$result mi"
                    }
                    else if(selectTo.selectedItem.toString() == "Yard"){
                        val result = unitFrom*1093.6132983377
                        binding.convertedDigit.text = "$result yd"
                    }
                    else if(selectTo.selectedItem.toString() == "Foot"){
                        val result = unitFrom*3280.8398950131
                        binding.convertedDigit.text = "$result ft"
                    }
                    else if(selectTo.selectedItem.toString() == "Inch"){
                        val result = unitFrom*39370.078740157
                        binding.convertedDigit.text = "$result in"
                    }
                    else if(selectTo.selectedItem.toString() == "Nautical Mile"){
                        val result = unitFrom*0.5399568035
                        binding.convertedDigit.text = "$result nautical mile"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Centimeter
                else if(selectFrom.selectedItem.toString() == "Centimeter"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Centimeter"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Meter"){
                        val result = unitFrom*0.01
                        binding.convertedDigit.text = "$result m"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilometer"){
                        val result = unitFrom*1.0E-5
                        binding.convertedDigit.text = "$result km"
                    }
                    else if(selectTo.selectedItem.toString() == "Millimeter"){
                        val result = unitFrom*10
                        binding.convertedDigit.text = "$result mm"
                    }
                    else if(selectTo.selectedItem.toString() == "Micrometer"){
                        val result = unitFrom*10000
                        binding.convertedDigit.text = "$result µm"
                    }
                    else if(selectTo.selectedItem.toString() == "Nanometer"){
                        val result = unitFrom*10000000
                        binding.convertedDigit.text = "$result nm"
                    }
                    else if(selectTo.selectedItem.toString() == "Mile"){
                        val result = unitFrom*6.2137119223733E-6
                        binding.convertedDigit.text = "$result mi"
                    }
                    else if(selectTo.selectedItem.toString() == "Yard"){
                        val result = unitFrom*0.010936133
                        binding.convertedDigit.text = "$result yd"
                    }
                    else if(selectTo.selectedItem.toString() == "Foot"){
                        val result = unitFrom*0.032808399
                        binding.convertedDigit.text = "$result ft"
                    }
                    else if(selectTo.selectedItem.toString() == "Inch"){
                        val result = unitFrom*0.3937007874
                        binding.convertedDigit.text = "$result in"
                    }
                    else if(selectTo.selectedItem.toString() == "Nautical Mile"){
                        val result = unitFrom*5.3995680345572E-6
                        binding.convertedDigit.text = "$result nautical mile"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Millimeter
                else if(selectFrom.selectedItem.toString() == "Millimeter"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Millimeter"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Meter"){
                        val result = unitFrom*0.001
                        binding.convertedDigit.text = "$result m"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilometer"){
                        val result = unitFrom*1.0E-6
                        binding.convertedDigit.text = "$result km"
                    }
                    else if(selectTo.selectedItem.toString() == "Centimeter"){
                        val result = unitFrom*0.1
                        binding.convertedDigit.text = "$result cm"
                    }
                    else if(selectTo.selectedItem.toString() == "Micrometer"){
                        val result = unitFrom*1000
                        binding.convertedDigit.text = "$result µm"
                    }
                    else if(selectTo.selectedItem.toString() == "Nanometer"){
                        val result = unitFrom*1000000
                        binding.convertedDigit.text = "$result nm"
                    }
                    else if(selectTo.selectedItem.toString() == "Mile"){
                        val result = unitFrom*6.2137119223733E-7
                        binding.convertedDigit.text = "$result mi"
                    }
                    else if(selectTo.selectedItem.toString() == "Yard"){
                        val result = unitFrom*0.0010936133
                        binding.convertedDigit.text = "$result yd"
                    }
                    else if(selectTo.selectedItem.toString() == "Foot"){
                        val result = unitFrom*0.0032808399
                        binding.convertedDigit.text = "$result ft"
                    }
                    else if(selectTo.selectedItem.toString() == "Inch"){
                        val result = unitFrom*0.0393700787
                        binding.convertedDigit.text = "$result in"
                    }
                    else if(selectTo.selectedItem.toString() == "Nautical Mile"){
                        val result = unitFrom*5.39957E-10
                        binding.convertedDigit.text = "$result nautical mile"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Micrometer
                else if(selectFrom.selectedItem.toString() == "Micrometer"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Micrometer"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Meter"){
                        val result = unitFrom*1.0E-6
                        binding.convertedDigit.text = "$result m"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilometer"){
                        val result = unitFrom*1.0E-9
                        binding.convertedDigit.text = "$result km"
                    }
                    else if(selectTo.selectedItem.toString() == "Centimeter"){
                        val result = unitFrom*0.0001
                        binding.convertedDigit.text = "$result cm"
                    }
                    else if(selectTo.selectedItem.toString() == "Millimeter"){
                        val result = unitFrom*0.001
                        binding.convertedDigit.text = "$result µm"
                    }
                    else if(selectTo.selectedItem.toString() == "Nanometer"){
                        val result = unitFrom*1000
                        binding.convertedDigit.text = "$result nm"
                    }
                    else if(selectTo.selectedItem.toString() == "Mile"){
                        val result = unitFrom*6.2137119223733E-10
                        binding.convertedDigit.text = "$result mi"
                    }
                    else if(selectTo.selectedItem.toString() == "Yard"){
                        val result = unitFrom*1.0936132983377E-6
                        binding.convertedDigit.text = "$result yd"
                    }
                    else if(selectTo.selectedItem.toString() == "Foot"){
                        val result = unitFrom*3.2808398950131E-6
                        binding.convertedDigit.text = "$result ft"
                    }
                    else if(selectTo.selectedItem.toString() == "Inch"){
                        val result = unitFrom*3.93701E-5
                        binding.convertedDigit.text = "$result in"
                    }
                    else if(selectTo.selectedItem.toString() == "Nautical Mile"){
                        val result = unitFrom*5.3995680345572E-10
                        binding.convertedDigit.text = "$result nautical mile"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Nanometer
                else if(selectFrom.selectedItem.toString() == "Nanometer"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Nanometer"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Meter"){
                        val result = unitFrom*1.0E-9
                        binding.convertedDigit.text = "$result m"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilometer"){
                        val result = unitFrom*1.0E-12
                        binding.convertedDigit.text = "$result km"
                    }
                    else if(selectTo.selectedItem.toString() == "Centimeter"){
                        val result = unitFrom*1.0E-7
                        binding.convertedDigit.text = "$result cm"
                    }
                    else if(selectTo.selectedItem.toString() == "Millimeter"){
                        val result = unitFrom*1.0E-6
                        binding.convertedDigit.text = "$result µm"
                    }
                    else if(selectTo.selectedItem.toString() == "Micrometer"){
                        val result = unitFrom*0.001
                        binding.convertedDigit.text = "$result mm"
                    }
                    else if(selectTo.selectedItem.toString() == "Mile"){
                        val result = unitFrom*6.2137119223733E-13
                        binding.convertedDigit.text = "$result mi"
                    }
                    else if(selectTo.selectedItem.toString() == "Yard"){
                        val result = unitFrom*1.0936132983377E-9
                        binding.convertedDigit.text = "$result yd"
                    }
                    else if(selectTo.selectedItem.toString() == "Foot"){
                        val result = unitFrom*3.2808398950131E-9
                        binding.convertedDigit.text = "$result ft"
                    }
                    else if(selectTo.selectedItem.toString() == "Inch"){
                        val result = unitFrom*3.9370078740157E-8
                        binding.convertedDigit.text = "$result in"
                    }
                    else if(selectTo.selectedItem.toString() == "Nautical Mile"){
                        val result = unitFrom*5.39957e-13
                        binding.convertedDigit.text = "$result nautical mile"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Mile
                else if(selectFrom.selectedItem.toString() == "Mile"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Mile"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Meter"){
                        val result = unitFrom*1609.344
                        binding.convertedDigit.text = "$result m"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilometer"){
                        val result = unitFrom*1.609344
                        binding.convertedDigit.text = "$result km"
                    }
                    else if(selectTo.selectedItem.toString() == "Centimeter"){
                        val result = unitFrom*160934.4
                        binding.convertedDigit.text = "$result cm"
                    }
                    else if(selectTo.selectedItem.toString() == "Millimeter"){
                        val result = unitFrom*1609344
                        binding.convertedDigit.text = "$result µm"
                    }
                    else if(selectTo.selectedItem.toString() == "Micrometer"){
                        val result = unitFrom*1609344000
                        binding.convertedDigit.text = "$result mm"
                    }
                    else if(selectTo.selectedItem.toString() == "Nanometer"){
                        val result = unitFrom*1609344000000
                        binding.convertedDigit.text = "$result nm"
                    }
                    else if(selectTo.selectedItem.toString() == "Yard"){
                        val result = unitFrom*1760
                        binding.convertedDigit.text = "$result yd"
                    }
                    else if(selectTo.selectedItem.toString() == "Foot"){
                        val result = unitFrom*5280
                        binding.convertedDigit.text = "$result ft"
                    }
                    else if(selectTo.selectedItem.toString() == "Inch"){
                        val result = unitFrom*63360
                        binding.convertedDigit.text = "$result in"
                    }
                    else if(selectTo.selectedItem.toString() == "Nautical Mile"){
                        val result = unitFrom*0.8689762419
                        binding.convertedDigit.text = "$result nautical mile"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Yard
                else if(selectFrom.selectedItem.toString() == "Yard"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Yard"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Meter"){
                        val result = unitFrom*0.9144
                        binding.convertedDigit.text = "$result m"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilometer"){
                        val result = unitFrom*0.0009144
                        binding.convertedDigit.text = "$result km"
                    }
                    else if(selectTo.selectedItem.toString() == "Centimeter"){
                        val result = unitFrom*91.44
                        binding.convertedDigit.text = "$result cm"
                    }
                    else if(selectTo.selectedItem.toString() == "Millimeter"){
                        val result = unitFrom*914.4
                        binding.convertedDigit.text = "$result µm"
                    }
                    else if(selectTo.selectedItem.toString() == "Micrometer"){
                        val result = unitFrom*914400
                        binding.convertedDigit.text = "$result mm"
                    }
                    else if(selectTo.selectedItem.toString() == "Nanometer"){
                        val result = unitFrom*9.144e+8
                        binding.convertedDigit.text = "$result nm"
                    }
                    else if(selectTo.selectedItem.toString() == "Mile"){
                        val result = unitFrom*0.000568182
                        binding.convertedDigit.text = "$result mi"
                    }
                    else if(selectTo.selectedItem.toString() == "Foot"){
                        val result = unitFrom*3
                        binding.convertedDigit.text = "$result ft"
                    }
                    else if(selectTo.selectedItem.toString() == "Inch"){
                        val result = unitFrom*36
                        binding.convertedDigit.text = "$result in"
                    }
                    else if(selectTo.selectedItem.toString() == "Nautical Mile"){
                        val result = unitFrom*0.000493737
                        binding.convertedDigit.text = "$result nautical mile"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                foot
                else if(selectFrom.selectedItem.toString() == "Foot"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Foot"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Meter"){
                        val result = unitFrom*0.3048
                        binding.convertedDigit.text = "$result m"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilometer"){
                        val result = unitFrom*0.0003048
                        binding.convertedDigit.text = "$result km"
                    }
                    else if(selectTo.selectedItem.toString() == "Centimeter"){
                        val result = unitFrom*30.48
                        binding.convertedDigit.text = "$result cm"
                    }
                    else if(selectTo.selectedItem.toString() == "Millimeter"){
                        val result = unitFrom*304.8
                        binding.convertedDigit.text = "$result µm"
                    }
                    else if(selectTo.selectedItem.toString() == "Micrometer"){
                        val result = unitFrom*304800
                        binding.convertedDigit.text = "$result mm"
                    }
                    else if(selectTo.selectedItem.toString() == "Nanometer"){
                        val result = unitFrom*3.048e+8
                        binding.convertedDigit.text = "$result nm"
                    }
                    else if(selectTo.selectedItem.toString() == "Mile"){
                        val result = unitFrom*0.000189394
                        binding.convertedDigit.text = "$result mi"
                    }
                    else if(selectTo.selectedItem.toString() == "Yard"){
                        val result = unitFrom*0.333333
                        binding.convertedDigit.text = "$result yd"
                    }
                    else if(selectTo.selectedItem.toString() == "Inch"){
                        val result = unitFrom*12
                        binding.convertedDigit.text = "$result in"
                    }
                    else if(selectTo.selectedItem.toString() == "Nautical Mile"){
                        val result = unitFrom*0.000164579
                        binding.convertedDigit.text = "$result nautical mile"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                inch
                else if(selectFrom.selectedItem.toString() == "Inch"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Inch"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Meter"){
                        val result = unitFrom*0.0254
                        binding.convertedDigit.text = "$result m"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilometer"){
                        val result = unitFrom*2.54e-5
                        binding.convertedDigit.text = "$result km"
                    }
                    else if(selectTo.selectedItem.toString() == "Centimeter"){
                        val result = unitFrom*2.54
                        binding.convertedDigit.text = "$result cm"
                    }
                    else if(selectTo.selectedItem.toString() == "Millimeter"){
                        val result = unitFrom*25.4
                        binding.convertedDigit.text = "$result µm"
                    }
                    else if(selectTo.selectedItem.toString() == "Micrometer"){
                        val result = unitFrom*25400
                        binding.convertedDigit.text = "$result mm"
                    }
                    else if(selectTo.selectedItem.toString() == "Nanometer"){
                        val result = unitFrom*2.54e+7
                        binding.convertedDigit.text = "$result nm"
                    }
                    else if(selectTo.selectedItem.toString() == "Mile"){
                        val result = unitFrom*1.57828e-5
                        binding.convertedDigit.text = "$result mi"
                    }
                    else if(selectTo.selectedItem.toString() == "Yard"){
                        val result = unitFrom*0.0277778
                        binding.convertedDigit.text = "$result yd"
                    }
                    else if(selectTo.selectedItem.toString() == "Foot"){
                        val result = unitFrom*0.0833333
                        binding.convertedDigit.text = "$result ft"
                    }
                    else if(selectTo.selectedItem.toString() == "Nautical Mile"){
                        val result = unitFrom*1.37149e-5
                        binding.convertedDigit.text = "$result nautical mile"
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                nautical mile
                else if(selectFrom.selectedItem.toString() == "Nautical Mile"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Nautical Mile"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Meter"){
                        val result = unitFrom*1852
                        binding.convertedDigit.text = "$result m"
                    }
                    else if(selectTo.selectedItem.toString() == "Kilometer"){
                        val result = unitFrom*1.852
                        binding.convertedDigit.text = "$result km"
                    }
                    else if(selectTo.selectedItem.toString() == "Centimeter"){
                        val result = unitFrom*185200
                        binding.convertedDigit.text = "$result cm"
                    }
                    else if(selectTo.selectedItem.toString() == "Millimeter"){
                        val result = unitFrom*1.852e+6
                        binding.convertedDigit.text = "$result µm"
                    }
                    else if(selectTo.selectedItem.toString() == "Micrometer"){
                        val result = unitFrom*1.852e+9
                        binding.convertedDigit.text = "$result mm"
                    }
                    else if(selectTo.selectedItem.toString() == "Nanometer"){
                        val result = unitFrom*1.852e+12
                        binding.convertedDigit.text = "$result nm"
                    }
                    else if(selectTo.selectedItem.toString() == "Mile"){
                        val result = unitFrom*1.15078
                        binding.convertedDigit.text = "$result mi"
                    }
                    else if(selectTo.selectedItem.toString() == "Yard"){
                        val result = unitFrom*2025.37
                        binding.convertedDigit.text = "$result yd"
                    }
                    else if(selectTo.selectedItem.toString() == "Foot"){
                        val result = unitFrom*6076.12
                        binding.convertedDigit.text = "$result ft"
                    }
                    else if(selectTo.selectedItem.toString() == "Inch"){
                        val result = unitFrom*72913.4
                        binding.convertedDigit.text = "$result in"
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
