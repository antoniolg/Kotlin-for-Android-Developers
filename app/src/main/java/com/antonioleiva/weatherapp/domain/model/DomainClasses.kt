package com.antonioleiva.weatherapp.domain.model

data class ForecastList(val city: String, val country: String,
                        val dailyForecast: List<Forecast>) {
    public fun get(position: Int): Forecast = dailyForecast[position]
    public fun size(): Int = dailyForecast.size()
}

data class Forecast(val date: String, val description: String, val high: Int, val low: Int)