package com.bkav.Bai1;

import java.util.*;

public class Office {
	private String idOffice;
	private String name;
	private List<Employee> employees=new ArrayList<>();
	
	Office(){
		
	}
	Office(String idOffice, String name){
		this.idOffice=idOffice;
		this.name=name;
	}
	void addEmployee(Employee e) {
		if (e.getIdOffice()!=null) {
			System.out.println("Nhan vien nay dang lam o cong ty khac");
		}else {
			e.setIdOffice(this.idOffice);
			employees.add(e);
		}
	}
	void deleteEmployee(Employee e) {
		if (employees.contains(e)){
			employees.remove(e);
		}else {
			System.out.println("Khong tim thay");
		}
	}
	void printOffice() {
		System.out.println("Ma toa bao: "+idOffice);
		System.out.println("Ten toa bao: "+name);
		System.out.println("Danh sach nhan vien: ");
		for (Employee e:employees) {
			e.printCard();
		}
	}
}
