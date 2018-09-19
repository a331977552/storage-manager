package com.storage.entity.custom;

import java.io.Serializable;

public class StorageResult<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6503302470516760992L;
	private boolean success;
	private String msg;
	private T result;
	private int code;
	public static final int SUCCESS=200;
	public static final int FAILURE=500;

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public static <T> StorageResult<T> succeed() {
		StorageResult<T> storageResult=new StorageResult<T>();
		storageResult.setMsg("success");
		storageResult.setCode(SUCCESS);
		storageResult.setSuccess(true);
		storageResult.setResult(null);
		return storageResult;
	}

	public static <T> StorageResult<T>   succeed(T obj) {
		StorageResult<T> storageResult=new StorageResult<T>();
		storageResult.setMsg("success");
		storageResult.setSuccess(true);
		storageResult.setResult(obj);
		storageResult.setCode(SUCCESS);
		return storageResult;
	}


	public static <T> StorageResult<T> failed(int code,T obj) {

		StorageResult<T> storageResult=new StorageResult<T>();
		storageResult.code = code;
		storageResult.setMsg("failed");
		storageResult.setSuccess(false);
		storageResult.setResult(obj);
		return storageResult;
	}

	public static <T>StorageResult<T> failed(int code,String msg) {
		StorageResult<T> storageResult=new StorageResult<T>();
		storageResult.code = code;
		storageResult.setMsg(msg);
		storageResult.setSuccess(false);
		return storageResult;
	}
	public static <T>StorageResult<T> failed(T obj) {


		return failed(FAILURE,obj);
	}

	public static <T> StorageResult<T> failed(String msg) {
		return failed(FAILURE,msg);
	}


	public static <T> StorageResult<T>  failed() {
		StorageResult<T> storageResult=new StorageResult<T>();
		storageResult.setMsg("failed");
		storageResult.setSuccess(false);
		return storageResult;
	}

	public boolean isSuccess() {
		return this.success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMsg() {
		return this.msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getResult() {
		return this.result;
	}
	public void setResult(T result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "StorageResult [success=" + success + ", result=" + result + "]";
	}


}
