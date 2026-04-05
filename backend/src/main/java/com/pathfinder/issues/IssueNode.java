package com.pathfinder.issues;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Node("Issue")
@Getter
@Setter
public class IssueNode {

    @Id
    private String issueId;
    
    private String title;

    @Relationship(type = "RELATES_TO", direction = Relationship.Direction.OUTGOING)
    private Set<IssueNode> relatedIssues = new HashSet<>();

    public IssueNode(String issueId, String title) {
        this.issueId = issueId;
        this.title = title;
    }
}
