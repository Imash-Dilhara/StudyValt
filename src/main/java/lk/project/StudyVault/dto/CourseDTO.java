package lk.project.StudyVault.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class CourseDTO implements Serializable {
    private String courseId;
    private String name;
    private String department;
    private String credit;
}
