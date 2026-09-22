package org.wikipedia.lessons.lesson09.homework

import android.view.View
import io.github.kakaocup.kakao.check.KCheckBox
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import org.hamcrest.Matcher
import org.wikipedia.R
import org.wikipedia.lessons.lesson08.homework.InTheNewsRecycler

class CustomizeRecycler(matcher: Matcher<View>) : KRecyclerItem<CustomizeRecycler>(matcher) {
    val switch = KCheckBox(matcher){
        withId(R.id.feed_content_type_checkbox)
    }
}