package com.bkav.Bai1;

public class Officer extends Employee{
	private String regency;
	private String idOfficer;
	
	Officer(){
		
	}
	Officer(String idOfficer, String name, String phone, String email,
			String doB, String regency){
		super(name, phone, email, doB);
		this.idOfficer=idOfficer;
		this.regency=regency;
	}
	
	@Override
	public void printCard() {
		System.out.println("Ma nhan vien hanh chinh: "+idOfficer);
		super.printCard();
		System.out.println("Chuc vu: "+regency);
	}
}
