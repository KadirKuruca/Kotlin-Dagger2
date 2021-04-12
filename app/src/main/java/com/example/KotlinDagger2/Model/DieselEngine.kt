package com.example.KotlinDagger2.Model

import android.util.Log
import javax.inject.Inject

private const val TAG = "Car"
class DieselEngine @Inject constructor() : Engine {

    override fun start() {
        Log.e(TAG, "Diesel engine started...")
    }

}