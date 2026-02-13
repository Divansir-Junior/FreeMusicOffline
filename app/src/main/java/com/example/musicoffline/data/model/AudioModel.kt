package com.example.musicoffline.data.model

import android.net.Uri

data class AudioModel(
    val id: Long,
    val title: String,
    val artist: String,
    val duration: Long,
    val uri: Uri
)
