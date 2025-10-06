package dev.darshan.controllers;

import dev.darshan.model.SoftwareEngineer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {


    SoftwareEngineer s1 = new SoftwareEngineer(1, "Darshan", List.of("Java", "Spring Boot", "Python"));
    SoftwareEngineer s2 = new SoftwareEngineer(2, "Alice", List.of("JavaScript", "React", "Node.js"));
    SoftwareEngineer s3 = new SoftwareEngineer(3, "Bob", List.of("C#", ".NET", "Azure"));



    @GetMapping
    public List<SoftwareEngineer> getSoftwareEngineers() {
        return List.of(s1, s2, s3);
    }
}
