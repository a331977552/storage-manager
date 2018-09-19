package com.storage.service;

import com.storage.entity.Orderitem;
import com.storage.entity.custom.StorageResult;

public interface OrderitemService {
	StorageResult addOrderitem(Orderitem orderitem );
	StorageResult updateOrderitem(Orderitem orderitem );
	StorageResult deleteOrderitemById(Integer id);
	StorageResult getOrderitemByExample(Orderitem  orderitem );
	StorageResult getOrderitemById(Integer id);
	StorageResult updateOrderitemSelective(Orderitem orderitem );
	StorageResult count();



}
