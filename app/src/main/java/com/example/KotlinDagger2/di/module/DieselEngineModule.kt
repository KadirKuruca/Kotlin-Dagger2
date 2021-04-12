package com.example.KotlinDagger2.di.module

import com.example.KotlinDagger2.Model.DieselEngine
import com.example.KotlinDagger2.Model.Engine
import com.example.KotlinDagger2.Model.PetrolEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun provideEngine(engine: DieselEngine) : Engine
}