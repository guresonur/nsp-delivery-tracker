package com.gures.nspdelivery.controller;

import com.gures.nspdelivery.model.Customer;
import com.gures.nspdelivery.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/customerList", produces = "application/json")
    public ResponseEntity<List<Customer>> getCustomers() {

        List<Customer> allCustomers = customerService.findAllCustomers();
        return new ResponseEntity<>(allCustomers, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Customer> getCustomerById (@PathVariable int id) {
        Customer customerById = customerService.getCustomerById(id);
        return new ResponseEntity<>(customerById, HttpStatus.OK);
    }

    @PostMapping(value = "/addCustomer", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {

        Customer addedCustomer = customerService.addCustomer(customer);
          return new ResponseEntity<>(addedCustomer, HttpStatus.CREATED);
            }
}
