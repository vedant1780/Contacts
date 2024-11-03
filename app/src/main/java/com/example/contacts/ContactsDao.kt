package com.example.contacts

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface ContactDao {
    @Upsert
    suspend fun upsertContacts(contact: Contact)
    @Delete
    suspend fun deleteContact(contact: Contact)
    @Query("SELECT * FROM contact ORDER BY firstName ASC")
    fun getContactsOrderedByFirstname(): Flow<List<Contact>>
    @Query("SELECT * FROM contact ORDER BY lastName ASC")
    fun getContactsOrderedByLastname(): Flow<List<Contact>>
    @Query("SELECT * FROM contact ORDER BY phoneNumber ASC")
    fun getContactsOrderedByPhoneNumber(): Flow<List<Contact>>


}