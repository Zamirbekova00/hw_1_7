package com.example.lesson_1_7.domain.usecase

import com.example.lesson_1_7.data.models.ContactEntity
import com.example.lesson_1_7.domain.repositories.ContactRepository

class AddContactUseCase(private val contactRepository: ContactRepository) {

    fun addContact(contactEntity: ContactEntity){
        contactRepository.addContact(contactEntity)

    }
}