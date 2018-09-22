package com.storage.service;

import java.util.List;
import java.util.Optional;

import com.storage.entity.SellingRecord;

public interface SellingRecordService {

	SellingRecord addOrUpdateSellingRecord(SellingRecord record);
	
	Optional<SellingRecord> getSellingRecodByProductId(Integer id);
	List<SellingRecord> getAll();
	
}
