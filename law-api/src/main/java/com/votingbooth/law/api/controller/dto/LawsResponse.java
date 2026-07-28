package com.votingbooth.law.api.controller.dto;

import java.util.List;

public class LawsResponse {
    private final List<LawDto> laws;

    public LawsResponse(List<LawDto> laws) {
        this.laws = laws;
    }

    public List<LawDto> getLaws() {
        return laws;
    }
}
