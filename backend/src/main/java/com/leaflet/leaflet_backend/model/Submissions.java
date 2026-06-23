package com.leaflet.leaflet_backend.model;

import jakarta.persistence.*;
import org.springframework.expression.spel.ast.Assign;

import java.util.List;

@Entity
@Table(name = "submissions")
public class Submissions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long submission_id;

    @OneToMany(mappedBy = "submission", cascade = CascadeType.ALL)
    private List<Assignments> assignments;
}
