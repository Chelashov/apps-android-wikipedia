package org.wikipedia.lessons.lesson09.homework

import android.view.View
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KButton
import org.hamcrest.Matcher
import org.wikipedia.R

class Customize(matcher: Matcher<View>) : KRecyclerItem<Customize>(matcher) {
    val buttonCustomize = KButton(parent = matcher) {
        withId(R.id.view_announcement_action_positive)
    }
}