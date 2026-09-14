package org.wikipedia.lessons.lesson08.homework

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

class TopRead(matcher: Matcher<View>) : KRecyclerItem<TopRead>(matcher) {
    val header = KTextView(matcher){
        withId(R.id.view_card_header_title)
        withText("Top read")
    }
    val dots = KImageView(matcher){
        withId(R.id.view_list_card_header_menu)
    }
    val items = KRecyclerView(
        parent = matcher,
        builder = {withId(R.id.view_list_card_list)},
        itemTypeBuilder = {
            itemType(::TopReadRecycler)
        }
    )

    val footer = KTextView(matcher){
        withId(R.id.footerActionButton)
        withText("More top read")
    }
}