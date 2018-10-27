package com.storage.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Orderitem  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -5244106390757246415L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

    private Integer productid;

    private Integer orderid;

    private Integer quantity;

    private BigDecimal unitprice;

    private BigDecimal totalprice;

    private String pic;
    private String productName;
    

  
}