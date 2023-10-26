package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Transaction;
import com.example.demo.repository.TransactionRepository;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Transaction createTransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
        // Implement the logic to create a transaction
    }

    @Override
    public List<Transaction> getAllTransactions() {
		return transactionRepository.findAll();
        // Implement the logic to get all transactions
    }

	@Override
	public List<Transaction> getByAccountNumber(String accountNumber) {
		return transactionRepository.findByAccountNumber(accountNumber);
	}

}
