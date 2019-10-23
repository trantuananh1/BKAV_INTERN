package com.bkav.Bai1;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Employee extends Person{
	SimpleDateFormat ft=new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dateJoin;
	private String position;
	private double salaryLevel;
	private double basicSalary;
	
	public Employee(String name, int yearOfBirth, Gender gender,
			Date dateJoin, String position, double salaryLevel, double basicSalary){
		super(name, yearOfBirth, gender);
		this.dateJoin=dateJoin;
		this.position=position;
		this.salaryLevel=salaryLevel;
		this.basicSalary=basicSalary;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Date join: "+ft.format(dateJoin));
		System.out.println("Position: "+position);
		System.out.println("Salary: "+getIncome());
		System.out.println();
	}
	public double getIncome() {
		return salaryLevel*basicSalary;
	}
	public void setSalaryLevel(double salaryLevel) {
		this.salaryLevel=salaryLevel;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary=basicSalary;
	}
}
