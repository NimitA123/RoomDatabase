package com.example.roomdatabase.Room

import androidx.room.*

@Dao
interface RoomDTO {
     @Insert(onConflict = OnConflictStrategy.ABORT)
     fun insert(routainEntity: RoutainEntity)
     @Query("SELECT * FROM dailyroutain")
     fun getAll(): List<RoutainEntity>
     @Update
     fun updateTask(routainEntity: RoutainEntity)
     @Delete
     fun deleteTask(routainEntity: RoutainEntity)




}