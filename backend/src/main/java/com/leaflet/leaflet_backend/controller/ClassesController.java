package com.leaflet.leaflet_backend.controller;

import com.leaflet.leaflet_backend.model.Classes;
import com.leaflet.leaflet_backend.repository.ClassesRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/classes")

public class ClassesController {

    private final ClassesRepository class_repo;

    public ClassesController(ClassesRepository class_repo) { this.class_repo = class_repo; }

    @PostMapping
    public Classes createClass(@RequestBody Classes new_class) {
        return class_repo.save(new_class);
    }
}
