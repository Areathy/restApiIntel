package com.henrietha.restApi.service;

import com.henrietha.restApi.domain.response.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ConsumeRestAPI {

    @Autowired
    private RestTemplate restTemplate;

    public List<GetCountryResponse> getBooks2() {
        String url = "https://restcountries.eu/rest/v2/all";
        GetCountryResponse[] getCountryResponses = restTemplate.getForObject(url, GetCountryResponse[].class);
        return Arrays.asList(getCountryResponses);
    }

    @GetMapping(value = "/extra")
    public String getBooks() {
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
}
