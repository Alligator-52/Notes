package com.alligator.notes.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.alligator.notes.ui.theme.BabyBlue
import com.alligator.notes.ui.theme.LightGreen
import com.alligator.notes.ui.theme.RedOrange
import com.alligator.notes.ui.theme.RedPink
import com.alligator.notes.ui.theme.Violet

@Entity
data class Note (
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object{
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}