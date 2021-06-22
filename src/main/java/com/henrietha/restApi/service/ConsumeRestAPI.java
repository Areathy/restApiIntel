package com.henrietha.restApi.service;

import com.henrietha.restApi.domain.response.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ConsumeRestAPI {

    @Autowired
    private RestTemplate restTemplate;

    public List<GetCountryResponse> getCountries() {
        String url = "https://restcountries.eu/rest/v2/all";
        GetCountryResponse[] getCountryResponses = restTemplate.getForObject(url, GetCountryResponse[].class);
        return Arrays.asList(getCountryResponses);
    }

    public String getUrl() {
        String url = "https://www.google.com";
        String objects = restTemplate.getForObject(url, String.class);
        return objects;
    }



//    @GetMapping("/getJson")
//    public List<Object> getBooks2() {
//        String url = "https://restcountries.eu/rest/v2/all";
//        Object[] objects = restTemplate.getForObject(url, Object[].class);
//        return Arrays.asList(objects);
//    }

//    @GetMapping(value = "/extra")
//    public String getBooks() {
//        String url = "https://www.google.com";
//        String objects = restTemplate.getForObject(url, String.class);
//        return objects;
//    }
}
