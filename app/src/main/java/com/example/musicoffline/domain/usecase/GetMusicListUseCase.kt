package com.example.musicoffline.domain.usecase

import com.example.musicoffline.data.model.AudioModel
import com.example.musicoffline.data.repository.MusicRepository

class GetMusicListUseCase(
    private val repository: MusicRepository
) {

    fun execute(): List<AudioModel> {
        return repository.getAllMusic()
    }
}
