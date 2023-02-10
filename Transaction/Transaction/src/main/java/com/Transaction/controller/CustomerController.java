package com.Transaction.controller;


import com.Transaction.entity.Customer;
import com.Transaction.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @PostMapping
    public Customer addCustomers(@RequestBody Customer customer){
        return customerService.createCustomers(customer);
    }

    @GetMapping("list")
    public List<Customer> getAllCustomers(){
        return customerService.getAll();
    }

    @GetMapping("customer")
    public Optional<Customer> findCustomerById(@RequestBody Long id){
        return customerService.findById(id);
    }

    @PutMapping
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.update(customer);
    }

    @PatchMapping
    public Customer updateCustomerById(@PathVariable Long id){
        return customerService.updateById(id);
    }

    @DeleteMapping("customer")
    public void deleteCustomer(@RequestParam("id") Long id){
        customerService.deleteById(id);
    }

    @DeleteMapping("customers")
    public void deleteCustomers(@RequestBody Customer customer){
        customerService.delete(customer);
    }
}
