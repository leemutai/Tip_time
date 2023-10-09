package com.example.tiptime

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat
import java.time.temporal.TemporalAmount

class TipCalculatorTests {
    @Test
    fun  calculateTip_20PercentNoRoundup( amount: Double, tipPercent: Double, roundup: Boolean) {
        val amount = 10.0
        val tipPercent = 20.0
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)

    }
}