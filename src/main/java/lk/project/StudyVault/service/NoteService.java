package lk.project.StudyVault.service;

import lk.project.StudyVault.dto.NoteDTO;

import java.util.List;

public interface NoteService {
    void addNote(NoteDTO noteDTO);
    void deleteNote(String noteId);
    void updateNote(String noteId ,NoteDTO noteDTO);
    NoteDTO getNote(String noteId);
    List<NoteDTO> getAllNotes();

}
