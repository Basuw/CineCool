package fr.iut.cinecool

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vu_detail)

        // Récupération de la référence de l'ImageButton
        val backButton: ImageButton =findViewById(R.id.backButton)

        // Ajout d'un listener pour gérer le clic sur le bouton
        backButton.setOnClickListener{
            // Code à exécuter lorsque l'utilisateur clique sur le bouton de retour
            // Par exemple, pour fermer l'activité en cours et revenir à l'activité précédente :
            finish()
        }

        // Récupération de la référence du TextView
        val textView: TextView =findViewById(R.id.titreFilm)

        // Modification du texte affiché dans le TextView
        textView.text="Titre de la page"

        // Récupération des références des ImageView
        val imageView2: ImageView =findViewById(R.id.logo)
        val imageView3:ImageView=findViewById(R.id.afficheFilm)

        // Chargement des images à partir de fichiers ou d'Internet, par exemple :
        /*Glide.with(this)
            .load(R.drawable.cinema)
            .into(imageView2)

        Glide.with(this)
            .load(R.drawable.imitation_game)
            .into(imageView3)*/

        // Récupération de la référence du TextView 2
        val textView2:TextView=findViewById(R.id.description)

        // Modification du texte affiché dans le TextView 2
        textView2.text="Contenu de la page"
    }



}