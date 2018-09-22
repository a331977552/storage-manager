package com.storage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class SellingRecord {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@OneToOne()
	@MapsId
	private Product product;
	
	@Column()
	private Integer sellingAmount;
	
	@Column()
	private Integer returnedAmount;
	
	
}
