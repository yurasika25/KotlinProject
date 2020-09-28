package ru.startandroid.develop.catandbird.screens.list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_two_test.view.*
import ru.startandroid.develop.catandbird.R

class MyAdapter(private val listItems: List<TestModel>, private val mContext: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_two_test, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemList = listItems[position]
        holder.itemView.titleTV.text = itemList.title
        holder.itemView.numbersTV.text = itemList.time
        Glide
            .with(mContext)
            .load(itemList.image)
            .centerCrop()
            .placeholder(R.drawable.image)
            .into(holder.itemView.Bird)
    }

    override fun getItemCount(): Int {
        return listItems.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}