package com.gures.nspdelivery.controller;

import com.gures.nspdelivery.model.Country;
import com.gures.nspdelivery.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping(value = "/countryList", produces = "application/json")
    public List<Country> getCountries() {
        return countryService.findAllCountry();
    }

    @PostMapping(value = "/addcountry", produces = "application/json", consumes = "application/json")
    public Country addcountry(@RequestBody Country country) {
        return countryService.addCountry(country);
    }


}
