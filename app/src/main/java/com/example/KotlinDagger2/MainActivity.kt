package com.example.KotlinDagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.KotlinDagger2.Model.Car
import com.example.KotlinDagger2.di.component.DaggerCarComponent
import com.example.KotlinDagger2.di.module.WheelsModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car : Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerCarComponent.create()
        component.inject(this)
        car.drive()

    }
}