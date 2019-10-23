package com.bkav.Bai1;

public class Journalist extends Employee {
	private int postNumber;
	private String idJournalist;
	
	Journalist(){
		
	}
	Journalist(int postNumber, String idJournalist, String name,
			String phone, String email, String doB){
		super(name, phone, email, doB);
		this.idJournalist=idJournalist;
		this.postNumber=postNumber;
	}
	@Override
	public void printCard() {
		System.out.println("Id nha bao: "+idJournalist);
		super.printCard();
		System.out.println("So bai dang: "+postNumber);
	}
}
