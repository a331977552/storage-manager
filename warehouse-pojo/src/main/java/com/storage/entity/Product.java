package com.storage.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

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


	private Integer status;

	private Integer quantity;
	@Transient
	private Integer product_warning_quantity;

	private BigDecimal buyingprice;

	/**
	 * 实际想卖多少
	 */
	private BigDecimal sellingprice;
	/**
	 * 实际显示在前端的价格
	 */
	private BigDecimal sellingprice_aftertax;
	
	private Integer category;

	private String name;
	/**
	 * 每个包含6个,
	 * 每公斤
	 */
	private String quantityDesc;
	/**
	 * 买二送一,
	 * 买三送二
	 * Now £1.85, was £2.29
	 */
	private String promotionTitle;
	/**
	 * 原价多少,
	 * after tax
	 */
	private BigDecimal sellingprice_old;
	
	/**
	 * 热销,
	 */
	private String offer;
	/**
	 * 热销背景颜色
	 */
	private String offerColor;
	 
	private String imgUrl;

	
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
	private BigDecimal sellingprice_old_;
	
	@Transient
	private String moneyDisplayed;

	@Transient
	private String oldMoneyDisplayed;
	
	@Transient
	private String content;

	

	private String supplier;

	@NotNull
	private Float vat;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable = false)
	@CreationTimestamp
	private Date createdtime;
	@Temporal(TemporalType.TIMESTAMP)

	@org.hibernate.annotations.UpdateTimestamp
	private Date updatetime;

	@NotNull
	private String barcode;



}