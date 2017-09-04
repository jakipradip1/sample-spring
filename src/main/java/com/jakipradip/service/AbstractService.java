package com.jakipradip.service;

import com.jakipradip.vo.DrugVO;

public abstract class AbstractService {
	private String manufacturer ="WalGreens";
	private DrugVO defaultDrug;
	private NotifyService notifyService;

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public DrugVO getDefaultDrug() {
		return defaultDrug;
	}

	public void setDefaultDrug(DrugVO defaultDrug) {
		this.defaultDrug = defaultDrug;
	}
	
	public NotifyService getNotifyService() {
		return notifyService;
	}

	public void setNotifyService(NotifyService notifyService) {
		this.notifyService = notifyService;
	}

}
