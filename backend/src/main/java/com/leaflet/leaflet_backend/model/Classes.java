package com.leaflet.leaflet_backend.model;

import jakarta.persistence.*;

import javax.naming.InterruptedNamingException;
import java.time.OffsetDateTime;
import java.util.List;

@Entity
@Table(name = "classes")
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long class_id;

    @Column(insertable = false, updatable = false)
    private OffsetDateTime created_at;

    private String title;
    private Integer number;
    private String topic;

    @OneToMany(mappedBy = "class", cascade = CascadeType.ALL)
    private List<Sections> sections;

    // No Arg Constructor
    public Classes(){}

    // Full Constructor
    public Classes(
            String title,
            Integer number,
            String topic) {

        this.title = title;
        this.number = number;
        this.topic = topic;
    }

    // Getters
    public String getTitle(){ return this.title; }

    public Integer getNumber() { return this.number; }

    public String getTopic() { return this.topic; }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
