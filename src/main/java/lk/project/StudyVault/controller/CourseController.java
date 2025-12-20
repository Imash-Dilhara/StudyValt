package lk.project.StudyVault.controller;

import lk.project.StudyVault.dto.CourseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/v1/course")

public class CourseController {
    @GetMapping
    public String healthCheck(){
        return "OK";
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE ,  produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addCourse(@RequestBody CourseDTO courseDTO){
        System.out.println(courseDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PatchMapping(value = "{courseId}" , consumes = APPLICATION_JSON_VALUE , produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateCourse(@PathVariable String courseId , @RequestBody CourseDTO courseDTO){
        System.out.println(courseDTO);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "{courseId}")
    public ResponseEntity<Void> deleteCourse(@PathVariable String courseId){
        return new ResponseEntity<> (HttpStatus.NO_CONTENT);
    }

    @GetMapping("/getSelectedCourse/{courseId}")
    public ResponseEntity<CourseDTO> getSelectedCourse(@PathVariable String courseId){
        return ResponseEntity.ok(new CourseDTO(
                "MAT205",
                "Linear Algebra",
                "Mathematics",
                "4"
        ));
    }

    @GetMapping("/getAllCourse")
    public ResponseEntity<List<CourseDTO>> getCourse(){
        List<CourseDTO> courseList = new ArrayList<>();
        courseList.add(
                new CourseDTO(
                        "MAT205",
                        "Linear Algebra",
                        "Mathematics",
                        "4"
                ));
        courseList.add(
                new CourseDTO(
                        "MAT206",
                        "Set Algebra",
                        "Mathematics",
                        "3"
                )
        );
        return ResponseEntity.ok(courseList);
    }
}
