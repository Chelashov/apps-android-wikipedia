package org.wikipedia.lessons.lesson08.homework

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

class InTheNews(matcher: Matcher<View>) : KRecyclerItem<InTheNews>(matcher) {
    val header = KTextView(matcher){
        withId(R.id.view_card_header_title)
        withText("In the news")
    }
    val dots = KImageView(matcher){
        withIndex(0){
        withId(R.id.view_list_card_header_menu)
        }
    }
    val items = KRecyclerView(
        parent = matcher,
        builder = {withId(R.id.news_cardview_recycler_view)},
        itemTypeBuilder = {
            itemType (::InTheNewsRecycler)
        }
    )
}