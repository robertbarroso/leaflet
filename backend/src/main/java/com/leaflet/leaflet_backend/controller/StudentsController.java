package com.leaflet.leaflet_backend.controller;

import com.leaflet.leaflet_backend.model.Students;
import com.leaflet.leaflet_backend.repository.StudentsRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")

public class StudentsController {

    private final StudentsRepository student_repo;

    public StudentsController(StudentsRepository student_repo){
        this.student_repo = student_repo;
    }

    @PostMapping
    public Students createStudent(@RequestBody Students student){
        return student_repo.save(student);
    }
}
