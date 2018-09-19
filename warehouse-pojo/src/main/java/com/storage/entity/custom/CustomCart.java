package com.storage.entity.custom;

import lombok.Data;

@Data()
public class CustomCart {

	private int productid;
	private int quantity;
	public CustomCart(int productid, int quantity) {
		super();
		this.productid = productid;
		this.quantity = quantity;
	}
	public CustomCart() {
		super();
	}
	
	
}
