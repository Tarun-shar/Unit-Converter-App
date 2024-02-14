package com.example.unitconverterapp.Room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [UnitEntity::class], version = 1)
abstract class UnitDatabase: RoomDatabase() {

    abstract fun unitDao() : UnitDao

    companion object{
        @Volatile
        private var INSTANCE: UnitDatabase? = null

        fun getDatabase(context:Context): UnitDatabase{

//            val tempInstance = INSTANCE
//            if(tempInstance != null){
//                return tempInstance
//            }

            synchronized(this){
                    val instance = Room.databaseBuilder(
                        context.applicationContext,
                        UnitDatabase::class.java,
                        "UnitDB")
                        .build()

                INSTANCE = instance
                return instance
                }
        }

    }
}