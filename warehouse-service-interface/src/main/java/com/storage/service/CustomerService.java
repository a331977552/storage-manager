package com.storage.service;

import com.storage.entity.Customer;
import com.storage.entity.custom.StorageResult;

public interface CustomerService {
	StorageResult addCustomer(Customer customer );
	StorageResult updateCustomer(Customer customer );
	StorageResult deleteCustomerById(Integer id);
	StorageResult getCustomerByExample(Customer  customer );
	StorageResult getCustomerById(Integer id);
	StorageResult updateCustomerSelective(Customer customer );
	StorageResult count();
	Object getCustomerList(String order);
	StorageResult getCustomerByName(String name);
	Object List();
	Object login(Customer customer);



}
