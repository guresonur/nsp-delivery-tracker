package com.gures.nspdelivery.service;

import com.gures.nspdelivery.model.Country;
import com.gures.nspdelivery.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    
    @Autowired
    private CountryRepository countryRepository;


    public Country addCountry(Country Country) {
        return countryRepository.save(Country);
    }

    public List<Country> findAllCountry() {
        return countryRepository.findAll();
    }

    public Optional<Country> getCountryById(int id) {
        return countryRepository.findById(id);
    }

    public void removeCountryById(int id) {
        countryRepository.deleteById(id);
    }
    
}
