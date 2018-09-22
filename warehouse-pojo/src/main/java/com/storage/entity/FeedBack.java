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
public class FeedBack {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(name="email",nullable=true,length=32)
	private String email;

	@Column(name="name",nullable=true,length=32)
	private String name;
	@Column(name="phone",nullable=true,length=16)
	private String phone;
	
	@Column(name="comment",nullable=true,length=2048)	
	private String comment;
	
	
	
	

}
