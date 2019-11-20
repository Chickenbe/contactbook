package net.gas.contactbook.ui.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "photos")
data class Photos (
    @PrimaryKey val id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.BLOB) var photo: ByteArray?
)