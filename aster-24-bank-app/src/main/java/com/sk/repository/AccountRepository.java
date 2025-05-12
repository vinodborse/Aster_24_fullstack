package com.sk.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sk.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
		
	public Optional<Account> findByAccountnumber(int accno);// SELECT * FROM account WHERE accountnumber = 45;
}
