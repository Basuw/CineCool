package fr.iut.cinecool.model

import android.graphics.drawable.Drawable
import com.google.gson.annotations.SerializedName
data class Movie(val id:Int, val name:String, var mark:Int, val realisator:String, var duration: Double, val icon:Int)

