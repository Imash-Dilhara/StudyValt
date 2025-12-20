package lk.project.StudyVault.service;

import lk.project.StudyVault.dto.AdminDTO;

import java.util.List;

public interface AdminService {
    void addAdmin(AdminDTO adminDTO);
    void deleteAdmin(String adminId);
    void updateAdmin(String adminId , AdminDTO adminDTO);
    AdminDTO getAdmin(String adminId);
    List<AdminDTO> getAllAdmins();
}
