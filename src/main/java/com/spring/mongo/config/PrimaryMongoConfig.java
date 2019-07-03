package com.spring.mongo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.spring.mongo.repo.primary", mongoTemplateRef = "primaryMongoTemplate")
public class PrimaryMongoConfig {

}
