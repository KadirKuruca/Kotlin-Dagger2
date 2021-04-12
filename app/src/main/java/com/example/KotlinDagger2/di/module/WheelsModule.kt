package com.example.KotlinDagger2.di.module

import com.example.KotlinDagger2.Model.Rims
import com.example.KotlinDagger2.Model.Tires
import com.example.KotlinDagger2.Model.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    companion object{
        @Provides
        fun provideRims() : Rims{
            return Rims()
        }

        @Provides
        fun provideTries() : Tires{
            var tires = Tires()
            tires.inflate()
            return tires
        }

        @Provides
        fun provideWheels(rims : Rims, tires : Tires) : Wheels{
            return Wheels(rims, tires)
        }
    }
}