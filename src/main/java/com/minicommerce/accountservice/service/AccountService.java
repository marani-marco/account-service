package com.minicommerce.accountservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.minicommerce.accountservice.entity.Account;
import com.minicommerce.accountservice.repository.AccountRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	public Account saveAccount(Account account){
		
		log.info("AccountService.saveAccount - account salvato o modificato: " + account.toString());
		return accountRepository.save(account);
	}
	
	public Account getAccountById(String id){
		
		log.info("AccountService.getAccountById - id: " + id);
		return mongoTemplate.findById(id, Account.class);
	}
}
