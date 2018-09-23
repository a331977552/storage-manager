package com.storage.service;

import java.util.List;

import com.storage.entity.Customer;
import com.storage.entity.StOrder;
import com.storage.entity.custom.OrderTableItem;
import com.storage.entity.custom.OrderWrap;
import com.storage.entity.custom.StorageResult;

public interface StOrderService {
	StorageResult addStOrder(StOrder stOrder );
	StorageResult updateStOrder(OrderTableItem stOrder );
	StorageResult deleteStOrderById(Integer id);
	StorageResult getStOrderByExample(StOrder  stOrder );
	StorageResult getStOrderById(Integer id);
	StorageResult updateStOrderSelective(StOrder stOrder );
	StorageResult count();
	OrderWrap creaOrder(Customer customer, OrderWrap result);
	StorageResult<List<OrderTableItem>> findAllTableItems();
	OrderWrap getInfoFromOrder(Integer orderId);
	StorageResult<List<OrderTableItem>> findAllTableItemsByUserId(Integer Id);

}
