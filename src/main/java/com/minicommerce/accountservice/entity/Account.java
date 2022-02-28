package com.minicommerce.accountservice.entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String address;
	private String city;
	private String country;
	private String telephoneNumber;
	
}
