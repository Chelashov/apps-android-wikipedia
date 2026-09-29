package org.wikipedia.lessons.lesson10.homework

import com.google.android.material.tabs.TabLayout
import com.kaspersky.components.kautomator.component.text.UiButton
import com.kaspersky.components.kautomator.component.text.UiTextView
import com.kaspersky.components.kautomator.screen.UiScreen

object OnbordingScreenUI: UiScreen<OnbordingScreenUI>() {
    override val packageName = "org.wikipedia.alpha"

    val continueButton = UiButton{
        withId(this@OnbordingScreenUI.packageName, "fragment_onboarding_forward_button")
    }

    val skipButton = UiButton{
        withId(this@OnbordingScreenUI.packageName, "fragment_onboarding_skip_button")
    }

    val pagerButton1 = UiButton{
        withIndex(0,
            { withParent { isInstanceOf(TabLayout.TabView::class.java) } })
    }

    val pagerButton2 = UiButton{
        withIndex(1,
            { withParent { isInstanceOf(TabLayout.TabView::class.java) } })
    }

    val pagerButton3 = UiButton{
        withIndex(2,
            { withParent { isInstanceOf(TabLayout.TabView::class.java) } })
    }

    val pagerButton4 = UiButton{
        withIndex(3,
            { withParent { isInstanceOf(TabLayout.TabView::class.java) } })
    }

    val primaryText = UiTextView{
        withId(this@OnbordingScreenUI.packageName,"primaryTextView")
    }

    val getStartedButton = UiButton{
        withId(this@OnbordingScreenUI.packageName, "fragment_onboarding_done_button")
    }

}