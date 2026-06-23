package com.leaflet.leaflet_backend.controller;


import com.leaflet.leaflet_backend.model.Assignments;
import com.leaflet.leaflet_backend.repository.AssignmentsRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assignments")

public class AssignmentsController {

    private final AssignmentsRepository assignment_repo;

    public AssignmentsController(AssignmentsRepository assignment_repo) { this.assignment_repo = assignment_repo; }

    @PostMapping
    public Assignments createAssignment(@RequestBody Assignments assignment){
        return assignment_repo.save(assignment);
    }
}
