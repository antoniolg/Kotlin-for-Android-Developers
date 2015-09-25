package com.antonioleiva.weatherapp.ui.utils

import kotlin.properties.ReadWriteProperty

object DelegatesExt {
    fun notNullSingleValue<T : Any>():
            ReadWriteProperty<Any?, T> = NotNullSingleValueVar()
}

private class NotNullSingleValueVar<T: Any>() : ReadWriteProperty<Any?, T> {
    private var value: T? = null

    public override fun get(thisRef: Any?, property: PropertyMetadata): T {
        return value ?: throw IllegalStateException("${property.name} not initialized")
    }

    public override fun set(thisRef: Any?, property: PropertyMetadata, value: T) {
        this.value = if (this.value == null) value
        else throw IllegalStateException("${property.name} already initialized")
    }
}