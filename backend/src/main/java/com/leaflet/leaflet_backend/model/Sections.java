package com.leaflet.leaflet_backend.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;

import java.time.OffsetDateTime;
import java.util.List;

@Entity
@Table(name = "sections")
public class Sections {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sections_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_id", nullable = false)
    private Classes class_title;
}
