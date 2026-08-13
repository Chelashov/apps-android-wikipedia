package org.wikipedia.lessons.lesson03.homework

import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import com.google.android.material.tabs.TabLayout
import org.wikipedia.R
import org.wikipedia.views.AppTextView
import kotlin.jvm.java

class OnbordingScreen {
    val skipButton = listOf(
        MaterialButton::class.java,
        R.id.fragment_onboarding_skip_button,
        "@string/onboarding_skip"
    )
    val pageIndicator = listOf(
        TabLayout::class.java,
        R.id.view_onboarding_page_indicator
    )
    val continueButton = listOf(
        MaterialButton::class.java,
        R.id.fragment_onboarding_forward_button,
        "@string/onboarding_continue"
    )
    val languageButton = listOf(
        MaterialButton::class.java,
        R.id.addLanguageButton,
        "@string/onboarding_multilingual_add_language_text"
    )
    val languageList = listOf(
        RecyclerView::class.java,
        R.id.languagesList
    )
    val subtitleText = listOf(
        AppTextView::class.java,
        R.id.secondaryTextView
    )
    val titleText = listOf(
        AppTextView::class.java,
        R.id.primaryTextView
    )
    val image = listOf(
        AppCompatImageView::class.java,
        R.id.imageViewCentered
    )
    val startButton = listOf(
        MaterialButton::class.java,
        R.id.fragment_onboarding_done_button,
        "@string/onboarding_get_started"
    )
}