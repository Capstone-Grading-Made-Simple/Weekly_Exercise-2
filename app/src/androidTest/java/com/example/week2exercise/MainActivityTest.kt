package com.example.week2exercise

import androidx.test.core.app.ActivityScenario.launch
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*


@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Test
    fun FollowButtonDisplayTest() {
        val activityScenario = launch(MainActivity::class.java)
        onView(withId(R.id.btnFollow)).perform(click())
        onView(withId(R.id.btnFollow)).perform(click())
        onView(withId(R.id.btnFollow)).perform(click())
        onView(withId(R.id.btnFollow)).perform(click())
        onView(withId(R.id.btnFollow)).perform(click())
        onView(withId(R.id.btnFollow)).check(matches(withText("Unfollow")));
    }
}