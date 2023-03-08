package fr.iut.cinecool

import android.Manifest
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import fr.iut.cinecool.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginButton = findViewById<ImageView>(R.id.loginButton)
        loginButton.setOnClickListener(){
            login()
        }


        /*ActivityCompat.requestPermissions(this,
            arrayOf(Manifest.permission.ACCESS_FINE_LOCATION,1)
        )*/
    }
    fun login(){
        val name = findViewById<EditText>(R.id.name).text
        if (name.isNotEmpty()){
            val intent = Intent(applicationContext,CinemaActivity::class.java)
            startActivity(intent)
            System.out.println(name)
        }
    }
}