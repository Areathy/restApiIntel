package com.henrietha.restApi.domain.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Language {

    @JsonProperty("iso639_1")
    private String iso639_1;

    @JsonProperty("iso639_2")
    private String iso639_2;

    @JsonProperty("name")
    private String name;

    @JsonProperty("nativeName")
    private String nativeName;

    public String getIso639_1() {
        return iso639_1;
    }

    public String getIso639_2() {
        return iso639_2;
    }

    public String getName() {
        return name;
    }

    public String getNativeName() {
        return nativeName;
    }
}
