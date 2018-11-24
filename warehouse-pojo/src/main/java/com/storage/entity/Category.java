package com.storage.entity;

import java.io.Serializable;
import java.util.Set;

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

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Category implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4282331764874158809L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@NotNull
	@Column(name="name")
	private String text;
	
	@JsonIgnore
//	@ManyToOne(fetch=FetchType.LAZY)
	@Transient
	private Category parentObj;
	
	@Column(name="parent_id")
	private Integer parent;
	
	@JsonIgnore
//    @OneToMany(mappedBy="parent")
	@Transient
    private Set<Category> children;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable = false)
	@CreationTimestamp
	private java.util.Date created;

	
	@org.hibernate.annotations.UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date updated;

}