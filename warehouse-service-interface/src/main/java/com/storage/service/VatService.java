package com.storage.service;

import java.util.List;

import com.storage.entity.Vat;
import com.storage.entity.custom.StorageResult;

public interface VatService {
	StorageResult addVat(Vat vat );
	StorageResult updateVat(Vat vat );
	StorageResult deleteVatById(Integer id);
	StorageResult<List<Vat>> getVatByExample(Vat  vat );
	StorageResult getVatById(Integer id);
	StorageResult updateVatSelective(Vat vat );
	StorageResult<Long> count();
	StorageResult findAll();



}
