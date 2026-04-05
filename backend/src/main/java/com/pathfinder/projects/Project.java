package com.pathfinder.projects;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;

    // fetch = FetchType.LAZY is default for OneToMany, but making it explicit for clarity
    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Location> locations = new ArrayList<>();

    public Project() {}
    public Project(String name) { this.name = name; }
    
    public Long getId() { return id; }
    public String getName() { return name; }
    public List<Location> getLocations() { return locations; }
    
    public void addLocation(Location location) {
        locations.add(location);
        location.setProject(this);
    }
}
