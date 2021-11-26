package com.gures.nspdelivery.service;

import com.gures.nspdelivery.model.Customer;
import com.gures.nspdelivery.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(int id) {
        return customerRepository.findById(id);
    }

    public void removeCustomerById(int id) {
        customerRepository.deleteById(id);
    }

}
