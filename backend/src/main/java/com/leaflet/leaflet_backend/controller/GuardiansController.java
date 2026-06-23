package com.leaflet.leaflet_backend.controller;

import com.leaflet.leaflet_backend.model.Guardians;
import com.leaflet.leaflet_backend.repository.GuardiansRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guardians")

public class GuardiansController {

    private final GuardiansRepository guardian_repo;

    public GuardiansController(GuardiansRepository guardian_repo) {
        this.guardian_repo = guardian_repo;
    }

    @PostMapping
    public Guardians createGuardian(@RequestBody Guardians guardian) {
        return guardian_repo.save(guardian);
    }
}
