package com.storage.service;

import java.util.List;

import com.storage.entity.Carousel;
import com.storage.entity.custom.StorageResult;

public interface CarouselService {
	
	StorageResult<Carousel> add(Carousel carousel);
	StorageResult<Carousel> update(Carousel carousel);
	StorageResult<String> deleteById(Integer id);
	StorageResult<List<Carousel>> findAll();
	StorageResult<Carousel> findById(Integer id);
	StorageResult<List<Carousel>> findAllByExample(Carousel carousel);
	
	
	
	

}
