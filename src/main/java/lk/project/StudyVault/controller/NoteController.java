package lk.project.StudyVault.controller;

import lk.project.StudyVault.dto.NoteDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/v1/Note")

public class NoteController {
    @GetMapping()
    public String healthCheck(){return "Health Check OK";}

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addNote(@RequestBody NoteDTO noteDTO){
        System.out.println(noteDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("{noteId}")
    public ResponseEntity<Void> deleteNote(@PathVariable String noteId){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PatchMapping(value = "{noteId}" , consumes = APPLICATION_JSON_VALUE , produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateNote(@PathVariable String noteId , @RequestBody NoteDTO noteDTO){
        System.out.println(noteDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getSelectedNote/{noteId}")
   public ResponseEntity<NoteDTO> getSelectedNote(@PathVariable String noteId){
        return ResponseEntity.ok(
                new NoteDTO(
                    "NOTE001",
                    "Introduction to Java",
                    "CSE101",
                    LocalDate.of(2025,12,15),
                        Time.valueOf("10:30:00")
                )
        );
    }

    @GetMapping("/getAllNote")
    public ResponseEntity<List<NoteDTO>> getAllNote(){
        List<NoteDTO> noteList = new ArrayList<>();
        noteList.add(
                new NoteDTO(
                        "NOTE001",
                        "Introduction to Java",
                        "CSE101",
                        LocalDate.of(2025, 12, 15),
                        Time.valueOf("10:30:00")
                )
        );
        noteList.add(
                new NoteDTO(
                        "NOTE003",
                        "Introduction to HTML",
                        "CSE123",
                        LocalDate.of(2024, 4, 28),
                        Time.valueOf("1:43:28")
                )
        );
        return ResponseEntity.ok(noteList);
    }
}
