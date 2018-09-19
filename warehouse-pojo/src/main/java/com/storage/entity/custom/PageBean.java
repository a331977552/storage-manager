package com.storage.entity.custom;

import java.io.Serializable;
import java.util.List;

public class PageBean<T>  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7905517076836597747L;
	private Integer currentPage;
	private Integer totalPage;
	/**
	 * this.currentPage*this.pageSize;
	 */
	private Integer startCount;
	/**
	 * 页面的起始数字和结束数字
	 */
	private Integer beginNumber;
	public Integer getBeginNumber() {
		return this.beginNumber;
	}
	
	public PageBean() {
		super();
	}

	public void setBeginNumber(Integer beginNumber) {
		this.beginNumber = beginNumber;
	}
	public Integer getEndNumber() {
		return this.endNumber;
	}
	public void setEndNumber(Integer endNumber) {
		this.endNumber = endNumber;
	}
	@Override
	public String toString() {
		return "PageBean [beans=" + beans + "]";
	}
	private Integer endNumber;

	public Integer getStartCount() {
		return this.startCount;
	}
	public void setStartCount(Integer startCount) {
		this.startCount = startCount;
	}
	private Integer totalCount;
	private List<T> beans;
	private Integer pageSize;



	public PageBean(Integer currentPage, Integer totalCount, Integer pageSize) {

		this.currentPage = currentPage;

		this.totalCount = totalCount;
		this.pageSize = pageSize;
		if(pageSize==null || pageSize<=0)
		{
			this.pageSize=10;

		}
		this.totalPage = (totalCount+ this.pageSize-1)/this.pageSize;

		if(currentPage==null) {
			this.currentPage=0;
			/*	System.out.println(this.currentPage  );
		System.out.println(this.totalPage  );
		System.out.println(this.totalCount   );*/
		}

		if(	this.currentPage>=this.totalPage) {
			this.currentPage=this.totalPage-1;
		}

		if(	this.currentPage<0) {
			this.currentPage=0;
		}

		this.startCount=	this.currentPage*this.pageSize;


		if(this.currentPage<=5 || this.totalPage <=10) {
			this.beginNumber=0;
			if(this.totalPage>10) {
				this.endNumber=10;
			}else {
				this.endNumber=this.totalPage;
			}

		}else {
			this.endNumber=  this.currentPage+4;
			if(this.endNumber>this.totalPage) {
				this.endNumber=this.totalPage;
			}
			this.beginNumber=this.endNumber-9;
			if(this.beginNumber<0) {
				this.beginNumber=0;
			}

		}



	}
	public Integer getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getTotalPage() {
		return this.totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public List<T> getBeans() {
		return this.beans;
	}
	public void setBeans(List<T> beans) {
		this.beans = beans;
	}
	public Integer getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}


}
