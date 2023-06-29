package com.example.lesson_1_7.data.local
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.lesson_1_7.data.models.ContactEntity

@Database(entities = [ContactEntity::class], version = 1)
abstract class ContactDatabase : RoomDatabase() {

    abstract fun contactDao(): ContactDao
}