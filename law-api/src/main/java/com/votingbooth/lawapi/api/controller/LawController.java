package com.votingbooth.lawapi.api.controller;

import com.votingbooth.lawapi.api.model.LawsResponse;
import com.votingbooth.lawcommon.model.Law;
import com.votingbooth.lawapi.service.LawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LawController {

    @Autowired
    private LawService lawService;

    @GetMapping("/laws")
    public ResponseEntity<LawsResponse> getLaws() {
        List<Law> laws = lawService.getLaws();
        return ResponseEntity.status(HttpStatus.OK).body(new LawsResponse(laws));
    }

}
