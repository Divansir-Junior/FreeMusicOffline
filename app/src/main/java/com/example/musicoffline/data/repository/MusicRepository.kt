package com.example.musicoffline.data.repository

import com.example.musicoffline.data.datasource.MediaStoreDataSource
import com.example.musicoffline.data.model.AudioModel

class MusicRepository(
    private val dataSource: MediaStoreDataSource
) {

    fun getAllMusic(): List<AudioModel> {
        return dataSource.getAllMusic()
    }
}
