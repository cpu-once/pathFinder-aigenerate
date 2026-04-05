package com.pathfinder;

import com.pathfinder.projects.Location;
import com.pathfinder.projects.Project;
import com.pathfinder.projects.ProjectRepository;
import com.pathfinder.projects.ProjectService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DataLoader implements CommandLineRunner {

    private final ProjectRepository projectRepository;
    private final ProjectService projectService;

    public DataLoader(ProjectRepository projectRepository, ProjectService projectService) {
        this.projectRepository = projectRepository;
        this.projectService = projectService;
    }

    @Override
    @Transactional
    public void run(String... args) {
        // Create sample data to trigger N+1
        for (int i = 1; i <= 3; i++) {
            Project project = new Project("Project " + i);
            project.addLocation(new Location("Location A of Project " + i));
            project.addLocation(new Location("Location B of Project " + i));
            projectRepository.save(project);
        }

        // Call the service method that has the N+1 problem
        projectService.demonstrateNPlusOne();
    }
}
