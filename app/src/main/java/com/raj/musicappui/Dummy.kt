package com.raj.musicappui

import androidx.annotation.DrawableRes

data class Lib(@DrawableRes val icon: Int,  val name:String )

    val libraries = listOf<Lib>(
        Lib(R.drawable.baseline_queue_music_24,"Playlist"),
        Lib(R.drawable.outline_mic_24,"Artist"),
        Lib(R.drawable.baseline_disc_full_24,"Album"),
        Lib(R.drawable.baseline_music_note_24,"Song"),
        Lib(R.drawable.baseline_list_alt_24,"Genre")


    )
