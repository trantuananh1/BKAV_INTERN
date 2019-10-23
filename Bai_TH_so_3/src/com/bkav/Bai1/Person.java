package com.bkav.Bai1;

public class Person {
	public enum Gender{
		MALE, FEMALE
	};
	public static int countEmployee=0;
	private int id=0;
	private String name;
	private int yearOfBirth;
	private Gender gender;
	
	Person(String name, int yearOfBirth, Gender gender){
		countEmployee++;
		this.id=countEmployee;
		this.name=name;
		this.yearOfBirth=yearOfBirth;
		this.gender=gender;
	}
	public void display() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Year of birth: "+yearOfBirth);
		System.out.println("Gender: "+gender);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
}
