package com.example.to_dolist

class ToDoModel {
    companion object Factory {
        fun create(): ToDoModel = ToDoModel()
    }
    var objectId: String? = null
    var itemText: String? = null
    var done: Boolean? = false
}