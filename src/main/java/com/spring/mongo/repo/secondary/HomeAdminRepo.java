package com.spring.mongo.repo.secondary;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mongo.model.HomeAdmin;


public interface HomeAdminRepo extends MongoRepository<HomeAdmin, String> {

	Optional<HomeAdmin> findBypassword(String password);

	Optional<HomeAdmin> findByIdAndPassword(String get_id, String password);

}
