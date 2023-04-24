package com.vladsem.greet_lib

import android.annotation.SuppressLint

class Greet {
    var initialized = false

    companion object {
        @SuppressLint("StaticFieldLeak")
        private var instance: Greet? = null

        @Synchronized
        fun getInstance(): Greet {
            if (instance == null) {
                instance = Greet()
            }
            return instance!!
        }
    }

    fun sayHello(name: String): String {
        return "Hello $name"
    }
}