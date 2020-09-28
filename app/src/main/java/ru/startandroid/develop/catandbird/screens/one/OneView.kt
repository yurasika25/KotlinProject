package ru.startandroid.develop.catandbird.screens.one

import ru.startandroid.develop.catandbird.mvp.BasicView

interface OneView : BasicView {
    fun onNavigateToTwo()
    fun onCredentialsWrong()
}

