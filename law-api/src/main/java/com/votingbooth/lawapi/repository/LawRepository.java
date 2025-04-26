package com.votingbooth.lawapi.repository;

import com.votingbooth.lawcommon.model.Law;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LawRepository extends MongoRepository<Law, String> {}
