package com.practice.repository;

import com.practice.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findByTransactionId(int transactionId);

    List<Transaction> findByCode(String code);
}