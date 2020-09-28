package ru.startandroid.develop.catandbird.screens.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import ru.startandroid.develop.catandbird.R
import ru.startandroid.develop.catandbird.screens.one.FragmentOne

class MainActivity : AppCompatActivity(), MainView {
    private var presenter: MainPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter()
    }

    override fun onPause() {
        super.onPause()
        presenter?.exitFromView()
    }

    override fun onResume() {
        super.onResume()
        presenter?.enterWithView(this)
    }

    fun goToFirstFragment() {
        val fragment: Fragment = FragmentOne.newInstance()
        val fm = supportFragmentManager
        val ft = fm.beginTransaction()
        ft.replace(R.id.mainContainer, fragment)
        ft.commit()
    }

    override fun onNavigateToFirst() {
        goToFirstFragment()
    }

    override fun navigateToPhoto() {}
}