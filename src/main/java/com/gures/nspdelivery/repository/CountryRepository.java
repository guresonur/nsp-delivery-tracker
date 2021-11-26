package com.gures.nspdelivery.repository;

import com.gures.nspdelivery.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}
