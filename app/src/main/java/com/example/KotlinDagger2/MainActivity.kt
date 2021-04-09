package com.example.KotlinDagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.KotlinDagger2.Model.Car

class MainActivity : AppCompatActivity() {

    private lateinit var car : Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerCarComponent.create()
        car = component.getCar()
        car.drive()
    }
}