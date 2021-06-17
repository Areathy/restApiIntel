package com.henrietha.restApi.domain.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Translation {

    @JsonProperty("de")
    private String de;

    @JsonProperty("es")
    private String es;

    @JsonProperty("fr")
    private String fr;

    @JsonProperty("ja")
    private String ja;

    @JsonProperty("it")
    private String it;

    @JsonProperty("br")
    private String br;

    @JsonProperty("pt")
    private String pt;

    @JsonProperty("nl")
    private String nl;

    @JsonProperty("hr")
    private String hr;

    @JsonProperty("fa")
    private String fa;

    public String getDe() {
        return de;
    }

    public String getEs() {
        return es;
    }

    public String getFr() {
        return fr;
    }

    public String getJa() {
        return ja;
    }

    public String getIt() {
        return it;
    }

    public String getBr() {
        return br;
    }

    public String getPt() {
        return pt;
    }

    public String getNl() {
        return nl;
    }

    public String getHr() {
        return hr;
    }

    public String getFa() {
        return fa;
    }
}
