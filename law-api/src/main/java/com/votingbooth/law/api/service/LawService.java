package com.votingbooth.law.api.service;

import com.votingbooth.law.api.repository.LawRepository;
import com.votingbooth.law.model.Law;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LawService {
    @Autowired
    private LawRepository lawRepository;

    public List<Law> getLaws() {
        System.out.println("##### laws: "+lawRepository.findAll());
        return lawRepository.findAll();
    }
}
