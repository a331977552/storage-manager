package com.storage.service;

import java.util.List;

import com.storage.entity.Advertisement;

public interface AdvertisementService {

	
	public Advertisement addAdvertisement(Advertisement ad);
	public void updateAdvertisement(Advertisement ad);	
	public void deleteAdvertisement(Advertisement ad);
	
	public List<Advertisement> findAdvertisementByPosition(Integer direction);
	
	
}
