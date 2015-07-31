package com.antonioleiva.weatherapp.domain.commands

interface Command<out T> {
    fun execute(): T
}