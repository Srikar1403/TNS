package com.tns.constructordemo;

public class Customer1 {
	private String customername;
	private int customerid;
	private String customeraddress;
	
//	Customer1(){
//		System.out.println("Default");
//	}
	public Customer1(String customername, int customerid, String customeraddress) {
		this.customername = customername;
		this.customerid = customerid;
		this.customeraddress = customeraddress;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomeraddress() {
		return customeraddress;
	}

	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}

	@Override
	public String toString() {
		return "Customer1 [customername=" + customername + ", customerid=" + customerid + ", customeraddress="
				+ customeraddress + "]";
	}
	

}
