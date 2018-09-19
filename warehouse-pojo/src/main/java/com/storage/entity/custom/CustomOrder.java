package com.storage.entity.custom;

import java.io.Serializable;

import com.storage.entity.StOrder;

public class CustomOrder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1304933195133670009L;
	private StOrder order;
	private Integer qty;
	private Integer id;
	public StOrder getOrder() {
		return this.order;
	}
	public void setOrder(StOrder order) {
		this.order = order;
	}
	public Integer getQty() {
		return this.qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}


}
