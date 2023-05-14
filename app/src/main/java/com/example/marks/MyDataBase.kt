package com.example.marks

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.marks.dao.UserDao
import com.example.marks.tables.User


@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class MyDataBase: RoomDatabase() {

    abstract fun getUserDao(): UserDao

    companion object{

        private var instance : MyDataBase? = null

        fun getMyDataBase(context: Context):MyDataBase{

            if (instance==null){
                instance = Room.databaseBuilder(context, MyDataBase::class.java,
                    "my_database").allowMainThreadQueries().build()
            }
            return instance!!
        }
    }


}