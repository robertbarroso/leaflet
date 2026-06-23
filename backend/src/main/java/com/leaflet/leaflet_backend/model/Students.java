package com.leaflet.leaflet_backend.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.OffsetDateTime;

@Entity
@Table(name = "students")

public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long student_id;

    @Column(insertable = false, updatable = false)
    private OffsetDateTime created_at;

    private String first_name;
    private String last_name;
    private String preferred_name;
    private LocalDate date_of_birth;
    private LocalDate start_date;
    private Integer grade_level;
    private String sex;
    private String email;
    private String phone_number;

    // No Arg Constructor
    public Students(){}

    // Full Constructor
    public Students(
            String first_name,
            String last_name,
            String preferred_name,
            LocalDate date_of_birth,
            LocalDate start_date,
            Integer grade_level,
            String sex,
            String email,
            String phone_number) {

        this.first_name = first_name;
        this.last_name = last_name;
        this.preferred_name = preferred_name;
        this.date_of_birth = date_of_birth;
        this.start_date = start_date;
        this.grade_level = grade_level;
        this.sex = sex;
        this.email = email;
        this.phone_number = phone_number;
    }

    // Getters
    public String getFirstName(){
        return this.first_name;
    }

    public String getLastName(){
        return this.last_name;
    }

    public String getPreferredName(){
        return this.preferred_name;
    }

    public LocalDate getDateOfBirth(){
        return this.date_of_birth;
    }

    public LocalDate getStartDate(){
        return this.start_date;
    }

    public Integer getGradeLevel() {
        return this.grade_level;
    }

    public String getSex(){
        return this.sex;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhoneNumber(){
        return this.phone_number;
    }

    // Setters
    public void setFirstName(String first_name){
        this.first_name = first_name;
    }

    public void setLastName(String last_name){
        this.last_name = last_name;
    }

    public void setPreferredName(String preferred_name){
        this.preferred_name = preferred_name;
    }

    public void setDateOfBirth(LocalDate date_of_birth){
        this.date_of_birth = date_of_birth;
    }

    public void setStartDate(LocalDate start_date){
        this.start_date = start_date;
    }

    public void setGradeLevel(Integer grade_level){
        this.grade_level = grade_level;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phone_number){
        this.phone_number = phone_number;
    }
}
