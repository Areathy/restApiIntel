package com.henrietha.restApi.domain.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Currency {
    @JsonProperty("code")
    private String code;

    @JsonProperty("name")
    private String name;

    @JsonProperty("symbol")
    private String symbol;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }
}
