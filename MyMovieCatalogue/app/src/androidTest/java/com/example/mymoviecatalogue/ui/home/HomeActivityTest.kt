package com.example.mymoviecatalogue.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.mymoviecatalogue.R
import com.example.mymoviecatalogue.utils.DataDummy
import org.junit.Rule
import org.junit.Test


class HomeActivityTest {
    private val dummyMovie = DataDummy.generateDummyMovie()
    private val dummyTVShow = DataDummy.generateDummyTVShow()

    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun loadMovie() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyMovie.size
            )
        )
    }

    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.rv_movie)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )

        onView(withId(R.id.text_title)).check(matches(isDisplayed()))
        onView(withId(R.id.text_title)).check(matches(withText(dummyMovie[0].judul)))

        onView(withId(R.id.text_tahun)).check(matches(isDisplayed()))
        onView(withId(R.id.text_tahun)).check(matches(withText(dummyMovie[0].tahun)))

        onView(withId(R.id.text_capt)).check(matches(isDisplayed()))
        onView(withId(R.id.text_capt)).check(matches(withText(dummyMovie[0].caption)))

        onView(withId(R.id.text_description)).check(matches(isDisplayed()))
        onView(withId(R.id.text_description)).check(matches(withText(dummyMovie[0].deskripsi)))

        onView(withId(R.id.text_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.text_genre)).check(matches(withText(dummyMovie[0].genre)))

        onView(withId(R.id.btn_tonton)).perform(click())
    }

    @Test
    fun loadTVShow() {
        onView(withText("TVSHOW")).perform(click())
        onView(withId(R.id.rv_tvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tvshow)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyTVShow.size
            )
        )
    }

    @Test
    fun loadDetailTVShow() {
        onView(withText("TVSHOW")).perform(click())
        onView(withId(R.id.rv_tvshow)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )

        onView(withId(R.id.text_title)).check(matches(isDisplayed()))
        onView(withId(R.id.text_title)).check(matches(withText(dummyTVShow[0].judul)))

        onView(withId(R.id.text_tahun)).check(matches(isDisplayed()))
        onView(withId(R.id.text_tahun)).check(matches(withText(dummyTVShow[0].tahun)))

        onView(withId(R.id.text_capt)).check(matches(isDisplayed()))
        onView(withId(R.id.text_capt)).check(matches(withText(dummyTVShow[0].caption)))

        onView(withId(R.id.text_description)).check(matches(isDisplayed()))
        onView(withId(R.id.text_description)).check(matches(withText(dummyTVShow[0].deskripsi)))

        onView(withId(R.id.text_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.text_genre)).check(matches(withText(dummyTVShow[0].genre)))

        onView(withId(R.id.btn_tonton)).perform(click())
    }
}