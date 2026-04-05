package com.pathfinder.workitems;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;

import java.util.UUID;
import java.time.LocalDate;

@Entity
@Table(name = "work_items")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class WorkItem {

    @Id
    private UUID id;
    
    private UUID projectId;
    private String title;
    private String status;
    private LocalDate startDate;
    private LocalDate endDate;

    public WorkItem(UUID projectId, String title, LocalDate startDate, LocalDate endDate) {
        this.id = UUID.randomUUID();
        this.projectId = projectId;
        this.title = title;
        this.status = "PLANNED";
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
