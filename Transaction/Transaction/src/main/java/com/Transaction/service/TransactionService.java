package com.Transaction.service;


import com.Transaction.entity.Transaction;
import com.Transaction.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository){
        this.transactionRepository = transactionRepository;
    }

    public Transaction createTransactions(Transaction transaction){
        return transactionRepository.save(transaction);
    }

    public List<Transaction> getAll(){
        return transactionRepository.findAll();
    }

    public Transaction update(Transaction transaction) {
        return transactionRepository.update(transaction);
    }

    public Optional<Transaction> findById(Long id) {
        return transactionRepository.findById(id);
    }

    public void deleteTransactionById(Long id) {
        transactionRepository.delete(id);
    }

    public void delete(Transaction transaction) {
        transactionRepository.delete(transaction);
    }
}
