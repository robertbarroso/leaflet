package com.leaflet.leaflet_backend.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.OffsetDateTime;

@Entity
@Table(name = "guardians")

public class Guardians {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long guardian_id;

    @Column(insertable = false, updatable = false)
    private OffsetDateTime created_at;

    private String first_name;
    private String last_name;
    private String phone_number;
    private String email;

    @Column(columnDefinition = "TEXT")
    private String address;

    // No Arg Constructor
    public Guardians(){}

    // Full Constructor
    public Guardians(
            String first_name,
            String last_name,
            String phone_number,
            String email,
            String address) {

        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.email = email;
        this.address = address;
    }

    // Getters
    public String getFirstName() { return this.first_name; }

    public String getLastName() { return this.last_name; }

    public String getPhoneNumber() { return this.phone_number; }

    public String getEmail() { return this.email; }

    public String getAddress() { return this.address; }

    // Setters
    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public void setPhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
