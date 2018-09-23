package com.storage.service;

import java.util.List;
import java.util.Optional;

import com.storage.entity.FeedBack;

public interface FeedBackService {

	Optional<FeedBack> addOrUpdate(FeedBack back);
	void deleteById(Integer id);
	List<FeedBack> getAll();
	
	
	Optional<FeedBack> getById(Integer id);
	
}
