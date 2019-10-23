package com.bkav.Bai1;

import java.util.*;

public class Company {
	private String name;
	private Date dateCreate;
	private Employee[] employees=new Employee[10];
	private int count=0;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}
	public Company(String name, Date dateCreate) {
		this.name=name;
		this.dateCreate=dateCreate;
	}
	
	public String getName() {
		return this.name;
	}
	public void showListEmployees() {
		System.out.println("LIST EMPLOYEES OF "+getName()+":\n");
		for (Employee employee : employees) {
			if (employee!=null) {
				employee.display();
			}
		}
	}
	public void addNewEmployee(Employee e) {
		if (count >10) {
			info();
			return;
		}
		employees[count++]=e;
	}
	public void delete(int otherId) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i]!=null && employees[i].getId()==otherId) {
				employees[i]=null;
				break;
			}
		}
	}
	public void info() {
		System.out.println("Company is full");
	}
}
