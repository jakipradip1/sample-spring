package com.jakipradip.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.jakipradip.vo.DrugVO;

public class DurgServiceImpl extends AbstractService implements DrugService{
	

	private List<String> drugContents;
	private Set<Manufacture> manufactures;
	private Map<String, String> contentDetails;

	public DrugVO findDrugById(Long durgId) {
		DrugVO vo = new DrugVO();
		vo.setDurgName("testname");
		vo.setDrugId(durgId);
		return vo;
	}

	public DrugVO orderOnline(DrugVO vo) {
		vo.setDrugId(new Long(3000));
		this.getNotifyService().notifyCustomer();
		return vo;
	}

	public List<DrugVO> serach(String durgName) {
		// TODO Auto-generated method stub
		return null;
	}

	public DrugVO getDummyDrug() {

		return this.getDefaultDrug();
	}

	public List<String> getDrugContents() {
		return drugContents;
	}

	public void setDrugContents(List<String> drugContents) {
		this.drugContents = drugContents;
	}

	public Set<Manufacture> getManufactures() {
		return manufactures;
	}

	public void setManufactures(Set<Manufacture> manufactures) {
		this.manufactures = manufactures;
	}

	public Map<String, String> getContentDetails() {
		return contentDetails;
	}

	public void setContentDetails(Map<String, String> contentDetails) {
		this.contentDetails = contentDetails;
	}

	


}
