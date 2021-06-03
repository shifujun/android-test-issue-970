package com.example.app

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.Matchers
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Rule
    @JvmField
    val rule = RepeatRule()

    @Test
    @Repeat(100)
    fun test() {
        val intent = Intent()
        val packageName = ApplicationProvider.getApplicationContext<Context>().packageName
        intent.setClassName(
            packageName,
            "com.example.app.MainActivity"
        )
        ActivityScenario.launch<Activity>(intent)

        Espresso.onView(
            ViewMatchers.withTagValue(
                Matchers.`is`("button")
            )
        ).perform(ViewActions.click())
    }

}