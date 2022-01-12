package com.example.week2exercise

class User (name: String, description: String, id: Int, followed: Boolean) {
    private var name: String = name
    private var description : String = description
    private var id: Int = id
    private var followed: Boolean = followed

    init {

    }

    fun getName() : String {
        return name
    }

    fun getDescription() : String {
        return description
    }

    fun getId() : Int {
        return id
    }

    fun getFollowed() : Boolean {
        return followed
    }

    fun UpdateFollow() {
        if (this.followed == false){
            this.followed = true
        }
        else {
            this.followed = false
        }
    }
}