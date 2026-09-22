package org.wikipedia.lessons.lesson09.homework

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.hamcrest.core.IsInstanceOf
import org.junit.Rule
import org.junit.Test
import org.wikipedia.activitytab.OnboardingScreen
import org.wikipedia.feed.announcement.AnnouncementCardView
import org.wikipedia.feed.featured.FeaturedArticleCardView
import org.wikipedia.lessons.lesson08.homework.ExploreScreen
import org.wikipedia.main.MainActivity

class FirstTests : TestCase() {

    @get:Rule
    val testRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkDisableFeaturedArticle() {
        run("Проверяет скрытие блока Featured Article") {
            step("Нажимает кнопку Skip") {
                OnbordingScreen.skipButton.click()
            }

            ExploreScreen.items {
                childWith<FeaturedArticle> { isInstanceOf(FeaturedArticleCardView::class.java) }
                perform {
                    step("Проверяет отображение блока Featured Article экрана Explore")
                    { isDisplayed() }
                }

                childWith<Customize> { isInstanceOf(AnnouncementCardView::class.java) }
                    .perform {
                        step("Нажимает на кнопку Customize")
                        { buttonCustomize.click() }
                    }
            }

            CustomizeScreen {
                items.childWith<CustomizeRecycler> {
                    withDescendant { withText("Featured article") }
                }
                    .perform { step("Отключает отображение FeaturedArticle") { switch.click() } }
                backButton.click()
            }
            ExploreScreen.items {
                childWith<FeaturedArticle> { isInstanceOf(FeaturedArticleCardView::class.java) }
                    .perform {
                    step("Проверяет,что бло Featured Article экрана Explore не отображается")
                    { header.doesNotExist() }
                }
            }
        }
    }
}
