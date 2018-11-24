package com.storage.entity;

import java.util.List;

import lombok.Data;

@Data
public class ProductDetail {
	
	
	private Product product;
	private List<Productimg> imgs;
	private Category category;
	private List<Vat> vats;	
}
