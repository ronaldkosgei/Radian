package com.practice.service;


import com.practice.entity.Transaction;
import com.practice.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository){
        this.transactionRepository = transactionRepository;
    }


    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public List<Transaction> getAll() {
        return transactionRepository.findAll();
    }

    public void deleteById(Long id){
        transactionRepository.deleteById(id);
    }

    public List<Transaction> findByCode(String code){
        return transactionRepository.findByCode(code);
    }

    public List<Transaction> findTransactionId(int transactionId) {
        return transactionRepository.findByTransactionId(transactionId);
    }
}
