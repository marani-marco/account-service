package com.minicommerce.accountservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minicommerce.accountservice.entity.Account;
import com.minicommerce.accountservice.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@PostMapping("/save")
	public Account saveAccount(@RequestBody Account account){
		return accountService.saveAccount(account);
	}
	
	@GetMapping("/get/{id}")
	public Account getAccountById(@PathVariable String id){
		return accountService.getAccountById(id);
	}
	
}
