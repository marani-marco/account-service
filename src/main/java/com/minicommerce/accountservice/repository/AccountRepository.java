package com.minicommerce.accountservice.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.minicommerce.accountservice.entity.Account;

@Repository
public interface AccountRepository extends MongoRepository<Account, ObjectId>{
	
	

}
