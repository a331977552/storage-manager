package com.storage.service;

import com.storage.entity.Manager;
import com.storage.entity.custom.StorageResult;

public interface ManagerService {
	StorageResult<Manager> addManager(Manager manager );
	StorageResult<Manager> updateManager(Manager manager );
	StorageResult deleteManagerById(Integer id);
	StorageResult getManagerByExample(Manager  manager );
	StorageResult getManagerById(Integer id);
	StorageResult updateManagerSelective(Manager manager );
	StorageResult count();
	StorageResult login(Manager manager);
	StorageResult<Manager> getOne();



}
