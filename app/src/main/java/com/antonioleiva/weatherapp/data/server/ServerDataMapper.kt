package com.antonioleiva.weatherapp.data.server

import com.antonioleiva.weatherapp.domain.model
import com.antonioleiva.weatherapp.domain.model.ForecastList

class ServerDataMapper {

    fun convertToDomain(zipCode: Long, forecast: ForecastResult): ForecastList = with(forecast) {
        ForecastList(zipCode, city.name, city.country, convertForecastListToDomain(list))
    }

    private fun convertForecastListToDomain(list: List<Forecast>): List<model.Forecast> {
        return list map { convertForecastItemToDomain(it) }
    }

    private fun convertForecastItemToDomain(forecast: Forecast): model.Forecast = with(forecast) {
        model.Forecast(-1, dt * 1000, weather[0].description, temp.max.toInt(), temp.min.toInt(),
                generateIconUrl(weather[0].icon))
    }

    private fun generateIconUrl(iconCode: String) = "http://openweathermap.org/img/w/$iconCode.png"
}