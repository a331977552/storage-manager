package com.storage.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString

public class Customer  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2267936939525646264L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
//	@SequenceGenerator(name="book_generator", sequenceName = "book_seq", allocationSize=50)
	private Integer id;

	@Column(length=2)
	private String language;

	private String username;
	private String password;
	
	private String email;
	
	private String lastName;
	
	private String firstName;
	
	
	
	private String name;

	private String phone;

	private String address;

	private String postcode;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createtime;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updatetime;}