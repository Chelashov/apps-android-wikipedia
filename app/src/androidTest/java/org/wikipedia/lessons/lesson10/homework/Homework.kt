package org.wikipedia.lessons.lesson10.homework

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.MainActivity

class FirstUITests : TestCase() {

    @get:Rule
    val testRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkElementsOnSecondPageOfOnboardingScreen(){
        run ("Проверяет наполнение второй страницы экрана онбординга"){
            OnbordingScreenUI{
                pagerButton2.click()
                skipButton.isDisplayed()
                continueButton.isDisplayed()
                primaryText.containsText("New ways to explore")
            }

        }
    }

    @Test
    fun checkElementsOnTrirdPageOfOnboardingScreen(){
        run ("Проверяет наполнение третьей страницы экрана онбординга"){
            OnbordingScreenUI{
                pagerButton3.click()
                skipButton.isDisplayed()
                continueButton.isDisplayed()
                primaryText.containsText("Reading lists with sync")
            }

        }
    }

    @Test
    fun checkElementsOnFirstPageOfOnboardingScreen(){
        run ("Проверяет наполнение первой страницы экрана онбординга"){
            OnbordingScreenUI{
                pagerButton3.click()
                pagerButton1.click()
                skipButton.isDisplayed()
                continueButton.isDisplayed()
                primaryText.containsText("The Free Encyclopedia")
            }

        }
    }

    @Test
    fun checkElementsOnFourthPageOfOnboardingScreen(){
        run ("Проверяет наполнение четвертой страницы экрана онбординга"){
            OnbordingScreenUI{
                pagerButton4.click()
                skipButton.isNotDisplayed()
                continueButton.isNotDisplayed()
                getStartedButton.isDisplayed()
                primaryText.containsText("Data & Privacy")
            }

        }
    }


}