package com.example.contentprovider

import android.database.Cursor

interface NoteCllickedListener {
    fun noteClickedItem(cursor: Cursor)
    fun noteRemoveItem(cursor: Cursor?)
}