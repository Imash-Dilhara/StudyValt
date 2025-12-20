package lk.project.StudyVault.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class RepDTO implements Serializable {
    private String repId;
    private String studentId;
    private String addedByAdmin;
    private String gender;
    private String level;
    private String stNO;
    private LocalDate startDate;

}
