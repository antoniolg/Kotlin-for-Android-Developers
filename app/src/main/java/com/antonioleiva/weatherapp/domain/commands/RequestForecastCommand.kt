package com.antonioleiva.weatherapp.domain.commands

import com.antonioleiva.weatherapp.data.ForecastRequest
import com.antonioleiva.weatherapp.domain.mappers.ForecastDataMapper
import com.antonioleiva.weatherapp.domain.model.ForecastList

class RequestForecastCommand(private val zipCode: String) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}