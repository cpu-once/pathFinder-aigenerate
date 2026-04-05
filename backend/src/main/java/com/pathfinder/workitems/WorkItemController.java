package com.pathfinder.workitems;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/projects/{projectId}/work-items")
public class WorkItemController {

    @PostMapping
    public ResponseEntity<Void> createWorkItem(@PathVariable UUID projectId) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<WorkItem>> listWorkItems(@PathVariable UUID projectId) {
        return ResponseEntity.ok(List.of());
    }

    @GetMapping("/{workItemId}")
    public ResponseEntity<WorkItem> getWorkItem(@PathVariable UUID projectId, @PathVariable UUID workItemId) {
        return ResponseEntity.ok(null);
    }
}
