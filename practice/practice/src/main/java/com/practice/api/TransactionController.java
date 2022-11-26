package com.practice.api;

import com.practice.entity.Transaction;
import com.practice.service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public Transaction addTransaction(@RequestBody Transaction transaction) {
        return transactionService.createTransaction(transaction);
    }

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return transactionService.getAll();
    }

    @GetMapping("transaction/{transactionId}")
    public List<Transaction> getAllTransactionsByTransactionsId(@PathVariable("transactionId") int transactionId) {
        return transactionService.getAll();
    }

    @PutMapping("mass/{transactionId}")
    public List<Transaction> updateAllTransactionsById(@PathVariable("transactionId") int transactionId) {
        return transactionService.getAll();
    }

    @PatchMapping
    public List<Transaction> updateAllTransactionsByTransactionType(@PathVariable("transactionType") String transactionType) {
        return transactionService.getAll();
    }

    @DeleteMapping("guide/{id}")
    public void deleteAllTransactionsById(@PathVariable("id") Long id) {
        transactionService.deleteById(id);
    }

   @GetMapping("code/{code}")
    public List<Transaction> getAllTransactionsByCode(@PathVariable("code") String code){
        return transactionService.findByCode(code);
   }
}