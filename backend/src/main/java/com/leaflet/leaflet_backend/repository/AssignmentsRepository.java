package com.leaflet.leaflet_backend.repository;

import com.leaflet.leaflet_backend.model.Assignments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentsRepository extends JpaRepository<Assignments, Long> {}
