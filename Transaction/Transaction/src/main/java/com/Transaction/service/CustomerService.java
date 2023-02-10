package com.Transaction.service;

import com.Transaction.entity.Customer;
import com.Transaction.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private  final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public Customer createCustomers(Customer customer){
        return customerRepository.save(customer);
    }

    public List<Customer> getAll(){
        return customerRepository.findAll();
    }

    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    public Customer update(Customer customer) {
        return customerRepository.update(customer);
    }

    public Customer updateById(Long id) {
        return customerRepository.updateById(id);
    }

    public void deleteById(Long id) {
        customerRepository.deleteById(id);
    }

    public void delete(Customer customer) {
        customerRepository.delete(customer);
    }
}

