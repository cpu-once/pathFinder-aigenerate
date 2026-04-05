package com.pathfinder.proposals;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;

import java.util.UUID;
import java.time.LocalDateTime;

@Entity
@Table(name = "proposals")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Proposal {

    @Id
    private UUID id;
    
    private UUID issueId;
    private String type; // "AI" or "HUMAN"
    private UUID authorId; 
    
    @Column(columnDefinition = "TEXT")
    private String content;
    
    private LocalDateTime createdAt;

    public Proposal(UUID issueId, String type, UUID authorId, String content) {
        this.id = UUID.randomUUID();
        this.issueId = issueId;
        this.type = type;
        this.authorId = authorId;
        this.content = content;
        this.createdAt = LocalDateTime.now();
    }
}
