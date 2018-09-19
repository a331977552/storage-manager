package com.storage.service;


import java.util.List;

import com.storage.entity.Category;
import com.storage.entity.custom.StorageResult;

public interface CategoryService {
	

	
	StorageResult<Category>  addCategory(Category category );

	StorageResult<Category>  updateCategory(Category category);

	StorageResult  deleteCategoryById(Integer id);
	StorageResult<List<Category>>  findAll();
	StorageResult<List<Category>>  getCategoryByExample(Category  category );
	StorageResult<Category>  getCategoryById(Integer id);
	StorageResult<Category>  updateCategorySelective(Category category );
	StorageResult<Long>  count();



}
