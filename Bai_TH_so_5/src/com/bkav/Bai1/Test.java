package com.bkav.Bai1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee one=new Journalist(12, 
				"Tran Anh",
				"019284",
				"wewr",
				"sdf@gmail.com",
				"23/2/1999");
		Employee two=new Officer("Nhan vien", 
				"Ho Dac",
				"019284",
				"wewr",
				"lua@gmail.com",
				"5/3/1222");
		one.printCard();
		two.printCard();
		
		Office bkav=new Office("32", "Bkav");
		bkav.addEmployee(one);
		bkav.addEmployee(two);
		bkav.printOffice();
	}

}
