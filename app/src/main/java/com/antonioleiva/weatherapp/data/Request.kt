package com.antonioleiva.weatherapp.data

import android.util.Log
import java.net.URL

class Request(private val url: String) {

    fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }

}