package lk.project.StudyVault.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import lk.project.StudyVault.dto.AdminDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/v1/admin")

public class AdminController {
    @GetMapping()
    public String healthCheck(){
        return "OK";
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addAdmin(@RequestBody AdminDTO adminDTO){
        System.out.println(adminDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("{adminId}")
    public ResponseEntity<Void> deleteAdmin(@PathVariable String adminId){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PatchMapping(value ="{adminId}" ,consumes = APPLICATION_JSON_VALUE , produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateAdmin(@PathVariable String adminId ,@RequestBody AdminDTO adminDTO){
        System.out.println(adminDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping ("/getSelectedAdmin/{adminId}")
    public ResponseEntity<AdminDTO> getSelectedAdmin(@PathVariable String adminId){
        return ResponseEntity.ok(new AdminDTO(
                "A001",
                "Imash",
                "imash@gmail.com",
                "0965743",
                LocalDate.of(2025,5,9)
        ));
    }

    @GetMapping("/getAllAdmin")
    public ResponseEntity<List<AdminDTO>> getAdmin(){
        List<AdminDTO> adminList = new ArrayList<>();
        adminList.add(
                new AdminDTO(
                        "A001",
                        "Imash",
                        "imash@gmail.com",
                        "0965743",
                        LocalDate.of(2025,5,9)
                )
        );
        adminList.add(new AdminDTO(
                "A002",
                "Dilhara",
                "dilhara@gmail.com",
                "0760795982",
                LocalDate.of(2025,12,25)
        ));
        adminList.add(new AdminDTO(
                "A003",
                "Lakmi",
                "lakmi@gmail.com",
                "0723023095",
                LocalDate.of(2025,5,28)
        ));
        return ResponseEntity.ok(adminList);
    }
}
