package com.pathfinder.issues;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping
public class IssueController {

    @PostMapping("/projects/{projectId}/issues")
    public ResponseEntity<Void> createIssue(@PathVariable UUID projectId) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/projects/{projectId}/issues")
    public ResponseEntity<List<Issue>> listIssues(@PathVariable UUID projectId) {
        return ResponseEntity.ok(List.of());
    }

    @GetMapping("/issues/{issueId}")
    public ResponseEntity<Issue> getIssue(@PathVariable UUID issueId) {
        return ResponseEntity.ok(null);
    }
}
