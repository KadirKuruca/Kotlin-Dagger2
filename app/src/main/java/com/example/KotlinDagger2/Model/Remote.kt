package com.example.KotlinDagger2.Model

import android.util.Log
import javax.inject.Inject

private const val TAG = "Car"
public class Remote @Inject constructor(){

    fun setListener(car : Car){
        Log.e(TAG, "Remote connected", )
    }
}