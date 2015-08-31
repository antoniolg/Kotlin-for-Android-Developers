package com.antonioleiva.weatherapp.domain.datasource

import com.antonioleiva.weatherapp.domain.model.ForecastList

interface ForecastDataSource {
    fun requestForecastByZipCode(zipCode: Long, date: Long): ForecastList?
}