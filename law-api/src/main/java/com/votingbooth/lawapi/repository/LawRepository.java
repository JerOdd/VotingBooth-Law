package com.votingbooth.lawapi.repository;

import com.votingbooth.lawapi.model.Law;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public interface LawRepository extends MongoRepository<Law, String> {}
