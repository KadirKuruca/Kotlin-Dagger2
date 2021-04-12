package com.example.KotlinDagger2.di.component

import com.example.KotlinDagger2.MainActivity
import com.example.KotlinDagger2.Model.Car
import com.example.KotlinDagger2.di.module.DieselEngineModule
import com.example.KotlinDagger2.di.module.PetrolEngineModule
import com.example.KotlinDagger2.di.module.WheelsModule
import dagger.Component

@Component (modules = [WheelsModule::class, DieselEngineModule::class])
public interface CarComponent {
    fun getCar() : Car

    fun inject(mainActivity: MainActivity)
}