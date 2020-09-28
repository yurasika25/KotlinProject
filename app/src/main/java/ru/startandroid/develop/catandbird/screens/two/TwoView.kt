package ru.startandroid.develop.catandbird.screens.two

import ru.startandroid.develop.catandbird.mvp.BasicView

interface TwoView : BasicView {
    fun navigateToRegister()
    fun navigateToPhotos()
    override fun navigateToPhoto()
}

