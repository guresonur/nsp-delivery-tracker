package com.gures.nspdelivery.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Country {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String countryName;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "country")
    private List<Customer> customers;

    public Country() {
    }

    public Country(int id, String countryName, List<Customer> customers) {
        this.id = id;
        this.countryName = countryName;
        this.customers = customers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
