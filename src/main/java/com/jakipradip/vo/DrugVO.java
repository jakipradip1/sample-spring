package com.jakipradip.vo;

public class DrugVO {
	private String durgName;
	private Long drugId;
	private Long count;
	private String drugDesc;
	private String manufacture;
	
	
	
	public DrugVO() {
	}
	
	
	

	public DrugVO(String durgName, String drugDesc) {
		super();
		this.durgName = durgName;
		this.drugDesc = drugDesc;
	}




	public DrugVO(String durgName, Long drugId) {
		super();
		this.durgName = durgName;
		this.drugId = drugId;
	}



	public void initialize(){
		System.out.println("Initialized method called");
	}
	
	public void destroy(){
		System.out.println("destroy method callded");
	}
	public String getDurgName() {
		return durgName;
	}
	public void setDurgName(String durgName) {
		this.durgName = durgName;
	}
	public Long getDrugId() {
		return drugId;
	}
	public void setDrugId(Long drugId) {
		this.drugId = drugId;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public String getDrugDesc() {
		return drugDesc;
	}
	public void setDrugDesc(String drugDesc) {
		this.drugDesc = drugDesc;
	}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	@Override
	public String toString() {
		return "DrugVO [durgName=" + durgName + ", drugId=" + drugId + ", count=" + count + ", drugDesc=" + drugDesc
				+ ", manufacture=" + manufacture + "]";
	}
	
	
}
