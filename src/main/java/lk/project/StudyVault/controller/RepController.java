package lk.project.StudyVault.controller;

import lk.project.StudyVault.dto.RepDTO;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/v1/Rep")

public class RepController {
    @GetMapping
    public String healthCheck(){return "Health Check OK";}

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addRep(@RequestBody RepDTO repDTO){
        System.out.println(repDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("{repId}")
    public ResponseEntity<Void> deleteRep(@PathVariable String repId){
        System.out.println(repId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PatchMapping(value = "{repId}" , consumes = APPLICATION_JSON_VALUE , produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateRep(@PathVariable String repId , @RequestBody RepDTO repDTO){
        System.out.println(repDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getSelectedRep/{repId}")
    public ResponseEntity<RepDTO> getSelectedRep(@PathVariable String repId){
        return ResponseEntity.ok(
                new RepDTO(
                        "REP001",
                        "STU1023",
                        "ADMIN01",
                        "Male",
                        "Level 2",
                        "ST2024-056",
                        LocalDate.of(2024,1,15)
                )
        );
    }

    @GetMapping("/getAllRep")
    public ResponseEntity<List<RepDTO>> getAllRep(){
        List<RepDTO> repList = new ArrayList<>();
        repList.add(
                new RepDTO(
                        "REP001",
                        "STU1023",
                        "ADMIN01",
                        "Male",
                        "Level 2",
                        "ST2024-056",
                LocalDate.of(2024,1,15)
                )
        );
        repList.add(
                new RepDTO(
                        "REP002",
                        "STU1045",
                        "ADMIN01",
                        "Female",
                        "Level 2",
                        "ST2024-098",
                        LocalDate.of(2024,1,15)
                )
        );
        return ResponseEntity.ok(repList);
    }
}
