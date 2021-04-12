package com.example.KotlinDagger2.Model

import android.util.Log
import javax.inject.Inject

private const val TAG = "Car"
class PetrolEngine @Inject constructor() : Engine {

    override fun start() {
        Log.e(TAG, "Petrol engine started...")
    }
}