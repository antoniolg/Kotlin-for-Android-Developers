package com.antonioleiva.weatherapp.domain.commands

interface Command<T> {
    fun execute(): T
}