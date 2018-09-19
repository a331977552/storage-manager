package com.storage.service;

import com.storage.entity.Cart;
import com.storage.entity.custom.StorageResult;

public interface CartService {

	public StorageResult<Cart> addCart(Cart cart);
	public StorageResult<Cart> updateCart(Cart cart);
	public StorageResult<String> deleteCartById(Integer userId);
	public StorageResult<Cart> findCartById(Integer uerId);
	public StorageResult<Cart> findAllCarts();
	public StorageResult<Cart> emptyCart(Integer userId);
	public StorageResult<Cart> mergeCart(Cart cart);
	
	
}
