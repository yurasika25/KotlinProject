package ru.startandroid.develop.catandbird.screens.two

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import ru.startandroid.develop.catandbird.R
import ru.startandroid.develop.catandbird.screens.four.FragmentPhotos
import ru.startandroid.develop.catandbird.screens.list.FragmentPhoto
import ru.startandroid.develop.catandbird.screens.three.FragmentRegister

class FragmentTwo : Fragment(), TwoView {
    var constraintLayout: ConstraintLayout? = null
    private var presenter: TwoPresenter? = null

    override fun onPause() {
        super.onPause()
        presenter!!.exitFromView()
    }

    override fun onResume() {
        super.onResume()
        presenter!!.enterWithView(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_two, container, false)
        constraintLayout = view.findViewById(R.id.twoContainer)
        presenter = TwoPresenter()
        val button = view.findViewById<Button>(R.id.RedB)
        val button1 = view.findViewById<Button>(R.id.GreenB)
        val button2 = view.findViewById<Button>(R.id.BlueB)
        button.setOnClickListener { presenter!!.onRedButtonClicked() }
        button1.setOnClickListener { presenter!!.onGreenButtonClicked() }
        button2.setOnClickListener { presenter!!.onBlueButtonClicked() }
        view.findViewById<View>(R.id.smile).setOnClickListener {
            val player = MediaPlayer.create(context, R.raw.meow)
            player.start()
        }
        return view
    }

    override fun navigateToRegister() {
        val fragment: Fragment = FragmentRegister()
        val fm = requireActivity().supportFragmentManager
        val ft = fm.beginTransaction()
        ft.replace(R.id.mainContainer, fragment)
        ft.addToBackStack(null)
        ft.commit()
    }

    override fun navigateToPhoto() {
        val fragment: Fragment = FragmentPhoto()
        val fm = requireActivity().supportFragmentManager
        val ft = fm.beginTransaction()
        ft.replace(R.id.mainContainer, fragment)
        ft.addToBackStack(null)
        ft.commit()
    }

    override fun navigateToPhotos() {
        val fragment: Fragment = FragmentPhotos()
        val fm = requireActivity().supportFragmentManager
        val ft = fm.beginTransaction()
        ft.replace(R.id.mainContainer, fragment)
        ft.addToBackStack(null)
        ft.commit()
    }

    companion object {
        fun newInstance(): FragmentTwo {
            val args = Bundle()
            val fragment = FragmentTwo()
            fragment.arguments = args
            return fragment
        }
    }
}