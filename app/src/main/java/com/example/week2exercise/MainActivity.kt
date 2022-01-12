package com.example.week2exercise


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = User(
            "MAD",
            "Lorem ipsum dolor sit amet, consectetur  adipiscing elit, sed do eiusmod tempor  incididunt ut labore et dolore magna aliqua  ",
            0,
            false
            )

        val name = findViewById<TextView>(R.id.Name)
        val description = findViewById<TextView>(R.id.Description)
        val follow = findViewById<Button>(R.id.btnFollow)

        name.setText(user.getName())
        description.setText(user.getDescription())

        follow.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {

                user.UpdateFollow()
                if (user.getFollowed() == false) {

                    follow.setText("Follow")

                } else {

                    follow.setText("Unfollow")

                }
            }
        })
    }
}