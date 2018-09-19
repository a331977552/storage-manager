package com.storage.service;

import java.util.List;

import com.storage.entity.Product;
import com.storage.entity.custom.CustomOrder;
import com.storage.entity.custom.CustomProduct;
import com.storage.entity.custom.StorageResult;

public interface ProductService {
	StorageResult addProduct(CustomProduct product );
	StorageResult addProduct(Product product );
	StorageResult updateProduct(Product product );
	StorageResult deleteProductById(Integer id);
	StorageResult getProductByExample(Product  product );
	StorageResult getProductByBarCode(String barcode);

	StorageResult getProductById(Integer id);
	StorageResult updateProductSelective(Product product );
	StorageResult count(Product example);
	StorageResult getProductByExample(Product product, Integer currentPage, Integer pageSize);
	StorageResult getProductNamesByCategory(Integer categoryId);
	StorageResult getProductByExample(List<CustomOrder> jsonToList);
	StorageResult getStockReminder();
	StorageResult updateProduct(CustomProduct product);




}
