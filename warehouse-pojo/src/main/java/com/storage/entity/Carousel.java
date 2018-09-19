package com.storage.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class Carousel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String pic_url;
	private String redirect_url;

	private String title;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdtime;
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatetime;
	
	

	
	
}
