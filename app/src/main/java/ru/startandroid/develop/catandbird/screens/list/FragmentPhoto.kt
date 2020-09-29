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
        val view: View = inflater.inflate(R.layout.photo_main, container, false)
        presenter = PhotoPresenter()
        val recyclerView: RecyclerView = view.findViewById<View>(R.id.recyclerView) as RecyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(context)
        val listItems = ArrayList<TestModel>()
        listItems.add(
            TestModel(
                Uri.parse("https://scontent.fiev25-1.fna.fbcdn.net/v/t1.0-9/118615115_2672527289670019_4330139276936953848_o.jpg?_nc_cat=101&_nc_sid=8bfeb9&_nc_ohc=gBqX0kK8G5wAX9IVemr&_nc_ht=scontent.fiev25-1.fna&oh=e8b39de1f55ea3321ffecadc871b980d&oe=5F97B5A0"),
                "Cat and bird",
                "This car is blue in color",
                "28.08.2020"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://scontent.fiev25-1.fna.fbcdn.net/v/t1.0-9/93277500_2567140680208681_1255223068637265920_o.jpg?_nc_cat=105&_nc_sid=730e14&_nc_ohc=8U2rwvWKDvoAX_xJE5L&_nc_ht=scontent.fiev25-1.fna&oh=78483193ea97ba59e38f6888a5cb4b21&oe=5F981F7E"),
                "Our children",
                "This is a car showroom",
                "18.07.2020"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://scontent.fiev25-1.fna.fbcdn.net/v/t1.0-9/91187921_600110427241414_8223227294970281984_o.jpg?_nc_cat=103&_nc_sid=8bfeb9&_nc_ohc=h7yaQg79j6IAX8zjL8x&_nc_ht=scontent.fiev25-1.fna&oh=4bc514fde0c00b767710efc62d0de432&oe=5F98288A"),
                "Cat and bird",
                "Next title",
                "7.06.2020"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://scontent.fiev25-2.fna.fbcdn.net/v/t1.0-9/89356308_2536002406655842_778074261003698176_o.jpg?_nc_cat=111&_nc_sid=8bfeb9&_nc_ohc=9L6-NO8nbOIAX_Fe4sI&_nc_ht=scontent.fiev25-2.fna&oh=24ef59f657cfe87e0f3ac9c967fe9eb6&oe=5F989129"),
                "Cat and bird",
                "Next title",
                "19.03.2020"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://scontent.fiev25-1.fna.fbcdn.net/v/t1.0-9/85169420_2517780725144677_4188361105292132352_o.jpg?_nc_cat=105&_nc_sid=8bfeb9&_nc_ohc=05H9cHx16tcAX-_zyu4&_nc_ht=scontent.fiev25-1.fna&oh=2a2711721182b3053648580623ca615d&oe=5F9715FE"),
                "Cat and bird",
                "Next title",
                "16.04.2020"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://scontent.fiev25-1.fna.fbcdn.net/v/t1.0-9/83979767_2499485936974156_2602277812282851328_n.jpg?_nc_cat=106&_nc_sid=8bfeb9&_nc_ohc=9BQc3SZSB5QAX9bWTS_&_nc_ht=scontent.fiev25-1.fna&oh=b384970c455d9e6b3b9395f7958efd95&oe=5F95E3E8"),
                "Cat and bird",
                "Next title",
                "8.03.2020"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://scontent.fiev25-2.fna.fbcdn.net/v/t1.0-9/83243853_2499485986974151_821093555383566336_n.jpg?_nc_cat=104&_nc_sid=8bfeb9&_nc_ohc=_VjY6VOpUIoAX_1qC4V&_nc_ht=scontent.fiev25-2.fna&oh=0925f1d9bc5799cee670594d87f38fa6&oe=5F97E235"),
                "Cat and bird",
                "Next title",
                "14.02.2020"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://scontent.fiev25-1.fna.fbcdn.net/v/t1.0-9/82741107_2493163447606405_4908915536475193344_o.jpg?_nc_cat=102&_nc_sid=730e14&_nc_ohc=Uie2oNGF0rgAX81vSf5&_nc_ht=scontent.fiev25-1.fna&oh=fa0a4bab80d5920199f38df54e0e14ed&oe=5F9985BC"),
                "Cat and bird",
                "Next title",
                "21.01.2020"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://scontent.fiev25-2.fna.fbcdn.net/v/t1.0-9/81728743_2487894471466636_7630485953735294976_n.jpg?_nc_cat=111&_nc_sid=8bfeb9&_nc_ohc=y5-6Jf7tqoAAX9RreLU&_nc_ht=scontent.fiev25-2.fna&oh=b3352c3cd422cd4ad002603e16323adb&oe=5F982595"),
                "Cat and bird",
                "Next title",
                "14.01.2020"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://scontent.fiev25-1.fna.fbcdn.net/v/t1.0-9/83318756_2499486056974144_5392552751202828288_n.jpg?_nc_cat=102&_nc_sid=8bfeb9&_nc_ohc=Bt3VNMw7U5IAX8VmS_X&_nc_ht=scontent.fiev25-1.fna&oh=5542fc06bf63cef9f3292b7fbdb1782f&oe=5F979932"),
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
