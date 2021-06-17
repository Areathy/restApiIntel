package com.henrietha.restApi.controller;

import com.henrietha.restApi.domain.response.GetCountryResponse;
import com.henrietha.restApi.service.ConsumeRestAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/country")
public class CountryController {

    @Autowired
    private ConsumeRestAPI apiService;

    @GetMapping(value = "/list")
    public List<?> listCountries() {
        List<GetCountryResponse> response  = apiService.getBooks2();
        List<String> names = new ArrayList<>();
        for (GetCountryResponse res: response) {
            names.add(res.getTranslation().getBr());
        }
        return names;
    }

    @GetMapping (value = "/extra")
    public String extraCalls() {
        List<GetCountryResponse> response  = apiService.getBooks2();
        String names = new String();
        return names;
    }
}
