package com.storage.service;

import java.util.List;
import java.util.Optional;

import com.storage.entity.OptionalSearch;

public interface OptionalSearchService {

	public Optional<OptionalSearch> findOneById(Integer id);

	public List<OptionalSearch>  findAll();
	public List<OptionalSearch>  findAll(OptionalSearch example);
	public void deleteById(Integer id);
	public void deleteByIds(List<Integer> ids);
	
	public OptionalSearch add(OptionalSearch optionalSearch);
	
	public List<OptionalSearch>  addAll(List<OptionalSearch> optionalSearch);
	
	public OptionalSearch update(OptionalSearch optionalSearch);

	
	
}
