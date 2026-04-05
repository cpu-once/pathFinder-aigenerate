package com.pathfinder;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootTest
class PathfinderApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void verifyModulithStructure() {
        ApplicationModules modules = ApplicationModules.of(PathfinderApplication.class);
        modules.verify();
    }
}
