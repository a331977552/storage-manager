package com.storage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Advertisement {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column
	private String message;
	
	@Column
	private String imgUrl;
	
	@Column
	private String clickUrl;
	
	@Column
	//1 means top
	//2 means left
	private  Integer position;
	
}
