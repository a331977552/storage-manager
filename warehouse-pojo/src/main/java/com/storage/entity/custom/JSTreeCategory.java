package com.storage.entity.custom;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class JSTreeCategory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String text;
	private Integer parent;
	
	
}
