package ru.startandroid.develop.catandbird.screens.main

import ru.startandroid.develop.catandbird.mvp.BasicPresenter

class MainPresenter : BasicPresenter<MainView?>() {
    override fun onEnterScope() {
        super.onEnterScope()
        getView()?.onNavigateToOne()
    }
}
