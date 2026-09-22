package org.wikipedia.lessons.lesson09.homework

import android.view.View
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R
import org.wikipedia.lessons.lesson08.homework.WikipediaGames

class FeaturedArticle (matcher: Matcher<View>) : KRecyclerItem<FeaturedArticle>(matcher) {
    val block  = KView(parent = matcher){
        withId(R.id.view_wiki_article_card)
    }
    val header = KTextView(matcher){
        withText("Featured article")
    }
}

