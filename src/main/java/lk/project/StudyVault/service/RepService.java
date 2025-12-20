package lk.project.StudyVault.service;

import lk.project.StudyVault.dto.RepDTO;

import java.util.List;

public interface RepService {
    void addRep(RepDTO repDTO);
    void deleteRep(String repId);
    void updateRep(String repId , RepDTO repDTO);
    RepDTO getRep(String repId);
    List<RepDTO> getAllReps();
}
