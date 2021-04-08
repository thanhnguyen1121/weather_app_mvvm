package com.example.weather_app_mvvp.app.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.weather_app_mvvp.base.OBase
import com.google.gson.annotations.SerializedName

data class SearchResponse(
    @SerializedName("hits")
    val cityItem: List<CityItem>
)


@Entity(tableName = "CITY_ITEM")
data class CityItem(
    @SerializedName("country")
    val country: String? = null,

    @SerializedName("country_code")
    val countryCode: String? = null,

    @SerializedName("is_city")
    val isCity: Boolean? = null,

    @SerializedName("is_country")
    val isCountry: Boolean? = null,

    @SerializedName("administrative")
    val administrative: List<String>? = null,

    @SerializedName("admin_level")
    val adminLevel: Int? = null,

    @SerializedName("postcode")
    val postcode: List<String>? = null,

    @SerializedName("county")
    val county: List<String>? = null,

    @SerializedName("_geoloc")
    val geoloc: Geoloc? = null,

    @SerializedName("importance")
    val importance: Int? = null,

    @SerializedName("objectID")
    val objectID: String? = null,

    @SerializedName("is_suburb")
    val isSuburb: Boolean? = null,

    @SerializedName("locale_names")
    val localeNames: List<String>? = null,

    @PrimaryKey(autoGenerate = false) var id: Int? = null
) : OBase()

data class Geoloc(

    @SerializedName("lng")
    val lng: Double? = null,

    @SerializedName("lat")
    val lat: Double? = null
) : OBase()