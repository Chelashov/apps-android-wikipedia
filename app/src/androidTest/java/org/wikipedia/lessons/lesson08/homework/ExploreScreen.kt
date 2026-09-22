package org.wikipedia.lessons.lesson08.homework

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerView
import org.wikipedia.R
import org.wikipedia.feed.view.FeedView
import org.wikipedia.lessons.lesson09.homework.Customize
import org.wikipedia.lessons.lesson09.homework.FeaturedArticle


object ExploreScreen: KScreen<ExploreScreen>() {
    override val layoutId = R.layout.fragment_feed
    override val viewClass = FeedView ::class.java

    val logo = KImageView {
        withId (R.id.main_toolbar_wordmark)
    }
    val items = KRecyclerView(
        builder = {
            withId(R.id.feed_view)
        },
        itemTypeBuilder = {
            itemType (::WikipediaGames)
            itemType (:: DateBlock)
            itemType(:: TopRead)
            itemType(:: InTheNews)
            itemType(::FeaturedArticle)
            itemType(::Customize)
        }
    )
}