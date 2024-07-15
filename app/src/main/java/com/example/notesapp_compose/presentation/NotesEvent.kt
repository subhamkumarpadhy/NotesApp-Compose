package com.example.notesapp_compose.presentation

import com.example.notesapp_compose.data.Note

sealed interface NotesEvent {
    object SortNotes : NotesEvent
    data class DeleteNote(var note: Note) : NotesEvent
    data class SaveNote(var title: String, var disp: String) : NotesEvent
}