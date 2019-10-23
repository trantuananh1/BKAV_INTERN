package com.bkav.Bai1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polynomial one=new Polynomial(new Operator(4,4));
		one.add(new Operator(0,3));
		one.add(new Operator(-2.1,1));
		one.congHangTu(new Operator(2,4));
		one.print();
		System.out.println();
		
		Polynomial two=new Polynomial(new Operator(4,2));
		two.add(new Operator(3,1));
		two.print();
		
		System.out.println();
		one.congDaThuc(two);
		one.print();
	}

}
