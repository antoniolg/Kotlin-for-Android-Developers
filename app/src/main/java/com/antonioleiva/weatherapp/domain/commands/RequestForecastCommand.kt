package com.antonioleiva.weatherapp.domain.commands

import com.antonioleiva.weatherapp.domain.datasource.ForecastProvider
import com.antonioleiva.weatherapp.domain.model.ForecastList

class RequestForecastCommand(
        private val zipCode: Long,
        private val forecastProvider: ForecastProvider = ForecastProvider()) :
        Command<ForecastList> {

    companion object {
        val DAYS = 7
    }

    override fun execute() = forecastProvider.requestByZipCode(zipCode, DAYS)
}