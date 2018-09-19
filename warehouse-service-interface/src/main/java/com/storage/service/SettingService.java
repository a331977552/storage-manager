package com.storage.service;

import com.storage.entity.Setting;
import com.storage.entity.custom.StorageResult;

public interface SettingService {
	StorageResult addSetting(Setting setting );
	StorageResult updateSetting(Setting setting );
	StorageResult deleteSettingById(Integer id);
	StorageResult getSettingByExample(Setting  setting );
	StorageResult getSettingById(Integer id);
	StorageResult updateSettingSelective(Setting setting );
	StorageResult count();
	StorageResult<Setting> getSetting();



}
