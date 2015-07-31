package com.antonioleiva.weatherapp.domain.commands

public interface Command<T> {
    fun execute(): T
}