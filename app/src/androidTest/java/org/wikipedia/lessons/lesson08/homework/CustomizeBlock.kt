package org.wikipedia.lessons.lesson08.homework

import android.view.View
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R
class CustomizeBlock(matcher: Matcher<View>) : KRecyclerItem<CustomizeBlock>(matcher) {
    val blockHeader = KTextView (matcher){
        withId(R.id.view_card_header_title)
    }
    val dots = KImageView (matcher){
        withId(R.id.view_list_card_header_menu)
    }
    val textHeader = KTextView (matcher) {
        withId(R.id.viewWikiGamesCardTitle)
    }
    val text = KTextView (matcher) {
        withId(R.id.viewWikiGamesCardSubTitle)
    }
    val image = KImageView(matcher){
        withId(R.id.viewWikiGamesCardImage)
    }
}