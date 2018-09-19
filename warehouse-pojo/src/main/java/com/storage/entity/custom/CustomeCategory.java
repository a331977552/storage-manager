package com.storage.entity.custom;

import java.io.Serializable;

public class CustomeCategory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5293262374571343345L;
	private long pk;
	private String value;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPk() {
		return this.pk;
	}
	public void setPk(long pk) {
		this.pk = pk;
	}
	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
