package com.spring.mongo.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mongo.model.HomeAdmin;
import com.spring.mongo.repo.secondary.HomeAdminRepo;

import io.swagger.annotations.ApiOperation;

@RestController
public class HomeAdminController {

	@Autowired
	private HomeAdminRepo repository;

	@PostMapping("/addAdmin")
	@ApiOperation(value = "Checks that credential input by the user is correct")
	public ResponseEntity<LogResponse> saveStaff(@Valid @RequestBody HomeAdmin staff) {
		LogResponse loginResponse = new LogResponse();
		Optional<HomeAdmin> s = repository.findByIdAndPassword(staff.getId(), staff.getPassword());
		if (s.isPresent()) {
			System.out.println("Found...");
			loginResponse.setType("No Error");
			loginResponse.setDomain("global");
			loginResponse.setReason("loggedin Successfully");
			loginResponse.setMessage("LoggedIn Successfully");
			loginResponse.setCode(200);
			return new ResponseEntity<LogResponse>(loginResponse, HttpStatus.OK);
		}
		loginResponse.setType("Error");
		loginResponse.setDomain("global");
		loginResponse.setReason("Invalid Parameters");
		loginResponse.setMessage("Invalid Credentials have been entered");
		loginResponse.setCode(400);
		System.out.println("Not Found...");
		return new ResponseEntity<LogResponse>(loginResponse, HttpStatus.BAD_REQUEST);
	}
}