package com.antonioleiva.weatherapp.data.server

import com.google.gson.Gson
import java.net.URL

class ForecastByZipCodeRequest(val zipCode: Long, val gson: Gson = Gson()) {

    companion object {
        private val URL = "http://api.openweathermap.org/data/2.5/" +
                "forecast/daily?mode=json&units=metric&cnt=7&q="
    }

    fun execute(): ForecastResult {
        val forecastJsonStr = URL(URL + zipCode).readText()
        return gson.fromJson(forecastJsonStr, ForecastResult::class.java)
    }
}