package ru.startandroid.develop.catandbird.screens.list

import android.net.Uri

class TestModel {
    var title: String? = null
    var worlds: String? = null
    var time: String? = null

    constructor(parse: Uri?) {}

    var image: Uri? = null

    constructor(image: Uri?, title: String?, worlds: String?, time: String?) {
        this.title = title
        this.image = image
        this.time = time
    }
}
