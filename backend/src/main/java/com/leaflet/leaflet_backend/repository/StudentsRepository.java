package com.leaflet.leaflet_backend.repository;

import com.leaflet.leaflet_backend.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students, Long> {}
