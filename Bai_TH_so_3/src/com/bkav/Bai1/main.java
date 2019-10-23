package com.bkav.Bai1;

import java.util.*;

import com.bkav.Bai1.Person.Gender;


public class main {

	public static void main(String[] args) {
		Gender MALE=Gender.MALE;
		Gender FEMALE=Gender.FEMALE;
		Date date=new Date();
		
		Company bkav=new Company("Bkav", date);
		bkav.addNewEmployee(new Employee("Tran Tuan Anh",1999,Gender.MALE,date,"CEO", 4, 1));
		bkav.addNewEmployee(new Employee("Tran Lan Anh",2001,FEMALE,date,"Manager", 5, 1));
		bkav.addNewEmployee(new Employee("Tran Tuan Anh",1999,MALE,date,"CEO", 4, 1));
		bkav.addNewEmployee(new Employee("Tran Tuan Anh",1999,MALE,date,"CEO", 4, 1));
		bkav.addNewEmployee(new Employee("Tran Tuan Anh",1999,MALE,date,"CEO", 4, 1));
		bkav.delete(3);
		bkav.addNewEmployee(new Employee("Tran Tuan Anh",1999,MALE,date,"CEO", 4, 1));
//		bkav.addNewEmployee(new Employee("Tran Tuan Anh",1999,MALE,date,"CEO", 4, 1));
//		bkav.delete(3);
		bkav.showListEmployees();
	}

}
