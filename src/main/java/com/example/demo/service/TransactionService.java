package com.example.demo.service;
import java.util.List;

import com.example.demo.entity.Transaction;

public interface TransactionService {
    Transaction createTransaction(Transaction transaction);
    List<Transaction> getAllTransactions();
    // Additional methods as needed
	List<Transaction> getByAccountNumber(String accountNumber);
}
