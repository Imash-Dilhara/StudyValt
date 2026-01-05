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

public class UserDTO implements Serializable {
    private String userId;
    private String userName;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private LocalDate dateOfBirth;
    private LocalDate accountCreatedDate;
    private Time accountCreatedTime;
    private String phone;
    private Role role;
}
