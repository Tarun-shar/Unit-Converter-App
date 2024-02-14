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
import com.example.unitconverterapp.databinding.ActivityAreaBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Area : AppCompatActivity() {

    lateinit var binding : ActivityAreaBinding
    lateinit var database: UnitDatabase
    lateinit var unitDao: UnitDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAreaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val convert_btn = findViewById<Button>(R.id.convert_btn)
        val units = resources.getStringArray(R.array.AreaUnits)

        //        Room
        database = UnitDatabase.getDatabase(this)
        unitDao = database.unitDao()

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
//                Square kilometer
                if(selectFrom.selectedItem.toString() == "Square Kilometer"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Square Kilometer"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Square meter"){
                        val result = unitFrom * 1000000
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square meter"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square mile"){
                        val result = unitFrom * 0.3861
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square mile"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square yard"){
                        val result = unitFrom * 1195989.93
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square yard"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square foot"){
                        val result = unitFrom * 10763910.42
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square foot"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square inch"){
                        val result = unitFrom * 1550000000
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square inch"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Hectare"){
                        val result = unitFrom * 100
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result hectare"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Acre"){
                        val result = unitFrom * 247.1053815
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result acre"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Square meter
                else if(selectFrom.selectedItem.toString() == "Square meter"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Square meter"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Square Kilometer"){
                        val result = unitFrom * 0.000001
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square km"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square mile"){
                        val result = unitFrom * 3.861e-7
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square mile"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square yard"){
                        val result = unitFrom * 1.19598993
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square yard"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square foot"){
                        val result = unitFrom * 10.76391042
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square foot"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square inch"){
                        val result = unitFrom * 1550
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square inch"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Hectare"){
                        val result = unitFrom * 0.0001
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result hectare"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Acre"){
                        val result = unitFrom * 0.0002471053815
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result acre"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Square mile
                else if(selectFrom.selectedItem.toString() == "Square mile"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Square mile"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Square Kilometer"){
                        val result = unitFrom * 2.59000259
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square km"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square meter"){
                        val result = unitFrom * 2590002.59
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square meter"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square yard"){
                        val result = unitFrom * 3097617.016
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square yard"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square foot"){
                        val result = unitFrom * 27878555.87
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square foot"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square inch"){
                        val result = unitFrom * 4014504015
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square inch"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Hectare"){
                        val result = unitFrom * 259.000259
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result hectare"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Acre"){
                        val result = unitFrom * 640.003578
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result acre"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                square yard
                else if(selectFrom.selectedItem.toString() == "Square yard"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Square yard"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Square Kilometer"){
                        val result = unitFrom * 8.361274413e-7
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square km"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square meter"){
                        val result = unitFrom * 0.8361274413
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square meter"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square mile"){
                        val result = unitFrom * 3.228288051e-7
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square mile"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square foot"){
                        val result = unitFrom * 9.000000878
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square foot"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square inch"){
                        val result = unitFrom * 1295.997534
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square inch"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Hectare"){
                        val result = unitFrom * 0.00008361274413
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result hectare"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Acre"){
                        val result = unitFrom * 0.0002066115903
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result acre"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                square foot
                else if(selectFrom.selectedItem.toString() == "Square foot"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Square foot"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Square Kilometer"){
                        val result = unitFrom * 9.290303997e-8
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square km"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square meter"){
                        val result = unitFrom * 0.09290303997
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square meter"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square mile"){
                        val result = unitFrom * 3.586986373e-8
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square mile"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square yard"){
                        val result = unitFrom * 0.1111111003
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square yard"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square inch"){
                        val result = unitFrom * 143.999712
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square inch"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Hectare"){
                        val result = unitFrom * 0.000009290303997
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result hectare"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Acre"){
                        val result = unitFrom * 0.00002295684113
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result acre"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                square inch
                else if(selectFrom.selectedItem.toString() == "Square inch"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Square inch"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Square Kilometer"){
                        val result = unitFrom * 6.451612903e-10
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square km"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square meter"){
                        val result = unitFrom * 0.0006451612903
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square meter"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square mile"){
                        val result = unitFrom * 3.586986373e-8
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square mile"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square yard"){
                        val result = unitFrom * 0.0007716064065
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square yard"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square foot"){
                        val result = unitFrom * 2.490967742e-10
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square foot"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Hectare"){
                        val result = unitFrom * 6.451612903e-8
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result hectare"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Acre"){
                        val result = unitFrom * 1.594228268e-7
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result acre"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                Hectare
                else if(selectFrom.selectedItem.toString() == "Hectare"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Hectare"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Square Kilometer"){
                        val result = unitFrom * 0.01
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square km"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square meter"){
                        val result = unitFrom * 10000
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square meter"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square mile"){
                        val result = unitFrom * 0.003861
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square mile"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square yard"){
                        val result = unitFrom * 11959.8993
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square yard"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square foot"){
                        val result = unitFrom * 107639.1042
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square foot"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square inch"){
                        val result = unitFrom * 15500000
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square inch"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Acre"){
                        val result = unitFrom * 2.471053815
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result acre"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else{
                        Toast.makeText(this, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }

//                acre
                else if(selectFrom.selectedItem.toString() == "Acre"){
                    val unitFrom = binding.fromDigitEdittext.text.toString().toInt()
                    if(selectTo.selectedItem.toString() == "Acre"){
                        Toast.makeText(this, "Select Different Unit", Toast.LENGTH_SHORT).show()
                        binding.convertedDigit.text = ""
                    }
                    else if(selectTo.selectedItem.toString() == "Square Kilometer"){
                        val result = unitFrom * 0.004046856422
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square km"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square meter"){
                        val result = unitFrom * 4046.856422
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square meter"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square mile"){
                        val result = unitFrom * 4839.999529
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square mile"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square yard"){
                        val result = unitFrom * 4839.999529
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square yard"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square foot"){
                        val result = unitFrom * 43560.00001
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square foot"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Square inch"){
                        val result = unitFrom * 6272627.455
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result square inch"
                        binding.unitDigitShow.text = unitFrom.toString()
                        ClearUnit()
                    }
                    else if(selectTo.selectedItem.toString() == "Hectare"){
                        val result = unitFrom * 0.4046856422
                        addDataInRoom(selectFrom.selectedItem.toString(),unitFrom.toString(),selectTo.selectedItem.toString(),result.toString())

                        binding.convertedDigit.text = "$result hectare"
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