package com.storage.service;

import com.storage.entity.Productimg;
import com.storage.entity.custom.StorageResult;

public interface ProductimgService {
	StorageResult<Productimg> addProductimg(Productimg productimg );
	StorageResult updateProductimg(Productimg productimg );
	StorageResult deleteProductimgById(Integer id);
	StorageResult getProductimgByExample(Productimg  productimg );
	StorageResult getProductimgById(Integer id);
	StorageResult updateProductimgSelective(Productimg productimg );
	StorageResult count();



}
