package com.example.lesson_1_7.data.local

import androidx.room.*
import com.example.lesson_1_7.data.models.ContactEntity

@Dao
interface ContactDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addContact(contactEntity: ContactEntity)

    @Query("SELECT * FROM contacts")
    suspend fun getContact(): List<ContactEntity>

    @Update
    suspend fun updateContact(contactEntity: ContactEntity)

    @Delete
    suspend fun deleteContact(contactEntity: ContactEntity)
}