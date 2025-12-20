package lk.project.StudyVault.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
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
    private LocalDate createDate;
    private String phone;
    private Role role;
}
