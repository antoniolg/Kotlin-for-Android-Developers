package com.antonioleiva.weatherapp.domain.commands

interface Command<out T> {
    suspend fun execute(): T
}