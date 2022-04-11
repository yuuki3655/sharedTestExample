package com.example.sharedtestexample.sharedTest

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Shared test. This test can run as a unit test or an instrumentation test.
 */
@RunWith(AndroidJUnit4::class)
class ExampleSharedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.sharedtestexample", appContext.packageName)
    }
}