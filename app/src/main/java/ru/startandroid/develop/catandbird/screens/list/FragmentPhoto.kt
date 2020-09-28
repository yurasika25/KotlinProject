package ru.startandroid.develop.catandbird.screens.list

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.startandroid.develop.catandbird.R
import java.util.*

class FragmentPhoto : Fragment() {
    var names = arrayOf("London", "Paris", "Ukraine")
    private val FragmentPhoto: Any? = null
    private var presenter: PhotoPresenter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //dkfskksdkf
        val view: View = inflater.inflate(R.layout.photo_main, container, false)
        presenter = PhotoPresenter()
        val recyclerView: RecyclerView = view.findViewById<View>(R.id.recyclerView) as RecyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(context)
        val listItems = ArrayList<TestModel>()
        listItems.add(
            TestModel(
                Uri.parse("https://bipbap.ru/wp-content/uploads/2017/09/1164906.jpg"),
                "Cat and bird",
                "This car is blue in color",
                "28.08.2020"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://bipbap.ru/wp-content/uploads/2017/09/1164906.jpg"),
                "Cat and bird",
                "This is a car showroom",
                "18.07.2020"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://bipbap.ru/wp-content/uploads/2017/09/1164906.jpg"),
                "Cat and bird",
                "Next title",
                "7.06.2020"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://bipbap.ru/wp-content/uploads/2017/09/1164906.jpg"),
                "Cat and bird",
                "Next title",
                "19.03.2020"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://bipbap.ru/wp-content/uploads/2017/09/1164906.jpg"),
                "Our children",
                "Next title",
                "16.04.2020"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://bipbap.ru/wp-content/uploads/2017/09/1164906.jpg"),
                "Cat and bird",
                "Next title",
                "8.03.2020"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://bipbap.ru/wp-content/uploads/2017/09/1164906.jpg"),
                "Cat and bird",
                "Next title",
                "14.02.2020"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://bipbap.ru/wp-content/uploads/2017/09/1164906.jpg"),
                "Cat and bird",
                "Next title",
                "21.01.2020"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://bipbap.ru/wp-content/uploads/2017/09/1164906.jpg"),
                "Cat and bird",
                "Next title",
                "14.01.2020"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://bipbap.ru/wp-content/uploads/2017/09/1164906.jpg"),
                "Cat and bird",
                "Next title",
                "8.01.2020"
            )
        )
        //Set adapter
        val adapter = MyAdapter(listItems, context!!)
        recyclerView.setAdapter(adapter)
        return view
    }

    override fun onPause() {
        super.onPause()
        presenter!!.exitFromView()
    }

    override fun onResume() {
        super.onResume()
        presenter!!.enterWithView(this)
    }
}

private fun RecyclerView.setAdapter(adapter: MyAdapter) {

}
