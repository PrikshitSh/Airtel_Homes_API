package com.spring.mongo.repo.primary;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mongo.model.HomesOrder;


public interface HomesOrderRepo extends MongoRepository<HomesOrder, String> {

	Optional<HomesOrder> findById(String id);

}