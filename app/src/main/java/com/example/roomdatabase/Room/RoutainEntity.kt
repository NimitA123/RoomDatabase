package com.example.roomdatabase.Room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "DailyRoutain")
class RoutainEntity (
    @ColumnInfo(name= "Scrum1") var Scrum:String,
    @ColumnInfo(name= "DSA1")  var DSA:String,
    @ColumnInfo(name = "skillthon1") var skillthon:String,
    @ColumnInfo(name = "AndroidCoding1")  var AndroidCoding:String
        ) {
    @PrimaryKey(autoGenerate = true)
   @ColumnInfo(name = "id") var id: Int = 0
}