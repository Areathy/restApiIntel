package com.henrietha.restApi.controller;

import com.henrietha.restApi.domain.response.GetCountryResponse;
import com.henrietha.restApi.service.ConsumeRestAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/country")
public class CountryController {
    private ConsumeRestAPI consumeRestAPI;

    public CountryController(ConsumeRestAPI consumeRestAPI) {
        this.consumeRestAPI = consumeRestAPI;
    }

    @GetMapping(value = "/list")
    public List<?> listCountries() {
        List<GetCountryResponse> response  = consumeRestAPI.getCountries();
        List<String> names = new ArrayList<>();
        for (GetCountryResponse res: response) {
            names.add(res.getTranslation().getBr());
        }

//        (GetCountryResponse res: response -> (names.add(res.getTranslation().getBr()));

        return names;
    }

    @GetMapping(value = "/extra")
    public String extraCalls() {
        String response  = consumeRestAPI.getUrl();
//        String google = response.substring(0,30);

        return response;
    }


}
