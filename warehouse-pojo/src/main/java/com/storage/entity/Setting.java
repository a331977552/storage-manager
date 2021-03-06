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
public class Setting  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -6329992845507200732L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

    private String companyname;

    private String companyaddress;

    private String postcode;

    private String phone;
    //1 means pounds
    //2 means rmb
    private Integer currencyDisplay;

    private String name;

    private String businesshours;
    private String description;

    private String apliPayUrl;
    private String wxPayUrl;
    private String managerWeChatUrl;
    private String managerWeChatId;
    
    private Float currencyRate;
  
}