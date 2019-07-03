package com.spring.mongo.model;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "homes_admin_user_profiles")
public class HomeAdmin {
	@Id
	@NotNull(message = "id cannot be null")
	private String id;
	@NotNull(message = "password cannot be null")
	private String password;

	public HomeAdmin() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
