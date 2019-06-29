package com.gabrielc.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gabrielc.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	

}
