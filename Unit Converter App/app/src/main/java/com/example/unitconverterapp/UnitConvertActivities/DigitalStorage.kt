package com.example.unitconverterapp.UnitConvertActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.example.unitconverterapp.R
import com.example.unitconverterapp.Room.UnitDao
import com.example.unitconverterapp.Room.UnitDatabase
import com.example.unitconverterapp.Room.UnitEntity
import com.example.unitconverterapp.databinding.ActivityDigitalStorageBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class DigitalStorage : AppCompatActivity() {

    lateinit var binding: ActivityDigitalStorageBinding
    lateinit var database: UnitDatabase
    lateinit var unitDao: UnitDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDigitalStorageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val convert_btn = findViewById<Button>(R.id.convert_btn)
        val units = resources.getStringArray(R.array.DigitalStorageUnits)

        val selectFrom = findViewById<Spinner>(R.id.select_from)
        val selectTo = findViewById<Spinner>(R.id.select_to)

        //        Room
        database = UnitDatabase.getDatabase(this)
        unitDao = database.unitDao()

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
//                Bit
                if(selectFrom.selectedItem.toString() == "Bit"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Bit"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobit"){
                        val result = unitFrom * 0.001
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.convertedDigit.text = "$result kb"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kibibit"){
                        val result = unitFrom * 0.000976563
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.convertedDigit.text = "$result Kib"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabit"){
                        val result = unitFrom * 1e-6
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.convertedDigit.text = "$result Mb"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibit"){
                        val result = unitFrom * 9.5367e-7
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result Mib"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabit"){
                        val result = unitFrom * 1e-9
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result Gb"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibit"){
                        val result = unitFrom * 9.3132e-10
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result Gib"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabit"){
                        val result = unitFrom * 1e-12
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result Tb"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibit"){
                        val result = unitFrom * 9.0949e-13
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result Tib"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabit"){
                        val result = unitFrom * 1e-15
                        binding.convertedDigit.text = "$result Pb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibit"){
                        val result = unitFrom * 8.8818e-16
                        binding.convertedDigit.text = "$result Pib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Byte"){
                        val result = unitFrom * 0.125
                        binding.convertedDigit.text = "$result B"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobyte"){
                        val result = unitFrom * 0.000125
                        binding.convertedDigit.text = "$result kB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kibibyte"){
                        val result = unitFrom * 0.00012207
                        binding.convertedDigit.text = "$result KiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabyte"){
                        val result = unitFrom * 1.25e-7
                        binding.convertedDigit.text = "$result MB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibyte"){
                        val result = unitFrom * 1.1921e-7
                        binding.convertedDigit.text = "$result MiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabyte"){
                        val result = unitFrom * 1.25e-10
                        binding.convertedDigit.text = "$result GB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibyte"){
                        val result = unitFrom * 1.1642e-10
                        binding.convertedDigit.text = "$result GiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabyte"){
                        val result = unitFrom * 1.25e-13
                        binding.convertedDigit.text = "$result TB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibyte"){
                        val result = unitFrom * 1.1369e-13
                        binding.convertedDigit.text = "$result TiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabyte"){
                        val result = unitFrom * 1.25e-16
                        binding.convertedDigit.text = "$result PB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibyte"){
                        val result = unitFrom * 1.1102e-16
                        binding.convertedDigit.text = "$result PiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Kilobit
                if(selectFrom.selectedItem.toString() == "Kilobit"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Kilobit"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bit"){
                        val result = unitFrom * 1000
                        binding.convertedDigit.text = "$result bit"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kibibit"){
                        val result = unitFrom * 0.976563
                        binding.convertedDigit.text = "$result Kib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabit"){
                        val result = unitFrom * 0.001
                        binding.convertedDigit.text = "$result Mb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibit"){
                        val result = unitFrom * 0.000953674
                        binding.convertedDigit.text = "$result Mib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabit"){
                        val result = unitFrom * 1e-6
                        binding.convertedDigit.text = "$result Gb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibit"){
                        val result = unitFrom * 9.3132e-7
                        binding.convertedDigit.text = "$result Gib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabit"){
                        val result = unitFrom * 1e-9
                        binding.convertedDigit.text = "$result Tb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibit"){
                        val result = unitFrom * 9.0949e-10
                        binding.convertedDigit.text = "$result Tib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabit"){
                        val result = unitFrom * 1e-12
                        binding.convertedDigit.text = "$result Pb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibit"){
                        val result = unitFrom * 8.8818e-13
                        binding.convertedDigit.text = "$result Pib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Byte"){
                        val result = unitFrom * 125
                        binding.convertedDigit.text = "$result B"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobyte"){
                        val result = unitFrom * 0.125
                        binding.convertedDigit.text = "$result kB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kibibyte"){
                        val result = unitFrom * 0.12207
                        binding.convertedDigit.text = "$result KiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabyte"){
                        val result = unitFrom * 0.000125
                        binding.convertedDigit.text = "$result MB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibyte"){
                        val result = unitFrom * 0.000119209
                        binding.convertedDigit.text = "$result MiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabyte"){
                        val result = unitFrom * 1.25e-7
                        binding.convertedDigit.text = "$result GB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibyte"){
                        val result = unitFrom * 1.1642e-7
                        binding.convertedDigit.text = "$result GiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabyte"){
                        val result = unitFrom * 1.25e-10
                        binding.convertedDigit.text = "$result TB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibyte"){
                        val result = unitFrom * 1.1369e-10
                        binding.convertedDigit.text = "$result TiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabyte"){
                        val result = unitFrom * 1.25e-13
                        binding.convertedDigit.text = "$result PB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibyte"){
                        val result = unitFrom * 1.1102e-13
                        binding.convertedDigit.text = "$result PiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                kibibit
                if(selectFrom.selectedItem.toString() == "kibibit"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "kibibit"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bit"){
                        val result = unitFrom * 1024
                        binding.convertedDigit.text = "$result bit"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobit"){
                        val result = unitFrom * 1.024
                        binding.convertedDigit.text = "$result kb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabit"){
                        val result = unitFrom * 0.001024
                        binding.convertedDigit.text = "$result Mb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibit"){
                        val result = unitFrom * 0.000976563
                        binding.convertedDigit.text = "$result Mib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabit"){
                        val result = unitFrom * 1.024e-6
                        binding.convertedDigit.text = "$result Gb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibit"){
                        val result = unitFrom * 9.5367e-7
                        binding.convertedDigit.text = "$result Gib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabit"){
                        val result = unitFrom * 1.024e-9
                        binding.convertedDigit.text = "$result Tb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibit"){
                        val result = unitFrom * 9.3132e-10
                        binding.convertedDigit.text = "$result Tib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabit"){
                        val result = unitFrom * 1.024e-12
                        binding.convertedDigit.text = "$result Pb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibit"){
                        val result = unitFrom * 9.0949e-13
                        binding.convertedDigit.text = "$result Pib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Byte"){
                        val result = unitFrom * 128
                        binding.convertedDigit.text = "$result B"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobyte"){
                        val result = unitFrom * 0.128
                        binding.convertedDigit.text = "$result kB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kibibyte"){
                        val result = unitFrom * 0.125
                        binding.convertedDigit.text = "$result KiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabyte"){
                        val result = unitFrom * 0.000128
                        binding.convertedDigit.text = "$result MB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibyte"){
                        val result = unitFrom * 0.00012207
                        binding.convertedDigit.text = "$result MiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabyte"){
                        val result = unitFrom * 1.28e-7
                        binding.convertedDigit.text = "$result GB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibyte"){
                        val result = unitFrom * 1.1921e-7
                        binding.convertedDigit.text = "$result GiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabyte"){
                        val result = unitFrom * 1.28e-10
                        binding.convertedDigit.text = "$result TB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibyte"){
                        val result = unitFrom * 1.1642e-10
                        binding.convertedDigit.text = "$result TiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabyte"){
                        val result = unitFrom * 1.28e-13
                        binding.convertedDigit.text = "$result PB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibyte"){
                        val result = unitFrom * 1.1369e-13
                        binding.convertedDigit.text = "$result PiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Megabit
                if(selectFrom.selectedItem.toString() == "Megabit"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Megabit"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bit"){
                        val result = unitFrom * 1e+6
                        binding.convertedDigit.text = "$result bit"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobit"){
                        val result = unitFrom * 1000
                        binding.convertedDigit.text = "$result kb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "kibibit"){
                        val result = unitFrom * 976.563
                        binding.convertedDigit.text = "$result Kib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibit"){
                        val result = unitFrom * 0.953674
                        binding.convertedDigit.text = "$result Mib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabit"){
                        val result = unitFrom * 0.001
                        binding.convertedDigit.text = "$result Gb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibit"){
                        val result = unitFrom * 0.000931323
                        binding.convertedDigit.text = "$result Gib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabit"){
                        val result = unitFrom * 1e-6
                        binding.convertedDigit.text = "$result Tb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibit"){
                        val result = unitFrom * 9.0949e-7
                        binding.convertedDigit.text = "$result Tib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabit"){
                        val result = unitFrom * 1e-9
                        binding.convertedDigit.text = "$result Pb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()

                    }
                    else if(selectTo.selectedItem.toString() == "Pebibit"){
                        val result = unitFrom * 8.8818e-10
                        binding.convertedDigit.text = "$result Pib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Byte"){
                        val result = unitFrom * 125000
                        binding.convertedDigit.text = "$result B"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobyte"){
                        val result = unitFrom * 125
                        binding.convertedDigit.text = "$result kB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kibibyte"){
                        val result = unitFrom * 122.07
                        binding.convertedDigit.text = "$result KiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabyte"){
                        val result = unitFrom * 0.125
                        binding.convertedDigit.text = "$result MB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibyte"){
                        val result = unitFrom * 0.119209
                        binding.convertedDigit.text = "$result MiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabyte"){
                        val result = unitFrom * 0.000125
                        binding.convertedDigit.text = "$result GB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibyte"){
                        val result = unitFrom * 0.000116415
                        binding.convertedDigit.text = "$result GiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabyte"){
                        val result = unitFrom * 1.25e-7
                        binding.convertedDigit.text = "$result TB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibyte"){
                        val result = unitFrom * 1.1369e-7
                        binding.convertedDigit.text = "$result TiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabyte"){
                        val result = unitFrom * 1.25e-10
                        binding.convertedDigit.text = "$result PB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibyte"){
                        val result = unitFrom * 1.1102e-10
                        binding.convertedDigit.text = "$result PiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Mebibit
                if(selectFrom.selectedItem.toString() == "Mebibit"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Mebibit"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bit"){
                        val result = unitFrom * 1.049e+6
                        binding.convertedDigit.text = "$result bit"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobit"){
                        val result = unitFrom * 1048.58
                        binding.convertedDigit.text = "$result kb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "kibibit"){
                        val result = unitFrom * 1024
                        binding.convertedDigit.text = "$result Kib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabit"){
                        val result = unitFrom * 1.04858
                        binding.convertedDigit.text = "$result Mb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabit"){
                        val result = unitFrom * 0.00104858
                        binding.convertedDigit.text = "$result Gb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibit"){
                        val result = unitFrom * 0.000976563
                        binding.convertedDigit.text = "$result Gib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabit"){
                        val result = unitFrom * 1.0486e-6
                        binding.convertedDigit.text = "$result Tb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibit"){
                        val result = unitFrom *9.5367e-7
                        binding.convertedDigit.text = "$result Tib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabit"){
                        val result = unitFrom * 1.0486e-9
                        binding.convertedDigit.text = "$result Pb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibit"){
                        val result = unitFrom * 9.3132e-10
                        binding.convertedDigit.text = "$result Pib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Byte"){
                        val result = unitFrom * 131072
                        binding.convertedDigit.text = "$result B"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobyte"){
                        val result = unitFrom * 131.072
                        binding.convertedDigit.text = "$result kB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kibibyte"){
                        val result = unitFrom * 128
                        binding.convertedDigit.text = "$result KiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabyte"){
                        val result = unitFrom * 0.131072
                        binding.convertedDigit.text = "$result MB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibyte"){
                        val result = unitFrom * 0.125
                        binding.convertedDigit.text = "$result MiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabyte"){
                        val result = unitFrom * 0.000131072
                        binding.convertedDigit.text = "$result GB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibyte"){
                        val result = unitFrom * 0.00012207
                        binding.convertedDigit.text = "$result GiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabyte"){
                        val result = unitFrom * 1.3107e-7
                        binding.convertedDigit.text = "$result TB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()

                    }
                    else if(selectTo.selectedItem.toString() == "Tebibyte"){
                        val result = unitFrom * 1.1921e-7
                        binding.convertedDigit.text = "$result TiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabyte"){
                        val result = unitFrom * 1.3107e-10
                        binding.convertedDigit.text = "$result PB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibyte"){
                        val result = unitFrom * 1.1642e-10
                        binding.convertedDigit.text = "$result PiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Gigabit
                if(selectFrom.selectedItem.toString() == "Gigabit"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Gigabit"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bit"){
                        val result = unitFrom * 1e+9
                        binding.convertedDigit.text = "$result bit"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobit"){
                        val result = unitFrom * 1e+6
                        binding.convertedDigit.text = "$result kb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "kibibit"){
                        val result = unitFrom * 976563
                        binding.convertedDigit.text = "$result Kib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabit"){
                        val result = unitFrom * 1000
                        binding.convertedDigit.text = "$result Mb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibit"){
                        val result = unitFrom * 953.674
                        binding.convertedDigit.text = "$result Mib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibit"){
                        val result = unitFrom * 0.931323
                        binding.convertedDigit.text = "$result Gib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabit"){
                        val result = unitFrom * 0.001
                        binding.convertedDigit.text = "$result Tb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibit"){
                        val result = unitFrom * 0.000909495
                        binding.convertedDigit.text = "$result Tib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabit"){
                        val result = unitFrom * 1e-6
                        binding.convertedDigit.text = "$result Pb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibit"){
                        val result = unitFrom * 8.8818e-7
                        binding.convertedDigit.text = "$result Pib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Byte"){
                        val result = unitFrom * 1.25e+8
                        binding.convertedDigit.text = "$result B"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobyte"){
                        val result = unitFrom * 125000
                        binding.convertedDigit.text = "$result kB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kibibyte"){
                        val result = unitFrom * 122070
                        binding.convertedDigit.text = "$result KiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabyte"){
                        val result = unitFrom * 125
                        binding.convertedDigit.text = "$result MB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibyte"){
                        val result = unitFrom * 119.209
                        binding.convertedDigit.text = "$result MiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabyte"){
                        val result = unitFrom * 0.125
                        binding.convertedDigit.text = "$result GB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }

                    else if(selectTo.selectedItem.toString() == "Gibibyte"){
                        val result = unitFrom * 0.116415
                        binding.convertedDigit.text = "$result GiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabyte"){
                        val result = unitFrom * 0.000125
                        binding.convertedDigit.text = "$result TB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibyte"){
                        val result = unitFrom * 0.000113687
                        binding.convertedDigit.text = "$result TiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabyte"){
                        val result = unitFrom * 1.25e-7
                        binding.convertedDigit.text = "$result PB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()

                    }
                    else if(selectTo.selectedItem.toString() == "Pebibyte"){
                        val result = unitFrom * 1.1102e-7
                        binding.convertedDigit.text = "$result PiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Gibibit
                if(selectFrom.selectedItem.toString() == "Gibibit"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Gibibit"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bit"){
                        val result = unitFrom * 1.074e+9
                        binding.convertedDigit.text = "$result bit"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobit"){
                        val result = unitFrom * 1.074e+6
                        binding.convertedDigit.text = "$result kb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "kibibit"){
                        val result = unitFrom * 1.049e+6
                        binding.convertedDigit.text = "$result Kib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabit"){
                        val result = unitFrom * 1073.74
                        binding.convertedDigit.text = "$result Mb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibit"){
                        val result = unitFrom * 1024
                        binding.convertedDigit.text = "$result Mib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabit"){
                        val result = unitFrom * 1.07374
                        binding.convertedDigit.text = "$result Gb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabit"){
                        val result = unitFrom *0.00107374
                        binding.convertedDigit.text = "$result Tb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibit"){
                        val result = unitFrom * 0.000976563
                        binding.convertedDigit.text = "$result Tib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabit"){
                        val result = unitFrom * 1.0737e-6
                        binding.convertedDigit.text = "$result Pb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibit"){
                        val result = unitFrom * 9.5367e-7
                        binding.convertedDigit.text = "$result Pib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Byte"){
                        val result = unitFrom * 1.342e+8
                        binding.convertedDigit.text = "$result B"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobyte"){
                        val result = unitFrom * 134218
                        binding.convertedDigit.text = "$result kB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kibibyte"){
                        val result = unitFrom * 131072
                        binding.convertedDigit.text = "$result KiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabyte"){
                        val result = unitFrom * 134.218
                        binding.convertedDigit.text = "$result MB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibyte"){
                        val result = unitFrom * 128
                        binding.convertedDigit.text = "$result MiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabyte"){
                        val result = unitFrom * 0.134218
                        binding.convertedDigit.text = "$result GB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibyte"){
                        val result = unitFrom * 0.125
                        binding.convertedDigit.text = "$result GiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabyte"){
                        val result = unitFrom * 0.000134218
                        binding.convertedDigit.text = "$result TB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibyte"){
                        val result = unitFrom * 0.00012207
                        binding.convertedDigit.text = "$result TiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabyte"){
                        val result = unitFrom * 1.3422e-7
                        binding.convertedDigit.text = "$result PB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibyte"){
                        val result = unitFrom * 1.1921e-7
                        binding.convertedDigit.text = "$result PiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Terabit
                if(selectFrom.selectedItem.toString() == "Terabit"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Terabit"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bit"){
                        val result = unitFrom * 1e+12
                        binding.convertedDigit.text = "$result bit"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobit"){
                        val result = unitFrom * 1e+9
                        binding.convertedDigit.text = "$result kb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "kibibit"){
                        val result = unitFrom * 9.766e+8
                        binding.convertedDigit.text = "$result Kib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabit"){
                        val result = unitFrom * 1e+6
                        binding.convertedDigit.text = "$result Mb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibit"){
                        val result = unitFrom * 953674
                        binding.convertedDigit.text = "$result Mib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabit"){
                        val result = unitFrom * 1000
                        binding.convertedDigit.text = "$result Gb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibit"){
                        val result = unitFrom * 931.323
                        binding.convertedDigit.text = "$result Gib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibit"){
                        val result = unitFrom * 0.909495
                        binding.convertedDigit.text = "$result Tib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabit"){
                        val result = unitFrom * 0.001
                        binding.convertedDigit.text = "$result Pb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibit"){
                        val result = unitFrom * 0.000888178
                        binding.convertedDigit.text = "$result Pib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Byte"){
                        val result = unitFrom * 1.25e+11
                        binding.convertedDigit.text = "$result B"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobyte"){
                        val result = unitFrom * 1.25e+8
                        binding.convertedDigit.text = "$result kB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kibibyte"){
                        val result = unitFrom * 1.221e+8
                        binding.convertedDigit.text = "$result KiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabyte"){
                        val result = unitFrom * 125000
                        binding.convertedDigit.text = "$result MB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibyte"){
                        val result = unitFrom * 119209
                        binding.convertedDigit.text = "$result MiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabyte"){
                        val result = unitFrom * 125
                        binding.convertedDigit.text = "$result GB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibyte"){
                        val result = unitFrom * 116.415
                        binding.convertedDigit.text = "$result GiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabyte"){
                        val result = unitFrom * 0.125
                        binding.convertedDigit.text = "$result TB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibyte"){
                        val result = unitFrom * 0.113687
                        binding.convertedDigit.text = "$result TiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabyte"){
                        val result = unitFrom * 0.000125
                        binding.convertedDigit.text = "$result PB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibyte"){
                        val result = unitFrom * 0.000111022
                        binding.convertedDigit.text = "$result PiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Tebibit
                if(selectFrom.selectedItem.toString() == "Tebibit"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Tebibit"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bit"){
                        val result = unitFrom * 1.1e+12
                        binding.convertedDigit.text = "$result bit"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobit"){
                        val result = unitFrom * 1.1e+9
                        binding.convertedDigit.text = "$result kb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "kibibit"){
                        val result = unitFrom * 1.074e+9
                        binding.convertedDigit.text = "$result Kib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabit"){
                        val result = unitFrom * 1.1e+6
                        binding.convertedDigit.text = "$result Mb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibit"){
                        val result = unitFrom * 1.049e+6
                        binding.convertedDigit.text = "$result Mib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabit"){
                        val result = unitFrom * 1099.51
                        binding.convertedDigit.text = "$result Gb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibit"){
                        val result = unitFrom * 1024
                        binding.convertedDigit.text = "$result Gib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabit"){
                        val result = unitFrom * 1.09951
                        binding.convertedDigit.text = "$result Tb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabit"){
                        val result = unitFrom * 0.00109951
                        binding.convertedDigit.text = "$result Pb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibit"){
                        val result = unitFrom * 0.000976563
                        binding.convertedDigit.text = "$result Pib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Byte"){
                        val result = unitFrom * 1.374e+11
                        binding.convertedDigit.text = "$result B"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobyte"){
                        val result = unitFrom * 1.374e+8
                        binding.convertedDigit.text = "$result kB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kibibyte"){
                        val result = unitFrom * 1.342e+8
                        binding.convertedDigit.text = "$result KiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabyte"){
                        val result = unitFrom * 137439
                        binding.convertedDigit.text = "$result MB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibyte"){
                        val result = unitFrom * 131072
                        binding.convertedDigit.text = "$result MiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabyte"){
                        val result = unitFrom * 137.439
                        binding.convertedDigit.text = "$result GB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibyte"){
                        val result = unitFrom * 128
                        binding.convertedDigit.text = "$result GiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabyte"){
                        val result = unitFrom * 0.137439
                        binding.convertedDigit.text = "$result TB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibyte"){
                        val result = unitFrom * 0.125
                        binding.convertedDigit.text = "$result TiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabyte"){
                        val result = unitFrom * 0.000137439
                        binding.convertedDigit.text = "$result PB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibyte"){
                        val result = unitFrom * 0.00012207
                        binding.convertedDigit.text = "$result PiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Petabit
                if(selectFrom.selectedItem.toString() == "Petabit"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Petabit"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bit"){
                        val result = unitFrom * 1e+15
                        binding.convertedDigit.text = "$result bit"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()

                    }
                    else if(selectTo.selectedItem.toString() == "Kilobit"){
                        val result = unitFrom * 1e+12
                        binding.convertedDigit.text = "$result kb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "kibibit"){
                        val result = unitFrom * 9.766e+11
                        binding.convertedDigit.text = "$result Kib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabit"){
                        val result = unitFrom * 1e+9
                        binding.convertedDigit.text = "$result Mb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibit"){
                        val result = unitFrom * 9.537e+8
                        binding.convertedDigit.text = "$result Mib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabit"){
                        val result = unitFrom * 1e+6
                        binding.convertedDigit.text = "$result Gb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibit"){
                        val result = unitFrom * 931323
                        binding.convertedDigit.text = "$result Gib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabit"){
                        val result = unitFrom * 1000
                        binding.convertedDigit.text = "$result Tb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibit"){
                        val result = unitFrom * 909.495
                        binding.convertedDigit.text = "$result Tb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibit"){
                        val result = unitFrom * 0.888178
                        binding.convertedDigit.text = "$result Pib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Byte"){
                        val result = unitFrom * 1.25e+14
                        binding.convertedDigit.text = "$result B"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobyte"){
                        val result = unitFrom * 1.25e+11
                        binding.convertedDigit.text = "$result kB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kibibyte"){
                        val result = unitFrom * 1.221e+11
                        binding.convertedDigit.text = "$result KiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabyte"){
                        val result = unitFrom * 1.25e+8
                        binding.convertedDigit.text = "$result MB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibyte"){
                        val result = unitFrom * 1.192e+8
                        binding.convertedDigit.text = "$result MiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabyte"){
                        val result = unitFrom * 125000
                        binding.convertedDigit.text = "$result GB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibyte"){
                        val result = unitFrom * 116415
                        binding.convertedDigit.text = "$result GiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabyte"){
                        val result = unitFrom * 125
                        binding.convertedDigit.text = "$result TB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibyte"){
                        val result = unitFrom * 113.687
                        binding.convertedDigit.text = "$result TiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabyte"){
                        val result = unitFrom * 0.125
                        binding.convertedDigit.text = "$result PB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibyte"){
                        val result = unitFrom * 0.111022
                        binding.convertedDigit.text = "$result PiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Pebibit
                if(selectFrom.selectedItem.toString() == "Pebibit"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Pebibit"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bit"){
                        val result = unitFrom * 1.126e+15
                        binding.convertedDigit.text = "$result bit"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobit"){
                        val result = unitFrom * 1.126e+12
                        binding.convertedDigit.text = "$result kb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "kibibit"){
                        val result = unitFrom * 1.1e+12
                        binding.convertedDigit.text = "$result Kib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabit"){
                        val result = unitFrom * 1.126e+9
                        binding.convertedDigit.text = "$result Mb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibit"){
                        val result = unitFrom * 1.074e+9
                        binding.convertedDigit.text = "$result Mib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }

                    else if(selectTo.selectedItem.toString() == "Gigabit"){
                        val result = unitFrom * 1.126e+6
                        binding.convertedDigit.text = "$result Gb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibit"){
                        val result = unitFrom * 1.049e+6
                        binding.convertedDigit.text = "$result Gib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabit"){
                        val result = unitFrom * 1125.9
                        binding.convertedDigit.text = "$result Tb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibit"){
                        val result = unitFrom * 1024
                        binding.convertedDigit.text = "$result Tb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabit"){
                        val result = unitFrom * 1.1259
                        binding.convertedDigit.text = "$result Pb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Byte"){
                        val result = unitFrom * 1.407e+14
                        binding.convertedDigit.text = "$result B"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobyte"){
                        val result = unitFrom * 1.407e+11
                        binding.convertedDigit.text = "$result kB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kibibyte"){
                        val result = unitFrom * 1.374e+11
                        binding.convertedDigit.text = "$result KiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabyte"){
                        val result = unitFrom * 1.407e+8
                        binding.convertedDigit.text = "$result MB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibyte"){
                        val result = unitFrom * 1.342e+8
                        binding.convertedDigit.text = "$result MiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabyte"){
                        val result = unitFrom * 140737
                        binding.convertedDigit.text = "$result GB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibyte"){
                        val result = unitFrom * 131072
                        binding.convertedDigit.text = "$result GiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabyte"){
                        val result = unitFrom * 140.737
                        binding.convertedDigit.text = "$result TB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibyte"){
                        val result = unitFrom * 128
                        binding.convertedDigit.text = "$result TiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabyte"){
                        val result = unitFrom * 0.140737
                        binding.convertedDigit.text = "$result PB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibyte"){
                        val result = unitFrom * 0.125
                        binding.convertedDigit.text = "$result PiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Byte
                if(selectFrom.selectedItem.toString() == "Byte"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Byte"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bit"){
                        val result = unitFrom * 8
                        binding.convertedDigit.text = "$result bit"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobit"){
                        val result = unitFrom * 0.008
                        binding.convertedDigit.text = "$result kb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "kibibit"){
                        val result = unitFrom * 0.0078125
                        binding.convertedDigit.text = "$result Kib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabit"){
                        val result = unitFrom * 8e-6
                        binding.convertedDigit.text = "$result Mb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibit"){
                        val result = unitFrom * 7.6294e-6
                        binding.convertedDigit.text = "$result Mib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabit"){
                        val result = unitFrom * 8e-9
                        binding.convertedDigit.text = "$result Gb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibit"){
                        val result = unitFrom * 7.4506e-9
                        binding.convertedDigit.text = "$result Gib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabit"){
                        val result = unitFrom * 8e-12
                        binding.convertedDigit.text = "$result Tb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibit"){
                        val result = unitFrom * 7.276e-12
                        binding.convertedDigit.text = "$result Tib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabit"){
                        val result = unitFrom * 8e-15
                        binding.convertedDigit.text = "$result Pb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibit"){
                        val result = unitFrom * 7.1054e-15
                        binding.convertedDigit.text = "$result Pib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobyte"){
                        val result = unitFrom * 0.001
                        binding.convertedDigit.text = "$result kB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kibibyte"){
                        val result = unitFrom * 0.000976563
                        binding.convertedDigit.text = "$result KiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabyte"){
                        val result = unitFrom * 1e-6
                        binding.convertedDigit.text = "$result MB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }

                    else if(selectTo.selectedItem.toString() == "Mebibyte"){
                        val result = unitFrom * 9.5367e-7
                        binding.convertedDigit.text = "$result MiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabyte"){
                        val result = unitFrom * 1e-9
                        binding.convertedDigit.text = "$result GB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibyte"){
                        val result = unitFrom * 9.3132e-10
                        binding.convertedDigit.text = "$result GiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabyte"){
                        val result = unitFrom * 1e-12
                        binding.convertedDigit.text = "$result TB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibyte"){
                        val result = unitFrom * 9.0949e-13
                        binding.convertedDigit.text = "$result TiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabyte"){
                        val result = unitFrom * 1e-15
                        binding.convertedDigit.text = "$result PB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibyte"){
                        val result = unitFrom * 8.8818e-16
                        binding.convertedDigit.text = "$result PiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Kilobyte (Done)
                if(selectFrom.selectedItem.toString() == "Kilobyte"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Kilobyte"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bit"){
                        val result = unitFrom * 8000
                        binding.convertedDigit.text = "$result bit"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobit"){
                        val result = unitFrom * 8
                        binding.convertedDigit.text = "$result kb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "kibibit"){
                        val result = unitFrom * 7.8125
                        binding.convertedDigit.text = "$result Kib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabit"){
                        val result = unitFrom * 0.008
                        binding.convertedDigit.text = "$result Mb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibit"){
                        val result = unitFrom * 0.00762939
                        binding.convertedDigit.text = "$result Mib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabit"){
                        val result = unitFrom * 8e-6
                        binding.convertedDigit.text = "$result Gb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibit"){
                        val result = unitFrom * 7.4506e-6
                        binding.convertedDigit.text = "$result Gib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabit"){
                        val result = unitFrom * 8e-9
                        binding.convertedDigit.text = "$result Tb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibit"){
                        val result = unitFrom * 7.276e-9
                        binding.convertedDigit.text = "$result Tib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabit"){
                        val result = unitFrom * 8e-12
                        binding.convertedDigit.text = "$result Pb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibit"){
                        val result = unitFrom * 7.1054e-12
                        binding.convertedDigit.text = "$result Pib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Byte"){
                        val result = unitFrom * 1000
                        binding.convertedDigit.text = "$result B"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kibibyte"){
                        val result = unitFrom * 0.976563
                        binding.convertedDigit.text = "$result KiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabyte"){
                        val result = unitFrom * 0.001
                        binding.convertedDigit.text = "$result MB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibyte"){
                        val result = unitFrom * 0.000953674
                        binding.convertedDigit.text = "$result MiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabyte"){
                        val result = unitFrom * 1e-6
                        binding.convertedDigit.text = "$result GB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibyte"){
                        val result = unitFrom * 9.3132e-7
                        binding.convertedDigit.text = "$result GiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabyte"){
                        val result = unitFrom * 1e-9
                        binding.convertedDigit.text = "$result TB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibyte"){
                        val result = unitFrom * 9.0949e-10
                        binding.convertedDigit.text = "$result TiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabyte"){
                        val result = unitFrom * 1e-12
                        binding.convertedDigit.text = "$result PB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibyte"){
                        val result = unitFrom * 8.8818e-13
                        binding.convertedDigit.text = "$result PiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Kibibyte
                if(selectFrom.selectedItem.toString() == "Kibibyte"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Kibibyte"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bit"){
                        val result = unitFrom * 8192
                        binding.convertedDigit.text = "$result bit"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobit"){
                        val result = unitFrom * 8.192
                        binding.convertedDigit.text = "$result kb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "kibibit"){
                        val result = unitFrom * 8
                        binding.convertedDigit.text = "$result Kib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabit"){
                        val result = unitFrom * 0.008192
                        binding.convertedDigit.text = "$result Mb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibit"){
                        val result = unitFrom * 0.0078125
                        binding.convertedDigit.text = "$result Mib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabit"){
                        val result = unitFrom * 8.192e-6
                        binding.convertedDigit.text = "$result Gb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibit"){
                        val result = unitFrom * 7.6294e-6
                        binding.convertedDigit.text = "$result Gib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabit"){
                        val result = unitFrom * 8.192e-9
                        binding.convertedDigit.text = "$result Tb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibit"){
                        val result = unitFrom * 7.4506e-9
                        binding.convertedDigit.text = "$result Tib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabit"){
                        val result = unitFrom * 8.192e-12
                        binding.convertedDigit.text = "$result Pb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibit"){
                        val result = unitFrom * 7.276e-12
                        binding.convertedDigit.text = "$result Pib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Byte"){
                        val result = unitFrom * 1024
                        binding.convertedDigit.text = "$result B"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobyte"){
                        val result = unitFrom * 1.024
                        binding.convertedDigit.text = "$result KB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabyte"){
                        val result = unitFrom * 0.001024
                        binding.convertedDigit.text = "$result MB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibyte"){
                        val result = unitFrom * 0.000976563
                        binding.convertedDigit.text = "$result MiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabyte"){
                        val result = unitFrom * 1e-6
                        binding.convertedDigit.text = "$result GB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibyte"){
                        val result = unitFrom * 9.3132e-7
                        binding.convertedDigit.text = "$result GiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabyte"){
                        val result = unitFrom * 1.024e-6
                        binding.convertedDigit.text = "$result TB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibyte"){
                        val result = unitFrom * 9.5367e-7
                        binding.convertedDigit.text = "$result TiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabyte"){
                        val result = unitFrom * 1.024e-12
                        binding.convertedDigit.text = "$result PB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibyte"){
                        val result = unitFrom * 9.0949e-13
                        binding.convertedDigit.text = "$result PiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Megabyte
                if(selectFrom.selectedItem.toString() == "Megabyte"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Megabyte"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bit"){
                        val result = unitFrom * 8e+6
                        binding.convertedDigit.text = "$result bit"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobit"){
                        val result = unitFrom * 8000
                        binding.convertedDigit.text = "$result kb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "kibibit"){
                        val result = unitFrom * 7812.5
                        binding.convertedDigit.text = "$result Kib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabit"){
                        val result = unitFrom * 8
                        binding.convertedDigit.text = "$result Mb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibit"){
                        val result = unitFrom * 7.62939
                        binding.convertedDigit.text = "$result Mib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabit"){
                        val result = unitFrom * 0.008
                        binding.convertedDigit.text = "$result Gb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibit"){
                        val result = unitFrom * 0.00745058
                        binding.convertedDigit.text = "$result Gib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()

                    }
                    else if(selectTo.selectedItem.toString() == "Terabit"){
                        val result = unitFrom * 8e-6
                        binding.convertedDigit.text = "$result Tb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibit"){
                        val result = unitFrom * 7.276e-6
                        binding.convertedDigit.text = "$result Tib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabit"){
                        val result = unitFrom * 8e-9
                        binding.convertedDigit.text = "$result Pb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibit"){
                        val result = unitFrom * 7.1054e-9
                        binding.convertedDigit.text = "$result Pib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Byte"){
                        val result = unitFrom * 1e+6
                        binding.convertedDigit.text = "$result B"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobyte"){
                        val result = unitFrom * 1000
                        binding.convertedDigit.text = "$result KB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kibibyte"){
                        val result = unitFrom * 976.563
                        binding.convertedDigit.text = "$result KiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibyte"){
                        val result = unitFrom * 0.953674
                        binding.convertedDigit.text = "$result MiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabyte"){
                        val result = unitFrom * 0.001
                        binding.convertedDigit.text = "$result GB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibyte"){
                        val result = unitFrom * 0.000931323
                        binding.convertedDigit.text = "$result GiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabyte"){
                        val result = unitFrom * 1e-6
                        binding.convertedDigit.text = "$result TB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibyte"){
                        val result = unitFrom * 9.0949e-7
                        binding.convertedDigit.text = "$result TiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabyte"){
                        val result = unitFrom * 1e-9
                        binding.convertedDigit.text = "$result PB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibyte"){
                        val result = unitFrom * 8.8818e-10
                        binding.convertedDigit.text = "$result PiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Mebibyte
                if(selectFrom.selectedItem.toString() == "Mebibyte"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Mebibyte"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bit"){
                        val result = unitFrom * 8.389e+6
                        binding.convertedDigit.text = "$result bit"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobit"){
                        val result = unitFrom * 8388.61
                        binding.convertedDigit.text = "$result kb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "kibibit"){
                        val result = unitFrom * 8192
                        binding.convertedDigit.text = "$result Kib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabit"){
                        val result = unitFrom * 8.38861
                        binding.convertedDigit.text = "$result Mb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibit"){
                        val result = unitFrom * 8
                        binding.convertedDigit.text = "$result Mib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()

                    }
                    else if(selectTo.selectedItem.toString() == "Gigabit"){
                        val result = unitFrom * 0.00838861
                        binding.convertedDigit.text = "$result Gb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibit"){
                        val result = unitFrom * 0.0078125
                        binding.convertedDigit.text = "$result Gib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabit"){
                        val result = unitFrom * 8.3886e-6
                        binding.convertedDigit.text = "$result Tb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibit"){
                        val result = unitFrom * 7.6294e-6
                        binding.convertedDigit.text = "$result Tib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabit"){
                        val result = unitFrom * 8.3886e-9
                        binding.convertedDigit.text = "$result Pb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibit"){
                        val result = unitFrom * 7.4506e-9
                        binding.convertedDigit.text = "$result Pib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Byte"){
                        val result = unitFrom * 1.049e+6
                        binding.convertedDigit.text = "$result B"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobyte"){
                        val result = unitFrom * 1048.58
                        binding.convertedDigit.text = "$result KB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kibibyte"){
                        val result = unitFrom * 1024
                        binding.convertedDigit.text = "$result KiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabyte"){
                        val result = unitFrom * 1.04858
                        binding.convertedDigit.text = "$result MB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabyte"){
                        val result = unitFrom * 0.00104858
                        binding.convertedDigit.text = "$result GB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibyte"){
                        val result = unitFrom * 0.000976563
                        binding.convertedDigit.text = "$result GiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabyte"){
                        val result = unitFrom * 1.0486e-6
                        binding.convertedDigit.text = "$result TB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibyte"){
                        val result = unitFrom * 9.5367e-7
                        binding.convertedDigit.text = "$result TiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabyte"){
                        val result = unitFrom * 1.0486e-9
                        binding.convertedDigit.text = "$result PB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibyte"){
                        val result = unitFrom * 9.3132e-10
                        binding.convertedDigit.text = "$result PiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//               Gigabyte
                if(selectFrom.selectedItem.toString() == "Gigabyte"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Gigabyte"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bit"){
                        val result = unitFrom * 8e+9
                        binding.convertedDigit.text = "$result bit"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobit"){
                        val result = unitFrom * 8e+6
                        binding.convertedDigit.text = "$result kb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "kibibit"){
                        val result = unitFrom * 7.813e+6
                        binding.convertedDigit.text = "$result Kib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabit"){
                        val result = unitFrom * 8000
                        binding.convertedDigit.text = "$result Mb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibit"){
                        val result = unitFrom * 7629.39
                        binding.convertedDigit.text = "$result Mib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabit"){
                        val result = unitFrom * 8
                        binding.convertedDigit.text = "$result Gb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibit"){
                        val result = unitFrom * 7.45058
                        binding.convertedDigit.text = "$result Gib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabit"){
                        val result = unitFrom * 0.008
                        binding.convertedDigit.text = "$result Tb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibit"){
                        val result = unitFrom * 0.00727596
                        binding.convertedDigit.text = "$result Tib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabit"){
                        val result = unitFrom * 8e-6
                        binding.convertedDigit.text = "$result Pb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibit"){
                        val result = unitFrom * 7.1054e-6
                        binding.convertedDigit.text = "$result Pib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Byte"){
                        val result = unitFrom * 1e+9
                        binding.convertedDigit.text = "$result B"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobyte"){
                        val result = unitFrom * 1e+6
                        binding.convertedDigit.text = "$result KB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kibibyte"){
                        val result = unitFrom * 976563
                        binding.convertedDigit.text = "$result KB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabyte"){
                        val result = unitFrom * 1000
                        binding.convertedDigit.text = "$result MB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibyte"){
                        val result = unitFrom * 953.674
                        binding.convertedDigit.text = "$result MiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibyte"){
                        val result = unitFrom * 0.931323
                        binding.convertedDigit.text = "$result GiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabyte"){
                        val result = unitFrom * 0.001
                        binding.convertedDigit.text = "$result TB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibyte"){
                        val result = unitFrom * 0.000909495
                        binding.convertedDigit.text = "$result TiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabyte"){
                        val result = unitFrom * 1e-6
                        binding.convertedDigit.text = "$result PB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibyte"){
                        val result = unitFrom * 8.8818e-7
                        binding.convertedDigit.text = "$result PiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Gibibyte
                if(selectFrom.selectedItem.toString() == "Gibibyte"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Gibibyte"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bit"){
                        val result = unitFrom * 8.59e+9
                        binding.convertedDigit.text = "$result bit"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobit"){
                        val result = unitFrom * 8.59e+6
                        binding.convertedDigit.text = "$result kb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "kibibit"){
                        val result = unitFrom * 8.389e+6
                        binding.convertedDigit.text = "$result Kib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabit"){
                        val result = unitFrom * 8589.93
                        binding.convertedDigit.text = "$result Mb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibit"){
                        val result = unitFrom * 8192
                        binding.convertedDigit.text = "$result Mib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabit"){
                        val result = unitFrom * 8.58993
                        binding.convertedDigit.text = "$result Gb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibit"){
                        val result = unitFrom * 8
                        binding.convertedDigit.text = "$result Gib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabit"){
                        val result = unitFrom * 0.00858993
                        binding.convertedDigit.text = "$result Tb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibit"){
                        val result = unitFrom * 0.0078125
                        binding.convertedDigit.text = "$result Tib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabit"){
                        val result = unitFrom * 8.5899e-6
                        binding.convertedDigit.text = "$result Pb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibit"){
                        val result = unitFrom * 7.6294e-6
                        binding.convertedDigit.text = "$result Pib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Byte"){
                        val result = unitFrom * 1.074e+9
                        binding.convertedDigit.text = "$result B"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobyte"){
                        val result = unitFrom * 1.074e+6
                        binding.convertedDigit.text = "$result KB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kibibyte"){
                        val result = unitFrom * 1.049e+6
                        binding.convertedDigit.text = "$result KiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabyte"){
                        val result = unitFrom * 1073.74
                        binding.convertedDigit.text = "$result MB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibyte"){
                        val result = unitFrom * 1024
                        binding.convertedDigit.text = "$result MiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabyte"){
                        val result = unitFrom * 1.07374
                        binding.convertedDigit.text = "$result GB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabyte"){
                        val result = unitFrom * 0.00107374
                        binding.convertedDigit.text = "$result TB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibyte"){
                        val result = unitFrom * 0.000976563
                        binding.convertedDigit.text = "$result TiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabyte"){
                        val result = unitFrom * 1.0737e-6
                        binding.convertedDigit.text = "$result PB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibyte"){
                        val result = unitFrom * 9.5367e-7
                        binding.convertedDigit.text = "$result PiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Terabyte
                if(selectFrom.selectedItem.toString() == "Terabyte"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Terabyte"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bit"){
                        val result = unitFrom * 8e+12
                        binding.convertedDigit.text = "$result bit"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobit"){
                        val result = unitFrom * 8e+9
                        binding.convertedDigit.text = "$result kb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "kibibit"){
                        val result = unitFrom * 7.813e+9
                        binding.convertedDigit.text = "$result Kib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabit"){
                        val result = unitFrom * 8e+6
                        binding.convertedDigit.text = "$result Mb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibit"){
                        val result = unitFrom * 7.629e+6
                        binding.convertedDigit.text = "$result Mib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabit"){
                        val result = unitFrom * 8000
                        binding.convertedDigit.text = "$result Gb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibit"){
                        val result = unitFrom * 7450.58
                        binding.convertedDigit.text = "$result Gib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabit"){
                        val result = unitFrom * 8
                        binding.convertedDigit.text = "$result Tb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibit"){
                        val result = unitFrom * 7.27596
                        binding.convertedDigit.text = "$result Tib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabit"){
                        val result = unitFrom * 0.008
                        binding.convertedDigit.text = "$result Pb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibit"){
                        val result = unitFrom * 0.00710543
                        binding.convertedDigit.text = "$result Pib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Byte"){
                        val result = unitFrom * 1e+12
                        binding.convertedDigit.text = "$result B"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobyte"){
                        val result = unitFrom * 1e+9
                        binding.convertedDigit.text = "$result KB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kibibyte"){
                        val result = unitFrom * 9.766e+8
                        binding.convertedDigit.text = "$result KiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabyte"){
                        val result = unitFrom * 1e+6
                        binding.convertedDigit.text = "$result MB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibyte"){
                        val result = unitFrom * 953674
                        binding.convertedDigit.text = "$result MiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabyte"){
                        val result = unitFrom * 1000
                        binding.convertedDigit.text = "$result GB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibyte"){
                        val result = unitFrom * 931.323
                        binding.convertedDigit.text = "$result GiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibyte"){
                        val result = unitFrom * 0.909495
                        binding.convertedDigit.text = "$result TiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabyte"){
                        val result = unitFrom * 0.001
                        binding.convertedDigit.text = "$result PB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibyte"){
                        val result = unitFrom * 0.000888178
                        binding.convertedDigit.text = "$result PiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//              Tebibyte
                if(selectFrom.selectedItem.toString() == "Tebibyte"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Tebibyte"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bit"){
                        val result = unitFrom * 8.796e+12
                        binding.convertedDigit.text = "$result bit"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()

                    }
                    else if(selectTo.selectedItem.toString() == "Kilobit"){
                        val result = unitFrom * 8.796e+9
                        binding.convertedDigit.text = "$result kb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "kibibit"){
                        val result = unitFrom * 8.59e+9
                        binding.convertedDigit.text = "$result Kib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabit"){
                        val result = unitFrom * 8.796e+6
                        binding.convertedDigit.text = "$result Mb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibit"){
                        val result = unitFrom * 8.389e+6
                        binding.convertedDigit.text = "$result Mib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabit"){
                        val result = unitFrom * 8796.09
                        binding.convertedDigit.text = "$result Gb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibit"){
                        val result = unitFrom * 8192
                        binding.convertedDigit.text = "$result Gib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabit"){
                        val result = unitFrom * 8.79609
                        binding.convertedDigit.text = "$result Tb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibit"){
                        val result = unitFrom * 8
                        binding.convertedDigit.text = "$result Tib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabit"){
                        val result = unitFrom * 0.00879609
                        binding.convertedDigit.text = "$result Pb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibit"){
                        val result = unitFrom * 0.0078125
                        binding.convertedDigit.text = "$result Pib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Byte"){
                        val result = unitFrom * 1.1e+12
                        binding.convertedDigit.text = "$result B"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobyte"){
                        val result = unitFrom * 1.1e+9
                        binding.convertedDigit.text = "$result KB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kibibyte"){
                        val result = unitFrom * 1.074e+9
                        binding.convertedDigit.text = "$result KiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabyte"){
                        val result = unitFrom * 1.1e+6
                        binding.convertedDigit.text = "$result MB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibyte"){
                        val result = unitFrom * 1.049e+6
                        binding.convertedDigit.text = "$result MiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabyte"){
                        val result = unitFrom * 1099.51
                        binding.convertedDigit.text = "$result GB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibyte"){
                        val result = unitFrom * 1024
                        binding.convertedDigit.text = "$result GiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabyte"){
                        val result = unitFrom * 1.09951
                        binding.convertedDigit.text = "$result TB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabyte"){
                        val result = unitFrom * 0.00109951
                        binding.convertedDigit.text = "$result PB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibyte"){
                        val result = unitFrom * 0.000976563
                        binding.convertedDigit.text = "$result PiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Petabyte
                if(selectFrom.selectedItem.toString() == "Petabyte"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Petabyte"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bit"){
                        val result = unitFrom * 8e+15
                        binding.convertedDigit.text = "$result bit"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobit"){
                        val result = unitFrom * 8e+12
                        binding.convertedDigit.text = "$result kb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "kibibit"){
                        val result = unitFrom * 7.813e+12
                        binding.convertedDigit.text = "$result Kib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabit"){
                        val result = unitFrom * 8e+9
                        binding.convertedDigit.text = "$result Mb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibit"){
                        val result = unitFrom * 7.629e+9
                        binding.convertedDigit.text = "$result Mib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabit"){
                        val result = unitFrom * 8e+6
                        binding.convertedDigit.text = "$result Gb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibit"){
                        val result = unitFrom * 7.451e+6
                        binding.convertedDigit.text = "$result Gib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabit"){
                        val result = unitFrom * 8000
                        binding.convertedDigit.text = "$result Tb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibit"){
                        val result = unitFrom * 7275.96
                        binding.convertedDigit.text = "$result Tib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabit"){
                        val result = unitFrom * 8
                        binding.convertedDigit.text = "$result Pb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibit"){
                        val result = unitFrom * 7.10543
                        binding.convertedDigit.text = "$result Pib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Byte"){
                        val result = unitFrom * 1e+15
                        binding.convertedDigit.text = "$result B"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobyte"){
                        val result = unitFrom * 1e+12
                        binding.convertedDigit.text = "$result KB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }

                    else if(selectTo.selectedItem.toString() == "Kibibyte"){
                        val result = unitFrom * 9.766e+11
                        binding.convertedDigit.text = "$result KB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabyte"){
                        val result = unitFrom * 1e+9
                        binding.convertedDigit.text = "$result MB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibyte"){
                        val result = unitFrom * 9.537e+8
                        binding.convertedDigit.text = "$result MiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabyte"){
                        val result = unitFrom * 1e+6
                        binding.convertedDigit.text = "$result GB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibyte"){
                        val result = unitFrom * 931323
                        binding.convertedDigit.text = "$result GiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabyte"){
                        val result = unitFrom * 1000
                        binding.convertedDigit.text = "$result TB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibyte"){
                        val result = unitFrom * 909.495
                        binding.convertedDigit.text = "$result TiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibyte"){
                        val result = unitFrom * 0.888178
                        binding.convertedDigit.text = "$result PiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Pebibyte
                if(selectFrom.selectedItem.toString() == "Pebibyte"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Pebibyte"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Bit"){
                        val result = unitFrom * 9.007e+15
                        binding.convertedDigit.text = "$result bit"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobit"){
                        val result = unitFrom * 9.007e+12
                        binding.convertedDigit.text = "$result kb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "kibibit"){
                        val result = unitFrom * 8.796e+12
                        binding.convertedDigit.text = "$result Kib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabit"){
                        val result = unitFrom * 9.007e+9
                        binding.convertedDigit.text = "$result Mb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibit"){
                        val result = unitFrom * 8.59e+9
                        binding.convertedDigit.text = "$result Mib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabit"){
                        val result = unitFrom * 9.007e+6
                        binding.convertedDigit.text = "$result Gb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibit"){
                        val result = unitFrom * 8.389e+6
                        binding.convertedDigit.text = "$result Gib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabit"){
                        val result = unitFrom * 9007.2
                        binding.convertedDigit.text = "$result Tb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibit"){
                        val result = unitFrom * 8192
                        binding.convertedDigit.text = "$result Tib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabit"){
                        val result = unitFrom * 9.0072
                        binding.convertedDigit.text = "$result Pb"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Pebibit"){
                        val result = unitFrom * 8
                        binding.convertedDigit.text = "$result Pib"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Byte"){
                        val result = unitFrom * 1.126e+15
                        binding.convertedDigit.text = "$result B"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kilobyte"){
                        val result = unitFrom * 1.126e+12
                        binding.convertedDigit.text = "$result KB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Kibibyte"){
                        val result = unitFrom * 1.1e+12
                        binding.convertedDigit.text = "$result KiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Megabyte"){
                        val result = unitFrom * 1.126e+9
                        binding.convertedDigit.text = "$result MB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Mebibyte"){
                        val result = unitFrom * 1.074e+9
                        binding.convertedDigit.text = "$result MiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gigabyte"){
                        val result = unitFrom * 1.126e+6
                        binding.convertedDigit.text = "$result GB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Gibibyte"){
                        val result = unitFrom * 1.049e+6
                        binding.convertedDigit.text = "$result GiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Terabyte"){
                        val result = unitFrom * 1125.9
                        binding.convertedDigit.text = "$result TB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Tebibyte"){
                        val result = unitFrom * 1024
                        binding.convertedDigit.text = "$result TiB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Petabyte"){
                        val result = unitFrom * 1.1259
                        binding.convertedDigit.text = "$result PB"
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
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

    private fun ClearUnit() {
        binding.fromDigitEdittext.text = null
    }

    private fun addDataInRoom(fromUName:String, fromUDigit:String, toUName:String, toUDigit:String) {
        val unitEntity = UnitEntity(null,fromUName,fromUDigit,toUName,toUDigit)
//      Add data in room

        GlobalScope.launch(Dispatchers.IO) {
            database.unitDao().insert(unitEntity)
        }
    }
}