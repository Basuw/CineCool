package fr.iut.cinecool.model

import java.util.Date

data class Session(val id:Int, val date: Date, val beginHour:Int, val endingHour:Int, val room:String)