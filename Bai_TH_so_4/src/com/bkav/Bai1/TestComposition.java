package com.bkav.Bai1;

public class TestComposition {

	public static void main(String[] args) {
		
		Point pRand1=new Point(3,2);
		Point pRand2=new Point(1,5);
		Point pRand3=new Point(5,2);
		Point pRand4=new Point(9,1);
		
//		Graphic listShape=new Graphic();
//		listShape.add(new Circle(pRand1, 3));
//		listShape.add(new Rectangle(pRand1, pRand2, pRand3, pRand4));
//		listShape.add(new Line(pRand2, pRand3));
		
		Point pClone=(Point) pRand1.clone();
		
		pClone.show();
		pRand1.setX(4);
		pRand1.setY(5);
		pRand1.show();
		
		pClone.show();
		//listShape.show();
	}

}
