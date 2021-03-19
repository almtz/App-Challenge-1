package alm.itesm.appchallenge1

import android.graphics.drawable.Drawable
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Albums(val Picture: Int, val titulo: String, val anio: String, val secret: String) : Parcelable
