package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Account1;
import com.example.demo.repository.Account1Reposotory;

@RestController
public class TransactionController {
	
	@Autowired
	private Account1Reposotory account1Repository;


    @PostMapping("/create-account")
    public ResponseEntity<String> createAccount(@RequestBody Account1 account1) {
    	
    	Account1 savedAccount = account1Repository.save(account1);
    	
    	return new ResponseEntity<>("Account1 with " + savedAccount.getAccountNumber() + " saved successfully", HttpStatus.CREATED);
    	
    }
}
