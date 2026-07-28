package com.votingbooth.law.api.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
@Table(name = "laws")
public class LawEntity {
    @Id
    private UUID id;

    public UUID getId() {
        return id;
    }
}
