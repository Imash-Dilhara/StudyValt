package lk.project.StudyVault.service.ServiceImpl;

import lk.project.StudyVault.dto.AdminDTO;
import lk.project.StudyVault.service.AdminService;
import lk.project.StudyVault.util.UtilData;

import java.util.List;

public class AdminServiceImpl implements AdminService {

    @Override
    public void addAdmin(AdminDTO adminDTO) {
        adminDTO.setAdminId(UtilData.genarateAdminId());
    }

    @Override
    public void deleteAdmin(String adminId) {

    }

    @Override
    public void updateAdmin(String adminId, AdminDTO adminDTO) {

    }

    @Override
    public AdminDTO getAdmin(String adminId) {
        return null;
    }

    @Override
    public List<AdminDTO> getAllAdmins() {
        return List.of();
    }
}
