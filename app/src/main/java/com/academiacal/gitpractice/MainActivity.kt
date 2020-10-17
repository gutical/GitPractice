package com.academiacal.gitpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("this is contained in my second commit")
        println("local changes")
        println("experimental")
        println("CHANGE 4")
        println("this line will be merge")
        println("hello from your friend")
    }
}