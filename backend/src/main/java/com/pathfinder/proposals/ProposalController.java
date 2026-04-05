package com.pathfinder.proposals;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/issues/{issueId}")
public class ProposalController {

    @PostMapping("/ai-proposals")
    public ResponseEntity<Void> createAiProposal(@PathVariable UUID issueId) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/ai-proposals")
    public ResponseEntity<List<Proposal>> listAiProposals(@PathVariable UUID issueId) {
        return ResponseEntity.ok(List.of());
    }

    @PostMapping("/human-proposals")
    public ResponseEntity<Void> createHumanProposal(@PathVariable UUID issueId) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/human-proposals")
    public ResponseEntity<List<Proposal>> listHumanProposals(@PathVariable UUID issueId) {
        return ResponseEntity.ok(List.of());
    }
}
