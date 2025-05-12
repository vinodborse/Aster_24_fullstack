package com.sk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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

	@GetMapping("/check-balance/{accno}")
	public String chekBalance(@PathVariable("accno") int accountnumber) {
		return accountService.chekBalance(accountnumber);
	}
	
	@PostMapping("/add-balance")
	public String addBalance(
							 @RequestParam("accno") int accountnumber, 
							 @RequestParam("amount") int amount) {
		return accountService.addBalance(accountnumber, amount);
	}
	
	
	@PostMapping("/transfer-balance")
	public String transferBalance(
							 @RequestParam("fromAccountNumber") int fromAccountNumber, 
							 @RequestParam("amount") int amount,
							 @RequestParam("toAccountNumber") int toAccountNumber) {
		return accountService.transferBalance(fromAccountNumber, amount, toAccountNumber);
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