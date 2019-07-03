package com.spring.mongo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mongo.model.HomesOrder;
import com.spring.mongo.repo.primary.HomesOrderRepo;

import io.swagger.annotations.ApiOperation;

@RestController
public class HomesOrderController<HomeCustomer> {

	@Autowired
	private HomesOrderRepo repository;

	@GetMapping("/findAllOrders")
	@ApiOperation(value = "Finds all the orders in Airtel Homes")
	public java.util.List<HomesOrder> getStaff() {
		return repository.findAll();
	}

	@GetMapping("findOrder/{id}")
	@ApiOperation(value = "Searches the single Order deatls")
	public ResponseEntity<LogResponse> getStaff(@PathVariable String id) {
		LogResponse loginResponse = new LogResponse();
		Optional<HomesOrder> s = repository.findById(id);
		if (s.isPresent()) {
			System.out.println("Found...");
			loginResponse.setType("No Error");
			loginResponse.setDomain("ID");
			loginResponse.setReason("Search Successfull");
			loginResponse.setMessage("Details of this order found");
			loginResponse.setCode(200);
			return new ResponseEntity<LogResponse>(loginResponse, HttpStatus.OK);
		}
		loginResponse.setType("Error");
		loginResponse.setDomain("ID");
		loginResponse.setReason("Invalid ID given");
		loginResponse.setMessage("No data found");
		loginResponse.setCode(400);
		System.out.println("Not Found...");
		return new ResponseEntity<LogResponse>(loginResponse, HttpStatus.BAD_REQUEST);
	}
}
