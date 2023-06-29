package com.example.lesson_1_7.data.repositories

import com.example.lesson_1_7.data.local.ContactDao
import com.example.lesson_1_7.data.models.ContactEntity
import com.example.lesson_1_7.domain.repositories.ContactRepository

class ContactRepositoryImpl(private val contactDao: ContactDao):ContactRepository {
    override fun addContact(contactEntity: ContactEntity) {
        contactDao.addContact(contactEntity)
    }

    override fun getContact(): List<ContactEntity> {
        return contactDao.getContact()
    }

    override fun updateContact(contactEntity: ContactEntity) {
        contactDao.updateContact(contactEntity)
    }

    override fun deleteContact(contactEntity: ContactEntity) {
        contactDao.deleteContact(contactEntity)
    }
}