package com.Transaction.repository;

import com.Transaction.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    default Customer update(Customer customer) {
        return null;
    }

    default Customer updateById(Long id) {
        return null;
    }
}
