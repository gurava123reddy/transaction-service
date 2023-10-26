package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Transaction;
import com.example.demo.service.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
    	 // Implement the logic to create a transaction
		return transactionService.createTransaction(transaction);
    }

    @GetMapping
    public List<Transaction> getAllTransactions() {
    	// Implement the logic to get all transactions
		return transactionService.getAllTransactions();
    }     
    
    @GetMapping("/{accountNumber}")
    public List<Transaction> getByAccountNumber(@PathVariable("accountNumber") String accountNumber) {
    	// Implement the logic to get all transactions
		return transactionService.getByAccountNumber(accountNumber);
    }     
    
}
