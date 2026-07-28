package com.votingbooth.law.api.service;

import com.votingbooth.law.api.repository.LawRepository;
import com.votingbooth.law.api.repository.entity.LawEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LawService {
    @Autowired
    private LawRepository lawRepository;

    public List<LawEntity> getLaws() {
        return lawRepository.findAll();
    }
}
