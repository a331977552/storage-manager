package com.storage.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.ToString;
@Entity()
@Data
@ToString
public  class Product  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8220834540027600457L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String name;

	private Integer status;

	private Integer quantity;
	@Transient
	private Integer product_warning_quantity;

	private BigDecimal buyingprice;

	private BigDecimal sellingprice;
	private BigDecimal sellingprice_aftertax;
	
	private Integer category;

	private String title;
	private String imgUrl;



	private String subtitle;

	@Transient
	private Float quantity_;
	@Transient
	private String sort;
	@Transient
	private String sort_order;
	
	@Transient
	private BigDecimal buyingprice_;
	@Transient
	private BigDecimal sellingprice_;
	@Transient
	private String moneyDisplayed;
	
	@Transient
	private String content;

	

	private String supplier;

	@NotNull
	private Float vat;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdtime;
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatetime;

	@NotNull
	private String barcode;


}