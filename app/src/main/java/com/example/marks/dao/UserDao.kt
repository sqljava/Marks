package com.example.marks.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.marks.tables.User


@Dao
interface UserDao {

    @Insert
    fun addUser(user: User)

    @Query("SELECT * FROM user_table ORDER BY name")
    fun showAllUsers()

    @Delete
    fun deleteUser()

    @Query("SELECT * FROM user_table WHERE id = :id")
    fun showUser(id: Int)
}