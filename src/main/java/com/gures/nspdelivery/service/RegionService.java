package com.gures.nspdelivery.service;

import com.gures.nspdelivery.model.Region;
import com.gures.nspdelivery.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class RegionService {
    @Autowired
    private RegionRepository regionRepository;

    public List<Region> getRegions() {
        return regionRepository.findAll();
    }

    public Region addRegion(Region region) {
        return regionRepository.save(region);
    }

    public Region getRegionById(int id) {
        return regionRepository.findById(id).orElse(null);
    }

    public void removeRegionById(int id) {
        regionRepository.deleteById(id);
    }

}
