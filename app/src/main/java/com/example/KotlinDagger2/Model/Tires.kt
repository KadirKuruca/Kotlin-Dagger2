package com.example.KotlinDagger2.Model

import android.util.Log

private const val TAG = "Car"
class Tires {
    //We don't own this class so we can't annotate it with @Inject

    fun inflate(){
        Log.e(TAG, "Tires inflated")
    }
}