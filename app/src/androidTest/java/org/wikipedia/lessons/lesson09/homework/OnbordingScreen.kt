package org.wikipedia.lessons.lesson09.homework

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.text.KButton
import org.wikipedia.R

object OnbordingScreen: KScreen<OnbordingScreen>() {
    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null

    val skipButton = KButton{
        withId(R.id.fragment_onboarding_skip_button)
    }
}