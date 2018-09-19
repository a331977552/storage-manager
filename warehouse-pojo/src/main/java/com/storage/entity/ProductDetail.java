package com.storage.entity;

import java.util.List;

import lombok.Data;

@Data
public class ProductDetail {
	
	
	private Product product;
	private List<Productimg> imgs;
	private List<Category> categories;
	private List<Vat> vats;
	
	
}
