package org.wikipedia.lessons.lesson11.homework

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import junit.framework.TestCase.assertTrue
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.wikipedia.lessons.lesson09.homework.OnbordingScreen
import org.wikipedia.main.MainActivity
import java.util.Locale

class ADBTests : TestCase() {

    @get:Rule
    val testRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun rotateScreenAndCheckOrientation() {
        before("Поворачивает экран и проверяет ориентацию")
        {}.after { device.uiDevice.setOrientationNatural() }.run {
            device.exploit.rotate()
            val act = device.uiDevice.isNaturalOrientation
            val exp = false
            Assert.assertEquals(exp,act)
        }
    }


    @Test
    fun turnOffTurnONAndCheckElement() {
        run("Выключает экран, затем включает и проверяет отображение элемента")
        {device.uiDevice.sleep()
        device.uiDevice.wakeUp()
            OnbordingScreen.skipButton.isDisplayed()
        }
    }

    @Test
    fun closeAppOpenAppAndCheckElement() {
        run ("Сворачивает приложение, затем разворачивает и проверяет отображение элемента")
        {device.exploit.pressHome()
        device.uiDevice.pressRecentApps()
        device.uiDevice.pressRecentApps()
            OnbordingScreen.skipButton.isDisplayed()
        }
    }

    @Test
    fun changeAppLanguageAndCheckText(){
        before("Меняет язык приложения и проверяет текст кнопки Skip"){}.after {  }
            .run { device.language.switchInApp(Locale("French")) }
    }

    @Test
    fun checkMainActivityIsActive() {
        run("Проверяет, что MainActivity активна") {
            testRule.scenario.onActivity { activity ->
                assertTrue(
                    "MainActivity не является активной Activity",
                    activity is MainActivity
                )
            }
        }
    }



}