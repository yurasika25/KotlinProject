package ru.startandroid.develop.catandbird.screens.four

import ru.startandroid.develop.catandbird.mvp.BasicPresenter

class PhotosPresenter : BasicPresenter<PhotosView?>() {
    override fun exitFromView() {}
    fun enterWithView(fragmentPhotos: FragmentPhotos?) {}
    fun onBlueButtonClicked() {
        getView()?.navigateToPhotos()
    }
}
//class PhotosPresenter : BasicPresenter<PhotosView>{
//
//  public   fun exitFromView()
//
//public fun enterWithView( fragmentPhotos : FragmentPhotos) {
//
//public fun onBlueButtonClicked(){
//        getView().navigateToPhotos()
//        }
//
//        }
//        }

