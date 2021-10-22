package com.example.roomdatabase.Room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = [RoutainEntity::class], version = 1)
abstract class RoutainDatabase:RoomDatabase() {
    abstract fun getLoginDAO() : RoomDTO

    companion object{
        private var instance: RoutainDatabase? = null


        fun getLoginDatabase(context: Context) : RoutainDatabase{

            if (instance != null){
                return instance!!
            }else{
                val builder = Room.databaseBuilder(
                    context.applicationContext,
                    RoutainDatabase::class.java,
                    "logindb"
                )

                builder.fallbackToDestructiveMigration()
                instance = builder.build()
            }

            return instance!!
        }
    }

}