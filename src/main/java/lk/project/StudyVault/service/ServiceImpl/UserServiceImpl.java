package lk.project.StudyVault.service.ServiceImpl;

import lk.project.StudyVault.dto.UserDTO;
import lk.project.StudyVault.service.UserService;
import lk.project.StudyVault.util.UtilData;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public void addUser(UserDTO userDTO) {
        userDTO.setUserId(UtilData.genarateUserId());
        userDTO.setAccountCreatedDate(UtilData.genarateTodayDate());
        userDTO.setAccountCreatedTime(UtilData.genarateCurrentTime());
        System.out.print(userDTO);
    }

    @Override
    public void deleteUser(String userId) {

    }

    @Override
    public void updateUser(String userId, UserDTO userDTO) {

    }

    @Override
    public UserDTO getUser(String userId) {
        return null;
    }

    @Override
    public List<UserDTO> getAllUsers(){
        return List.of();
    }
}
