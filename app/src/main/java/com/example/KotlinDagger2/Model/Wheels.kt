package com.example.KotlinDagger2.Model

import javax.inject.Inject

class Wheels(private var rims: Rims, private var tires: Tires) {
    //We don't own this class so we can't annotate it with @Inject

}