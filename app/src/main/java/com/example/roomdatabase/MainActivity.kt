package com.example.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.roomdatabase.Adapter.RoutainAdapter
import com.example.roomdatabase.Room.RoomDTO
import com.example.roomdatabase.Room.RoutainDatabase
import com.example.roomdatabase.Room.RoutainEntity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity(){
    lateinit var roomDTO: RoomDTO
    lateinit var  routainDatabase: RoutainDatabase
    lateinit var  adapter:RoutainAdapter
    private var routineList = listOf<RoutainEntity>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //routainDatabase will gives routainDatabase object
        routainDatabase = RoutainDatabase.getLoginDatabase(this)
        roomDTO = routainDatabase.getLoginDAO()
        floatingActionButton.setOnClickListener {
           var data= RoutainEntity("Nrupul", "Ankush", "ISha","Shivraj")
           CoroutineScope(Dispatchers.IO).launch {
               roomDTO.insert(data)
           }
        }
        CoroutineScope(Dispatchers.IO).launch {
            routineList = roomDTO.getAll()

        }
            floatingActionButton.setOnClickListener {
            adapter = RoutainAdapter(routineList)
            var linearLayoutManager = LinearLayoutManager(this)
            rvRecylerView.adapter = adapter
            rvRecylerView.layoutManager = linearLayoutManager
        }
        button1.setOnClickListener {
            var data1 =  RoutainEntity("Aman", "Ankush", "Mythri","Lloyd")
            CoroutineScope(Dispatchers.IO).launch {
                data1.id = 1;
                roomDTO.updateTask(data1)
            }
        }
        button2.setOnClickListener {
            var data1 =  RoutainEntity("Aman", "Ankush", "Mythri","Lloyd")
            data1.id = 1;
            CoroutineScope(Dispatchers.IO).launch {
                roomDTO.deleteTask(data1)
            }
        }

    }


    }


