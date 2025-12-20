package lk.project.StudyVault.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class AdminDTO implements Serializable {
    private String adminId;
    private String name;
    private String email;
    private String phone;
    private LocalDate joinDate;
}
