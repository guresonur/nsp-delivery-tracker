package com.gures.nspdelivery.repository;

import com.gures.nspdelivery.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
