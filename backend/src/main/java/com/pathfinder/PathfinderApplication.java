package com.pathfinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.modulith.Modulithic;

@Modulithic
@SpringBootApplication
public class PathfinderApplication {
    public static void main(String[] args) {
        SpringApplication.run(PathfinderApplication.class, args);
    }
}
