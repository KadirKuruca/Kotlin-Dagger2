package com.example.KotlinDagger2.Model

import android.util.Log
import javax.inject.Inject

private const val TAG = "Car"

public class Car @Inject constructor(private var engine: Engine, private var wheels: Wheels) {

    fun drive(){
        Log.e(TAG, "driving...")
    }
}