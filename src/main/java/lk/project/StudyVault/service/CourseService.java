package lk.project.StudyVault.service;

import lk.project.StudyVault.dto.CourseDTO;

import java.util.List;

public interface CourseService {
    void addCourse(CourseDTO courseDTO);
    void deleteCourse(String courseId);
    void updateCourse(String courseId, CourseDTO courseDTO);
    CourseDTO getCourse(String courseId);
    List<CourseDTO> getAllCourses();
}
