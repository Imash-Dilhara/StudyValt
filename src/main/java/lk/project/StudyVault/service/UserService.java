package lk.project.StudyVault.service;

import lk.project.StudyVault.dto.UserDTO;

import java.util.List;

public interface UserService {
    void addUser(UserDTO userDTO);
    void deleteUser(String userId);
    void updateUser(String userId,UserDTO userDTO);
    UserDTO getUser(String userId);
    List<UserDTO> getAllUsers();
}
