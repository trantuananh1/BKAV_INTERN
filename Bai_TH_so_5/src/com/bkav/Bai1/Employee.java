package com.bkav.Bai1;

public class Employee {
	protected String name;
	protected String phone;
	protected String email;
	protected String doB;
	protected String idOffice;
	
	Employee(){
		
	}
	Employee(String name, String phone, String email, String doB){
		this.name=name;
		this.phone=phone;
		this.email=email;
		this.doB=doB;
	}
	
	public String getIdOffice() {
		return idOffice;
	}
	public void setIdOffice(String idOffice) {
		this.idOffice = idOffice;
	}
	public void printCard() {
		System.out.println("Ho ten: "+name);
		System.out.println("SDT: "+phone);
		System.out.println("Email: "+email);
		System.out.println("Ngay sinh: "+doB);
		System.out.println("Ma toa bao: "+idOffice);
	}
}
