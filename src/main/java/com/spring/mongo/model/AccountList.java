package com.spring.mongo.model;

public class AccountList {
	private String lob;
	private String accountId;
	private String[] siList;
	private String bundledServiceType;

	public AccountList() {
	}

	public AccountList(String lob, String accountId, String[] siList, String bundledServiceType) {
		this.lob = lob;
		this.accountId = accountId;
		this.siList = siList;
		this.bundledServiceType = bundledServiceType;
	}

	public String getLob() {
		return lob;
	}

	public void setLob(String lob) {
		this.lob = lob;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String[] getSiList() {
		return siList;
	}

	public void setSiList(String[] siList) {
		this.siList = siList;
	}

	public String getBundledServiceType() {
		return bundledServiceType;
	}

	public void setBundledServiceType(String bundledServiceType) {
		this.bundledServiceType = bundledServiceType;
	}

}
