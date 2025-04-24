package com.votingbooth.lawapi.api.model;

import com.votingbooth.lawapi.model.Law;

import java.util.List;

public class LawsResponse {
    private final List<Law> laws;

    public LawsResponse(List<Law> laws) {
        this.laws = laws;
    }

    public List<Law> getLaws() {
        return laws;
    }
}
