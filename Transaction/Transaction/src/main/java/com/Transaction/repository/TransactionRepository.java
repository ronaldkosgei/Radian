package com.Transaction.repository;

import com.Transaction.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    default void delete(Long id) {

    }

    default Transaction update(Transaction transaction) {
        return null;
    }
}
