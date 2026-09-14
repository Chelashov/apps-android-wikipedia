package org.wikipedia.lessons.lesson08.homework

import android.view.View
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
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
    val number = KTextView(matcher) { withId(R.id.numberView) }
    val title = KTextView(matcher) { withId(R.id.view_list_card_item_title) }
    val subtitle = KTextView(matcher) { withId(R.id.view_list_card_item_subtitle) }
    val graph = KView(matcher) { withId(R.id.view_list_card_item_graph) }
    val pageViews = KTextView(matcher) { withId(R.id.view_list_card_item_pageviews) }
    val image = KTextView(matcher) { withId(R.id.view_list_card_item_image) }
    val footer = KTextView(matcher){
        withId(R.id.footerActionButton)
        withText("More top read")
    }
}