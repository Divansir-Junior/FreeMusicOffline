package com.ui.main

import android.content.ContentResolver
import androidx.lifecycle.ViewModel
import com.example.musicoffline.data.datasource.MediaStoreDataSource
import com.example.musicoffline.data.repository.MusicRepository
import com.example.musicoffline.domain.usecase.GetMusicListUseCase
import com.example.musicoffline.data.model.AudioModel

class MainViewModel(
    contentResolver: ContentResolver
) : ViewModel() {

    private val dataSource = MediaStoreDataSource(contentResolver)
    private val repository = MusicRepository(dataSource)
    private val useCase = GetMusicListUseCase(repository)

    fun loadMusic(): List<AudioModel> {
        return useCase.execute()
    }
}
