package com.storage.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Vat  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 7042406678558306323L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	
    private Integer price;

    private Float rate;

}