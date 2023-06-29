package com.example.lesson_1_7.domain.repositories

import com.example.lesson_1_7.data.models.ContactEntity

interface ContactRepository {

    fun addContact(contactEntity: ContactEntity)

    fun getContact(): List<ContactEntity>

    fun updateContact(contactEntity: ContactEntity)

    fun deleteContact(contactEntity: ContactEntity)
}