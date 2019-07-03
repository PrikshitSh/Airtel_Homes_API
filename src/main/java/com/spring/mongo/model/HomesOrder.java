package com.spring.mongo.model;

import java.util.List;

import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "homes_order_details")
public class HomesOrder {
	@NotNull(message = "id cannot be null")
	@Id
	private String id;
	private String homesId;
	private String orderStatus;
	private String noOfServices;
	private String epochTime;
	private String creationDate;
	private String orderType;
	public List<Silist> siList;
	public List<AccountList> accountList;
	public List<TaskList> taskList;

	public HomesOrder() {
	}

	public HomesOrder(String id, String homesId, String orderStatus, String noOfServices, String epochTime,
			String creationDate, String orderTypesubLob, String orderType) {
		this.id = id;
		this.homesId = homesId;
		this.orderStatus = orderStatus;
		this.noOfServices = noOfServices;
		this.epochTime = epochTime;
		this.creationDate = creationDate;
		this.orderType = orderType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHomesId() {
		return homesId;
	}

	public void setHomesId(String homesId) {
		this.homesId = homesId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getNoOfServices() {
		return noOfServices;
	}

	public void setNoOfServices(String noOfServices) {
		this.noOfServices = noOfServices;
	}

	public String getEpochTime() {
		return epochTime;
	}

	public void setEpochTime(String epochTime) {
		this.epochTime = epochTime;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
}
