package com.storage.entity.custom;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.storage.entity.Customer;
import com.storage.entity.StOrder;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class OrderWrap  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3852296541265907283L;
	private List<CustomProduct> list;
	private BigDecimal totalPrice;
	private String totalPriceDisplay;
	private Date date;
	private StOrder order;
	private Customer customer;
	private int code;
	private String msg;
	private String payUrl;
	
	
}
