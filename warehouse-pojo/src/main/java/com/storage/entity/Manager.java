package com.storage.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Data
public class Manager {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6998938988880351653L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String username;

	private String password;
	@Transient
	private boolean remember;
	@Transient
	private String token;

}