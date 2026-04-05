package com.pathfinder.users;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;

import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    private UUID id;

    private String name;
    private String email;
    private String role;

    public User(String name, String email, String role) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.role = role;
    }
}
