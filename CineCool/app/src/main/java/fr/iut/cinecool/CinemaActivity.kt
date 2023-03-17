package fr.iut.cinecool

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CinemaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cinema)
        Activity.findNavController(viewId: Int)
    }
}