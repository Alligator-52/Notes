package com.alligator.notes.feature_note.data.data_source

import androidx.room.Dao
import com.alligator.notes.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {
    fun getNotes(): Flow<List<Note>>
}