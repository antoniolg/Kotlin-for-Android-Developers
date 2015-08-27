package com.antonioleiva.weatherapp.extensions

fun MutableMap<K, V?>.toVarargArray<K, V : Any>(): Array<out Pair<K, V>> =
        map({ Pair(it.key, it.value!!) }).toTypedArray()