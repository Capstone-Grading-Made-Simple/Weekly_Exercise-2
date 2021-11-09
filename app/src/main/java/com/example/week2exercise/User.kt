package com.example.week2exercise

class User {
    private var name: String = "MAD"
    private var description : String = "Lorem ipsum dolor sit amet, consectetur  adipiscing elit, sed do eiusmod tempor  incididunt ut labore et dolore magna aliqua  "
    private var id: Int = 0
    private var followed: Boolean = false

    init {


    }

    fun UserName() : String {
        return this.name
    }

    fun UserDescription() : String {
        return this.description
    }

    fun UserFollowed() : Boolean {
        return this.followed
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