package com.gures.nspdelivery.controller;

import com.gures.nspdelivery.model.Customer;
import com.gures.nspdelivery.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/customerList", produces = "application/json")
    public List<Customer> getCustomers() {
        return customerService.findAllCustomers();
    }

    @PostMapping(value = "/addCustomer", produces = "application/json", consumes = "application/json")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

}
