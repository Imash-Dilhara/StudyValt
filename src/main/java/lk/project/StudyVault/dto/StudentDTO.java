package lk.project.StudyVault.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class StudentDTO implements Serializable {
    private String studentId;
    private String name;
    private String courseId;
    private String email;
    private String stNO;
    private String phone;
    private String levl;
    private String gender;
    private String admissionYear;
    private String department;
    private String faculty;
}
