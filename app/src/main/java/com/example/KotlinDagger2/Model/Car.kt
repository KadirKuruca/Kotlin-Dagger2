package com.example.KotlinDagger2.Model

import android.util.Log
import javax.inject.Inject

private const val TAG = "Car"

/**
 * Constructor is First, field is Second and method is third is run.
 */
public class Car @Inject constructor(private var wheels: Wheels){ //Constructor injection

    @Inject lateinit var engine: Engine //Field injection

    fun drive(){
        engine.start()
        Log.e(TAG, "driving...")
    }

    @Inject //Method injection
    fun enableRemote(remote : Remote){
        remote.setListener(this)
    }
}