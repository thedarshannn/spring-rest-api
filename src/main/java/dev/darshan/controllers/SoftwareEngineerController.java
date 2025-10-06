package dev.darshan.controllers;

import dev.darshan.model.SoftwareEngineer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {


    @GetMapping
    public List<SoftwareEngineer> getSoftwareEngineers() {
            return List.of(
                    new SoftwareEngineer(
                            1,
                            "James",
                            "js,java"
                    ),
                    new SoftwareEngineer(
                            2,
                            "Julia",
                            "js,react"
                    )
            );
    }
}
