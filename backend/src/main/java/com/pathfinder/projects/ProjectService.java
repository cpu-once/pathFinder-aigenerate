package com.pathfinder.projects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjectService {
    private static final Logger log = LoggerFactory.getLogger(ProjectService.class);
    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    /**
     * Demonstrates the N+1 Query Problem.
     * 1 query is executed to find all projects.
     * Then N queries are executed when accessing the lazily loaded locations for each project.
     */
    @Transactional(readOnly = true)
    public void demonstrateNPlusOne() {
        log.info("--- N+1 Problem Demonstration Start ---");
        
        // 1st Query: fetch all projects
        List<Project> projects = projectRepository.findAll();
        
        log.info("Found {} projects. Now accessing their locations...", projects.size());
        
        for (Project project : projects) {
            // This access will trigger an additional query for EACH project (N queries)
            int locationCount = project.getLocations().size();
            log.info("Project: '{}', Locations count: {}", project.getName(), locationCount);
        }
        
        log.info("--- N+1 Problem Demonstration End ---");
    }
}
