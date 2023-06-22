package com.example.ab_tugas1_adip
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class RecyclerViewItemModel(
    val image: Int,
    val tvName: String,
    val tvDescription: String
) :Parcelable
