package com.example.contacts

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Contact::class],
    version = 1
)
abstract class Contactsdatabase: RoomDatabase() {
    abstract val dao:ContactDao
}