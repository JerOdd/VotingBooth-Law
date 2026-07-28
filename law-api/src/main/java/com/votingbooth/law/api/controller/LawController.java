package com.votingbooth.law.api.controller;

import com.votingbooth.law.api.controller.dto.LawDto;
import com.votingbooth.law.api.controller.dto.LawsResponse;
import com.votingbooth.law.api.repository.entity.LawEntity;
import com.votingbooth.law.api.service.LawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LawController {

    @Autowired
    private LawService lawService;

    @GetMapping("/laws")
    public ResponseEntity<LawsResponse> getLaws() {
        List<LawEntity> laws = lawService.getLaws();
        List<LawDto> lawDtos = laws.stream()
                .map(entity -> new LawDto(entity.getId()))
                .toList();
        return ResponseEntity.ok().body(new LawsResponse(lawDtos));
    }

}
