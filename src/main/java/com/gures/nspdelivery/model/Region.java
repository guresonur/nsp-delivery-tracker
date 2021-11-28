package com.gures.nspdelivery.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Region {

    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int regionId;

    @Column(unique = true)
    private String regionName;

    @OneToMany(mappedBy = "region", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Country> countries;

    public Region() {
    }

    public Region(int regionId, String regionName, List<Country> countries) {
        this.regionId = regionId;
        this.regionName = regionName;
        this.countries = countries;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
}
