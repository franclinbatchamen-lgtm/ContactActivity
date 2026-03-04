package com.example.contactactivityas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        var firstName = "Mikey"
        var lastName = "williams"
        var Adress = "7FairmountRoad"
        var isMale = true
        var dayOfBirth = 22
        var monthOfBirth = 5
        var yearOfBirth = 2000

        println("${firstName} ${lastName}The place in which you reside${Adress}If i am not mistaken " +
                "your gender is${true} and your born in the ${dayOfBirth} of the ${monthOfBirth}th in" +
                " ${yearOfBirth}" )

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}