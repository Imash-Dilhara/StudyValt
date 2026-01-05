package lk.project.StudyVault.service.ServiceImpl;

import lk.project.StudyVault.dto.StudentDTO;
import lk.project.StudyVault.service.StudentService;
import lk.project.StudyVault.util.UtilData;

import java.awt.*;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public void addStudent(StudentDTO studentDTO) {
        studentDTO.setStudentId(UtilData.genarateStudentId());
        System.out.print(studentDTO);
    }

    @Override
    public void deleteStudent(String studentId) {

    }

    @Override
    public void updateStudent(String studentId, StudentDTO studentDTO) {

    }

    @Override
    public StudentDTO getStudent(String studentId) {
        return null;
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        return List.of();
    }
}
