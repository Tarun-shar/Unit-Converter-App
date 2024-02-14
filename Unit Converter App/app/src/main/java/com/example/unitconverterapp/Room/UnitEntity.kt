package com.example.unitconverterapp.Room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "units_table")
data class UnitEntity(

    @PrimaryKey(autoGenerate = true) val id:Int?,
    @ColumnInfo("FromUnitName") val fromUnitName:String?,
    @ColumnInfo("FromUnitDigit") val fromUnitNumber:String?,
    @ColumnInfo("ToUnitName") val toUnitName:String?,
    @ColumnInfo("ToUnitDigit") val toUnitNumber:String?


)
