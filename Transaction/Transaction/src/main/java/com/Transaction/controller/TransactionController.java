package com.Transaction.controller;


import com.Transaction.entity.Transaction;
import com.Transaction.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("transaction")
public class TransactionController {

    @Autowired
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService){
        this.transactionService = transactionService;
    }

    @PostMapping
    public Transaction addTransactions(@RequestBody Transaction transaction){
        return transactionService.createTransactions(transaction);
    }

    @GetMapping("list")
    public List<Transaction> getAllTransactions(){
        return transactionService.getAll();
    }

    @PutMapping
    public Transaction addTransaction(@RequestBody Transaction transaction){
        return transactionService.update(transaction);
    }

    @PatchMapping
    public Transaction updateTransactionsById(@PathVariable Transaction id){
        return transactionService.update(id);
    }

    @GetMapping("transactions")
    public Optional<Transaction> findTransactionById(@PathVariable Long id){
        return transactionService.findById(id);
    }

    @DeleteMapping("transaction")
    public void deleteTransactionById(@RequestParam("id") Long id){
         transactionService.deleteTransactionById(id);
    }

    @DeleteMapping("transactions")
    public void deleteTransactions(@RequestBody Transaction transaction){
        transactionService.delete(transaction);
    }
}

