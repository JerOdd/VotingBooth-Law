package com.votingbooth.lawapi.service;

import com.votingbooth.lawapi.repository.LawRepository;
import com.votingbooth.lawapi.model.Law;
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
