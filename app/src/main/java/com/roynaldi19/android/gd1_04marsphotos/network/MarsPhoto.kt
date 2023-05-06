package com.roynaldi19.android.gd1_04marsphotos.network

import com.squareup.moshi.Json

data class MarsPhoto(
    val id: String,
    @Json(name = "img_src") val imgSrcUrl: String
)
