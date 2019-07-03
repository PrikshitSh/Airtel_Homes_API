package com.spring.mongo.model;

public class Silist {
	private String _id;
	private String type;
	private String subLob;

	public Silist() {
	}

	public Silist(String _id, String type, String subLob) {
		this._id = _id;
		this.type = type;
		this.subLob = subLob;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubLob() {
		return subLob;
	}

	public void setSubLob(String subLob) {
		this.subLob = subLob;
	}
}