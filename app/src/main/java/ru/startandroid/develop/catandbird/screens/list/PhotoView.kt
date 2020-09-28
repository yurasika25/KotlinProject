package ru.startandroid.develop.catandbird.screens.list

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import ru.startandroid.develop.catandbird.mvp.BasicView


interface PhotoView : BasicView {
    fun setAdapter(adapter: Adapter<*>?)
    fun setHasFixedSize(b: Boolean)
    fun setLayoutManager(linearLayoutManager: LinearLayoutManager?)
    class Adapter<T> private constructor(listItems: ArrayList<TestModel?>?, fragmentPhoto: FragmentPhoto?)
    class ViewHolder(itemView: View?)
}
