package com.example.week2exercise


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = User()


        val name = findViewById<TextView>(R.id.Name)
        val description = findViewById<TextView>(R.id.Description)
        val follow = findViewById<Button>(R.id.follow)

        name.setText(user.UserName())
        description.setText(user.UserDescription())

        follow.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {

                user.UpdateFollow()
                if (user.UserFollowed() == false) {

                    follow.setText("Follow")

                } else {

                    follow.setText("Unfollow")

                }
            }
        })
    }
}