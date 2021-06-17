package com.henrietha.restApi.domain.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RegionalBlocs {

    @JsonProperty("acronym")
    private String acronym;

    @JsonProperty("name")
    private String name;

    @JsonProperty("otherAcronyms")
    private List<String> otherAcronyms;

    @JsonProperty("otherNames")
    private List<String> otherNames;

    public String getAcronym() {
        return acronym;
    }

    public String getName() {
        return name;
    }

    public List<String> getOtherAcronyms() {
        return otherAcronyms;
    }

    public List<String> getOtherNames() {
        return otherNames;
    }
}
