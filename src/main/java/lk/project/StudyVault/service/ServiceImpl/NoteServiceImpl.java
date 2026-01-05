package lk.project.StudyVault.service.ServiceImpl;

import lk.project.StudyVault.dto.NoteDTO;
import lk.project.StudyVault.service.NoteService;
import lk.project.StudyVault.util.UtilData;

import java.util.List;

public class NoteServiceImpl implements NoteService {
    @Override
    public void addNote(NoteDTO noteDTO){
        noteDTO.setNoteId(UtilData.genarateNOteId());
        noteDTO.setSaveDate(UtilData.genarateTodayDate());
        noteDTO.setSaveTime(UtilData.genarateCurrentTime());
        System.out.println(noteDTO);

    }

    @Override
    public void deleteNote(String noteId){

    }

    @Override
    public void updateNote(String noteId, NoteDTO noteDTO){

    }

    @Override
    public NoteDTO getNote(String noteId){
        return null;
    }

    @Override
    public List<NoteDTO> getAllNotes(){
        return List.of();
    }
}
