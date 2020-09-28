package ru.startandroid.develop.catandbird.screens.four

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.startandroid.develop.catandbird.R

class FragmentPhotos : Fragment(), PhotosView {
    private var presenter: PhotosPresenter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.photos_view, container, false)
        presenter = PhotosPresenter()
        view.findViewById<View>(R.id.button2).setOnClickListener {
            val player: MediaPlayer = MediaPlayer.create(context, R.raw.meow)
            player.start()
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

    override fun navigateToPhotos() {}
    override fun navigateToPhoto() {
    }

}
