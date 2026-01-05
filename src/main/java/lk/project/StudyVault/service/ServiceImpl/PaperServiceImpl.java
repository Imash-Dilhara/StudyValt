package lk.project.StudyVault.service.ServiceImpl;

import jdk.jshell.execution.Util;
import lk.project.StudyVault.dto.PaperDTO;
import lk.project.StudyVault.service.PaperService;
import lk.project.StudyVault.util.UtilData;

import java.util.List;

public class PaperServiceImpl implements PaperService {
    @Override
    public void addPaper(PaperDTO paperDTO) {
        paperDTO.setPaperId(UtilData.genaratePaperId());
        paperDTO.setSaveDate(UtilData.genarateTodayDate());
        paperDTO.setSaveTime(UtilData.genarateCurrentTime());
        System.out.println(paperDTO);
    }

    @Override
    public void deletePaper(String paperId) {

    }

    @Override
    public void updatePaper(String paperId , PaperDTO paperDTO) {

    }

    @Override
    public PaperDTO getPaper(String paperId) {
        return null;
    }

    @Override
    public List<PaperDTO> getAllPapers(){
        return List.of();
    }
}
