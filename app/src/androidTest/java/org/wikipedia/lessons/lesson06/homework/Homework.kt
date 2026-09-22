//package org.wikipedia.lessons.lesson06.homework
//
//import androidx.appcompat.widget.AppCompatImageView
//import androidx.browser.R
//import io.github.kakaocup.kakao.common.views.KView
//import io.github.kakaocup.kakao.image.KImageView
//import io.github.kakaocup.kakao.switch.KSwitch
//import io.github.kakaocup.kakao.text.KButton
//import io.github.kakaocup.kakao.text.KTextView
//
//val readingTitle = KTextView {
//    withId(R.id.textSettingsCategory)
//}
//
//val textSize =  KTextView {
//    withId(R.id.text_size_percent)
//}
//
//val textDecreaseButton = KButton{
//    withId(R.id.buttonDecreaseTextSize)
//}
//
//val textIncreaseButton = KButton{
//    withId(R.id.buttonIncreaseTextSize)
//}
//
//val textSizeBar = KView{
//    withId(R.id.text_size_seek_bar)
//}
//
//val fontTypeButton1 = KButton {
//    withId(R.id.button_font_family_sans_serif)
//}
//
//val fontTypeButton2 = KButton {
//    withId(R.id.button_font_family_serif)
//}
//
//val glassesImage = KImageView {
//    withParent {
//        withId(R.id.readingFocusModeContainer)
//    }
//    isInstanceOf(AppCompatImageView::class.java)
//}
//
//val readingFocusMode = KSwitch{
//    withId(R.id.theme_chooser_reading_focus_mode_switch)
//}
//
//val theme = KTextView {
//    withText("Theme")
//}
//
//val lightThemeButton = KButton {
//    withId(R.id.button_theme_light)
//}
//
//val sepiaThemeButton = KButton {
//    withId(R.id.button_theme_sepia)
//}
//
//val darkThemeButton = KButton {
//    withId(R.id.button_theme_dark)
//}
//
//val blackThemeButton = KButton {
//    withId(R.id.button_theme_black)
//}
//
//val matchSystemTheme = KSwitch{
//    withId(R.id.theme_chooser_match_system_theme_switch)
//}
//
//val imageDimming = KSwitch{
//    withId(R.id.theme_chooser_dark_mode_dim_images_switch)
//}