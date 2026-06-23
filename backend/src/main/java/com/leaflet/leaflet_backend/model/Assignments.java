package com.leaflet.leaflet_backend.model;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.OffsetDateTime;

@Entity
@Table(name = "assignments")

public class Assignments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long assignment_id;

    @Column(insertable = false, updatable = false)
    private OffsetDateTime created_at;

    private String title;
    private Integer total_points;
    private LocalDate due_date;
    private String type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "submissions_id", nullable = false)
    private Submissions submission;

    // No Arg Constructor
    public Assignments(){}

    // Full Constructor
    public Assignments(
            String title,
            Integer total_points,
            LocalDate due_date,
            String type) {

        this.title = title;
        this.total_points = total_points;
        this.due_date = due_date;
        this.type = type;
    }

    // Getters
    public String getTitle() { return this.title; }

    public Integer getTotalPoints() { return this.total_points; }

    public LocalDate getDueDate() { return this.due_date; }

    public String getType() { return this.type; }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setTotalPoints(Integer total_points) {
        this.total_points = total_points;
    }

    public void setDueDate(LocalDate due_date) {
        this.due_date = due_date;
    }

    public void setType(String type) {
        this.type = type;
    }


}
