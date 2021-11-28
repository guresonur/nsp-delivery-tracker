package com.gures.nspdelivery.controller;

import com.gures.nspdelivery.model.Project;
import com.gures.nspdelivery.model.Region;
import com.gures.nspdelivery.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/region")
public class RegionController {
    @Autowired
    private RegionService regionService;

    @GetMapping(value= "/regionList", produces = "application/json")
    public ResponseEntity<List<Region>> getRegions () {
        List<Region> regions = regionService.getRegions();
        return new ResponseEntity<>(regions, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Region> getRegionById (@PathVariable int id) {
        Region regionById = regionService.getRegionById(id);
        return new ResponseEntity<>(regionById, HttpStatus.OK);
    }

    @PostMapping(value = "/addRegion", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Region>  addRegion(@RequestBody Region region) {
        Region regionAdded = regionService.addRegion(region);
        return new ResponseEntity<>(regionAdded, HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> deleteRegionById(@PathVariable int id)
    {
        regionService.removeRegionById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
