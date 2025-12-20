package lk.project.StudyVault.service;

import lk.project.StudyVault.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    void addStudent(StudentDTO studentDTO);
    void deleteStudent(String studentId);
    void updateStudent(String studentId,StudentDTO studentDTO);
    StudentDTO getStudent(String studentId);
    List<StudentDTO> getAllStudents();
}
