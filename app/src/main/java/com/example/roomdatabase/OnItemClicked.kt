package com.example.roomdatabase

import com.example.roomdatabase.Room.RoomDTO
import com.example.roomdatabase.Room.RoutainEntity

interface OnItemClicked {
    fun EditUI(routainEntity: RoutainEntity)
    fun DeleteUI(routainEntity: RoutainEntity)
}