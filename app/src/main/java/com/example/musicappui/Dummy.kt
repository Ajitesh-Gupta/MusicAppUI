package com.example.musicappui

import androidx.annotation.DrawableRes

data class Library(@DrawableRes val icon: Int, val name: String)

val libraries = listOf<Library>(
    Library(R.drawable.ic_playlist_green, "Playlist"),
    Library(R.drawable.ic_microphone, "Artists"),
    Library(R.drawable.ic_baseline_album_24, "Album"),
    Library(R.drawable.ic_baseline_music_note_24, "Songs"),
    Library(R.drawable.ic_genre, "Genre"),
)
