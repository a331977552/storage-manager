package com.storage.entity.custom;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class OrderTableItem {
	
	private Integer id;
	private String orderNumber;
	private Integer price;
	private String name;
	private String phone;
	@JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
	private Date createdTime;
	private Integer status;
	private String modifiedPrice;

	
}
