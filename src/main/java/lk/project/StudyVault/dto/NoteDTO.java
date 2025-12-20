package lk.project.StudyVault.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class NoteDTO implements Serializable {
    private String noteId;
    private String noteTitle;
    private String courseId;
    private LocalDate saveDate;
    private Time saveTime;
}
