package com.chetan.StudentImfo;

public class StudentModel {
	
	private int id;
	private String Name;
	private String MobileNo;
	private Double Fees;
	
	public void setSid(int id) {
		this.id = id;
	}
	
	public void setSName(String Name) {
	    this.Name = Name;	
	}
	public void setMobileNo(String MobileNo) {
	    this.MobileNo = MobileNo;
	}
	public void setFees(Double Fees) {
	    this.Fees = Fees;
	}
	
	public int getid() {
		return this.id;
	}
	public String getName() {
		return this.Name;
	}
	public String getMobileNO() {
		return this.MobileNo;
	}
	public Double getFees() {
		return this.Fees;
	}
}
 


