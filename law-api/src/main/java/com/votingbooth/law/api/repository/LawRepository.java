package com.votingbooth.law.api.repository;

import com.votingbooth.law.api.repository.entity.LawEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LawRepository extends JpaRepository<LawEntity, UUID> {}
