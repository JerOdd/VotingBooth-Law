package com.votingbooth.law.api.repository;

import com.votingbooth.law.model.Law;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LawRepository extends MongoRepository<Law, String> {}
