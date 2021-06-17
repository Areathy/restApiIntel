package com.henrietha.restApi.domain.response;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class GetCountryResponse {

    @JsonProperty("name")
    private String name;

    @JsonProperty("topLevelDomain")
    private List<String> topLevelDomain;

    @JsonProperty("alpha2Code")
    private String alpha2Code;

    @JsonProperty("alpha3Code")
    private String alpha3Code;

    @JsonProperty("callingCodes")
    private List<String> callingCodes;

    @JsonProperty("capital")
    private String capital;

    @JsonProperty("altSpellings")
    private List<String> altSpellings;

    @JsonProperty("region")
    private String region;

    @JsonProperty("subregion")
    private String subregion;

    @JsonProperty("population")
    private long population;

    @JsonProperty("latlng")
    private List<String> latlng;

    @JsonProperty("demonym")
    private String demonym;

    @JsonProperty("area")
    private long area;

    @JsonProperty("gini")
    private double gini;

    @JsonProperty("timezones")
    private List<String> timezones;

    @JsonProperty("borders")
    private List<String> borders;

    @JsonProperty("nativeName")
    private String nativeName;

    @JsonProperty("numericCode")
    private String numericCode;

    @JsonProperty("currencies")
    private List<Currency> currencies;

    @JsonProperty("languages")
    private List<Language> languages;

    @JsonProperty("translations")
    private Translation translation;

    @JsonProperty("flag")
    private String flag;

    @JsonProperty("regionalBlocs")
    private List<RegionalBlocs> regionalBlocs;

    @JsonProperty("cioc")
    private String cioc;

    public String getName() {
        return name;
    }

    public List<String> getTopLevelDomain() {
        return topLevelDomain;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public List<String> getCallingCodes() {
        return callingCodes;
    }

    public String getCapital() {
        return capital;
    }

    public List<String> getAltSpellings() {
        return altSpellings;
    }

    public String getRegion() {
        return region;
    }

    public String getSubregion() {
        return subregion;
    }

    public long getPopulation() {
        return population;
    }

    public List<String> getLatlng() {
        return latlng;
    }

    public String getDemonym() {
        return demonym;
    }

    public long getArea() {
        return area;
    }

    public double getGini() { return gini; }

    public List<String> getTimezones() { return timezones; }

    public List<String> getBorders() {
        return borders;
    }

    public String getNativeName() {
        return nativeName;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public Translation getTranslation() { return translation; }

    public String getFlag() {
        return flag;
    }

    public List<RegionalBlocs> getRegionalBlocs() {
        return regionalBlocs;
    }

    public String getCioc() {
        return cioc;
    }
}
