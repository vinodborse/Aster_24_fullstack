package com.sk.service;

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
		//..........
		return "Your balance is:- ";
	}

	public String addBalance(int accountnumber, int amount) {
		// TODO Auto-generated method stub
		return null;
	}
}
