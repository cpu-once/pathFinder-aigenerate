package com.pathfinder.decisions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/issues/{issueId}/decisions")
public class DecisionController {

    @PostMapping
    public ResponseEntity<Void> createDecision(@PathVariable UUID issueId) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{decisionId}")
    public ResponseEntity<Decision> getDecision(@PathVariable UUID issueId, @PathVariable UUID decisionId) {
        return ResponseEntity.ok(null);
    }
}
