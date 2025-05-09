package com.sk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sk.model.Account;
import com.sk.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@PostMapping("/create-account")
	public Account createAccount(@RequestBody Account account) {
		return accountService.createAccount(account);
	}
	
	public String chekBalance(int accountnumber) {
		return accountService.chekBalance(accountnumber);
	}
	
	public String addBalance(int accountnumber, int amount) {
		return accountService.addBalance(accountnumber, amount);
	}
	
}


/*
 
 {
    "firstname": "Don",
    "lastname": "Bhau",
    "email": "don@aaa.com",
    "mobile": 9876,
    "aadhar": "007"
}
 
*/