package com.pathfinder.projects;

import jakarta.persistence.*;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project;

    public Location() {}
    public Location(String name) { this.name = name; }
    
    public Long getId() { return id; }
    public String getName() { return name; }
    public Project getProject() { return project; }
    public void setProject(Project project) { this.project = project; }
}
