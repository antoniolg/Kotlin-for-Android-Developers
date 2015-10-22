package com.antonioleiva.weatherapp

import com.antonioleiva.weatherapp.extensions.toDateString
import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.DateFormat

class ExtensionsTest {

    @Test
    fun `"longToDateString" returns valid value`() {
        assertEquals("Oct 19, 2015", 1445275635000L.toDateString())
    }

    @Test
    fun `"longToDateString" with full format returns valid value`() {
        assertEquals("Monday, October 19, 2015", 1445275635000L.toDateString(DateFormat.FULL))
    }

}