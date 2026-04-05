package com.pathfinder.aggregates;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping
public class AggregateController {

    @GetMapping("/projects/{projectId}/briefs")
    public ResponseEntity<Object> getBriefs(@PathVariable UUID projectId) {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/projects/{projectId}/chronicles")
    public ResponseEntity<Object> getChronicles(@PathVariable UUID projectId) {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/projects/{projectId}/locations/{locationId}/snapshots")
    public ResponseEntity<Object> getSnapshots(@PathVariable UUID projectId, @PathVariable UUID locationId) {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/projects/{projectId}/issues/{issueId}/threads")
    public ResponseEntity<Object> getThreads(@PathVariable UUID projectId, @PathVariable UUID issueId) {
        return ResponseEntity.ok(null);
    }
}
