package com.storage.entity.custom;

import java.math.BigDecimal;
import java.util.List;

import com.storage.entity.Product;
import com.storage.entity.Productimg;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CustomProduct {

	private Product product;
	private List<Productimg> imgs;
	private Integer qty;
	private BigDecimal subtotal;
	private String subtotalDisplayed;
	


}
