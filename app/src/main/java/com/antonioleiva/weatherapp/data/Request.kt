package com.antonioleiva.weatherapp.data

import android.util.Log
import java.net.URL

public class Request(val url: String) {

    public fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }

}