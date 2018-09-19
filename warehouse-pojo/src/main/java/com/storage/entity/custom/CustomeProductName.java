package com.storage.entity.custom;

import java.io.Serializable;


public class CustomeProductName implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -871609292778256334L;
	private Integer id;
	private String name;
	public Integer getId() {
		return this.id;
	}
	public CustomeProductName(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public CustomeProductName() {
		super();
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
