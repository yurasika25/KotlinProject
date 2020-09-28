package ru.startandroid.develop.catandbird.screens.three

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.startandroid.develop.catandbird.R

class FragmentRegister : Fragment(), RegisterView {
    private var presenter: RegisterPresenter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.register, container, false)
        presenter = RegisterPresenter()
        return view
    }

    override fun onPause() {
        super.onPause()
        presenter?.exitFromView()
    }

    override fun onResume() {
        super.onResume()
        presenter?.enterWithView(this)
    }

    override fun navigateToRegister() {}
    override fun navigateToPhoto() {}
}