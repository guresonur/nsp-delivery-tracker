package com.gures.nspdelivery.controller;

import com.gures.nspdelivery.model.Country;
import com.gures.nspdelivery.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping(value = "/countryList", produces = "application/json")
    public ResponseEntity<List<Country>>  getCountries() {
        List<Country> countries = countryService.findAllCountry();
        return new ResponseEntity<>(countries, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Country> getCountryById(@PathVariable int id) {
        Country countryById = countryService.getCountryById(id).orElse(null);
        return new ResponseEntity<>(countryById, HttpStatus.OK);
    }

    @PostMapping(value = "/addCountry", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Country> addCountry(@RequestBody Country country) {
        Country addedCountry = countryService.addCountry(country);
        return new ResponseEntity<>(addedCountry, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> deleteCountryById(@PathVariable int id)
    {
        countryService.removeCountryById(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

