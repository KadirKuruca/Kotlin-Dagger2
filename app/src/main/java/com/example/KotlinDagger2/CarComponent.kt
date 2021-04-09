package com.example.KotlinDagger2

import com.example.KotlinDagger2.Model.Car
import dagger.Component

@Component
public interface CarComponent {
    fun getCar() : Car
}