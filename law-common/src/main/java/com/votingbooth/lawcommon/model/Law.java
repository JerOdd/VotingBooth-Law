package com.votingbooth.lawcommon.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "laws")
public class Law {
    @Id
    private String id;

    public String getId() {
        return id;
    }
}
