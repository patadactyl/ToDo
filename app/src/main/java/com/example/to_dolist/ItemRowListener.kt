package com.example.to_dolist

interface ItemRowListener {
    fun modifyItemState(itemObjectId: String, isDone: Boolean)
    fun onItemDelete(itemObjectId: String)
}