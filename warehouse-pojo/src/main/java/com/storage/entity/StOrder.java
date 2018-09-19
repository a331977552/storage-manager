package com.storage.entity;

import java.io.Serializable;
import java.util.Date;

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
public class StOrder  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1207604289544117919L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

    private String payment;

    private Integer status;

    private Integer totalprice;
    
    private Integer shippingfee;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdtime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatetime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date closedtime;

    private String buyername;

    private String comment;

    private Integer customerid;

    @Temporal(TemporalType.TIMESTAMP)
    private Date shippingtime;

    private String ordernumber;

   
}