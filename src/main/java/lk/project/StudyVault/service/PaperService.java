package lk.project.StudyVault.service;

import lk.project.StudyVault.dto.NoteDTO;
import lk.project.StudyVault.dto.PaperDTO;

import java.util.List;

public interface PaperService {
    void addPaper(PaperDTO paperDTO);
    void deletePaper(String paperId);
    void updatePaper(String paperId, PaperDTO paperDTO);
    PaperDTO getPaper(String paperId);
    List<PaperDTO> getAllPapers();
}
