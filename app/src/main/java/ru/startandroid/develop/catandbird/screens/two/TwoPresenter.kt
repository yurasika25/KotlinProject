package ru.startandroid.develop.catandbird.screens.two

import ru.startandroid.develop.catandbird.mvp.BasicPresenter

class TwoPresenter : BasicPresenter<TwoView?>() {
    fun onRedButtonClicked() {
        getView()?.navigateToRegister()
    }

    fun onGreenButtonClicked() {
        getView()?.navigateToPhotos()
    }

    fun onBlueButtonClicked() {
        getView()?.navigateToPhoto()
    }
}
