package net.gas.contactbook.ui.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "posts")
data class Posts (
    @PrimaryKey val id: Int,
    val name: String?,
    val rangir: String?
)
