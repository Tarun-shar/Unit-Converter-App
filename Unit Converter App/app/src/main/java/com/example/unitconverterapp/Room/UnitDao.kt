package com.example.unitconverterapp.Room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface UnitDao {

//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    @Query("select Distinct * from units_table")

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(unitEntity: UnitEntity)

    @Update
    suspend fun update(unitEntity: UnitEntity)

    @Delete
    fun delete(unitEntity: UnitEntity)

    @Query("delete from units_table")
    suspend fun deleteAllUnits()

    @Query("select * from units_table order by id ASC")
    fun getAllUnits(): LiveData<List<UnitEntity>>
}