package com.example.week2exercise

import org.junit.Test

import org.junit.Assert.*

class UserTest {

    @Test
    fun `test user class`() {
        val user = User("name", "description", 0, false)
        assertEquals("name", user.getName())
        assertEquals("description", user.getDescription())
        assertEquals(0, user.getId())
        assertEquals(false, user.getFollowed())
    }

}