package fr.iut.cinecool.API.OpenStreetMap

import com.google.gson.annotations.SerializedName

data class Cinema(
    @SerializedName("place_id")
    val placeId: Long,

    @SerializedName("lat")
    val latitude: Double,

    @SerializedName("lon")
    val longitude: Double,

    @SerializedName("display_name")
    val displayName: String
)
