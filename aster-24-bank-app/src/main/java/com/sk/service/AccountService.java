package com.sk.service;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.model.Account;
import com.sk.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;

	public Account createAccount(Account account) {
		
		account.setBalance(0);
		
		Random r= new Random();

        // Generate random integers in range 0 to 999
        int number = r.nextInt(1000);
		
		account.setAccountnumber(number);
		
		return accountRepository.save(account);
		
	}

	public String chekBalance(int accountnumber) {
		Optional<Account> userAccount =  accountRepository.findByAccountnumber(accountnumber);
		
		if(userAccount.isPresent()) {
			return  "Your balance is:- " +userAccount.get().getBalance();
		} else {
			return  "Please Enter valid account number";
		}
		

		
	}

	public String addBalance(int accountnumber, int amount) {
		
		Optional<Account> userAccount = accountRepository.findByAccountnumber(accountnumber);
		
		if(userAccount.isPresent()) {
			int currentBalance = userAccount.get().getBalance();
			int updatedBalance = currentBalance + amount;
			userAccount.get().setBalance(updatedBalance);
			accountRepository.save(userAccount.get());
			return "Balance added successfully..!!!";
		} else {
			return "Please provide valid account number..!!!";
		}
		

	}


	public String transferBalance(int fromAccountNumber, int amount, int toAccountNumber) {
		// valid fromAccountNumber
		// valid toAccountNumber
		// check balance of your account-> balance >= amount
		// your balance - amount
		// to balance + amount
		return null;
	}
}

