package ru.startandroid.develop.catandbird.screens.one

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import ru.startandroid.develop.catandbird.R
import ru.startandroid.develop.catandbird.screens.two.FragmentTwo
import java.util.*

class FragmentOne : Fragment(), OneView {
    var presenter: OnePresenter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_one, container, false)
        presenter = OnePresenter()
        val loginB = view.findViewById<Button>(R.id.loginButton)
        loginB.setOnClickListener {
            val number = view.findViewById<EditText>(R.id.phoneNumberET)
            val field1 = number.text.toString()
            val number2 = view.findViewById<EditText>(R.id.passwordET)
            val field2 = number2.text.toString()
            presenter!!.onLoginButtonClicked(field1, field2)
        }
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

    override fun onNavigateToTwo() {
        val fragment: Fragment = FragmentTwo.newInstance()
        val fm = Objects.requireNonNull(activity)
            ?.supportFragmentManager
        val ft = fm?.beginTransaction()
        if (ft != null) {
            ft.add(R.id.mainContainer, fragment)
        }
        if (ft != null) {
            ft.addToBackStack(null)
        }
        if (ft != null) {
            ft.commit()
        }
    }

    override fun onCredentialsWrong() {
        Toast.makeText(activity, "МЕНЕ ПІДСТАВИЛИ", Toast.LENGTH_LONG).show()
    }

    override fun navigateToPhoto() {}

    companion object {
        fun newInstance(): FragmentOne {
            val args = Bundle()
            val fragment = FragmentOne()
            fragment.arguments = args
            return fragment
        }
    }
}