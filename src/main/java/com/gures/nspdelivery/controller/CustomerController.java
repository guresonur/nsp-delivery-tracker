package com.gures.nspdelivery.controller;

import com.gures.nspdelivery.model.Customer;
import com.gures.nspdelivery.repository.CustomerRepository;
import com.gures.nspdelivery.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping(value = "/customerList", produces = "application/json")
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @PostMapping(value = "/addCustomer", produces = "application/json", consumes = "application/json")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }


}
