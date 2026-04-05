package com.pathfinder.decisions;

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
@Table(name = "decisions")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Decision {

    @Id
    private UUID id;
    
    private UUID issueId;
    private UUID selectedProposalId;
    
    @Column(columnDefinition = "TEXT")
    private String rationale;
    
    private UUID decidedBy;
    private LocalDateTime decidedAt;

    public Decision(UUID issueId, UUID selectedProposalId, String rationale, UUID decidedBy) {
        this.id = UUID.randomUUID();
        this.issueId = issueId;
        this.selectedProposalId = selectedProposalId;
        this.rationale = rationale;
        this.decidedBy = decidedBy;
        this.decidedAt = LocalDateTime.now();
    }
}
