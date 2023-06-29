package com.example.lesson_1_7.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contacts")
data class ContactEntity(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val name: String,
    val number: Int,
    val address:String
    )
