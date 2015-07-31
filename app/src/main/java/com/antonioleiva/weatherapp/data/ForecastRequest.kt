package com.antonioleiva.weatherapp.data

import com.google.gson.Gson
import java.net.URL

public class ForecastRequest(val zipcode: String) {

    companion object {
        private val URL = "http://api.openweathermap.org/data/2.5/" +
                "forecast/daily?mode=json&units=metric&cnt=7&q="
    }

    public fun execute(): ForecastResult {
        val forecastJsonStr = URL(URL + zipcode).readText()
        return Gson().fromJson(forecastJsonStr, ForecastResult::class.java)
    }
}