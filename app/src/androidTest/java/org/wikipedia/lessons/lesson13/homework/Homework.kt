package org.wikipedia.lessons.lesson13.homework

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.espresso.web.assertion.WebViewAssertions.webMatches
import androidx.test.espresso.web.sugar.Web.onWebView
import androidx.test.espresso.web.webdriver.DriverAtoms.findElement
import androidx.test.espresso.web.webdriver.DriverAtoms.getText
import androidx.test.espresso.web.webdriver.DriverAtoms.webScrollIntoView
import androidx.test.espresso.web.webdriver.Locator
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.hamcrest.Matchers.containsString
import org.junit.Rule
import org.junit.Test
import org.wikipedia.R
import org.wikipedia.main.MainActivity
import org.wikipedia.feed.featured.FeaturedArticleCardView
import org.wikipedia.lessons.lesson08.homework.ExploreScreen
import org.wikipedia.lessons.lesson09.homework.FeaturedArticle
import org.wikipedia.lessons.lesson09.homework.OnbordingScreen


class Homework : TestCase() {

    @get:Rule
    val testRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkReferencesAndRedirectLink() {
        run("Проверяет References, сноску и redirect-ссылку") {

            step("Пропускаем экран онбординга") {
                OnbordingScreen.skipButton.click()
            }

            step("Находим карточку Featured Article и открываем её") {
                ExploreScreen.items
                    .childWith<FeaturedArticle> {
                        isInstanceOf(FeaturedArticleCardView::class.java)
                    }
                    .perform {
                        block.click()
                    }
            }

            step("Закрываем окно Wikipedia Games") {
                onView(withId(R.id.closeButton))
                    .perform(click())
            }

            step("Прокручиваем статью до References") {
                onWebView(withId(R.id.page_web_view))
                    .withElement(
                        findElement(
                            Locator.XPATH,
                            "//*[self::h2 or self::h3][contains(normalize-space(.), 'References')]"
                        )
                    )
                    .perform(webScrollIntoView())
                    .check(
                        webMatches(
                            getText(),
                            containsString("References")
                        )
                    )
            }

            step("Находим пятую сноску и нажимаем на неё") {
                onWebView(withId(R.id.page_web_view))
                    .withElement(
                        findElement(
                            Locator.CSS_SELECTOR,
                            "a[href*='cite_note-5']"
                        )
                    )
                    .perform(webScrollIntoView())
                    .perform(
                        androidx.test.espresso.web.webdriver.DriverAtoms.webClick()
                    )
            }

            step("Проверяем всплывающее окно Reference") {
                onView(withId(R.id.reference_title_text))
                    .check(matches(withText(containsString("Reference"))))

                onView(withId(R.id.reference_id))
                    .check(matches(isDisplayed()))
                    .check(matches(withText(containsString("."))))
            }

            step("Закрываем всплывающее окно") {
                pressBack()
            }

            step("Находим redirect-ссылку и нажимаем на неё") {
                onWebView(withId(R.id.page_web_view))
                    .withElement(
                        findElement(
                            Locator.CLASS_NAME,
                            "mw-redirect"
                        )
                    )
                    .perform(webScrollIntoView())
                    .perform(
                        androidx.test.espresso.web.webdriver.DriverAtoms.webClick()
                    )
            }

            step("Проверяем окно предпросмотра статьи") {
                onView(withId(R.id.link_preview_primary_button))
                    .check(matches(isDisplayed()))
            }

            step("Переходим в новую статью") {
                onView(withId(R.id.link_preview_primary_button))
                    .perform(click())
            }

            step("Прокручиваем новую статью до References") {
                onWebView(withId(R.id.page_web_view))
                    .withElement(
                        findElement(
                            Locator.XPATH,
                            "//*[self::h2 or self::h3][contains(normalize-space(.), 'References')]"
                        )
                    )
                    .perform(webScrollIntoView())
                    .check(
                        webMatches(
                            getText(),
                            containsString("References")
                        )
                    )
            }
        }
    }
}