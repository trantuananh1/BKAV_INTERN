package com.bkav.Bai1;

public class Rectangle extends Shape{
	private Point p1;
	private Point p2;
	private Point p3;
	private Point p4;
    
    public Rectangle(){}
    public Rectangle(Point p1, Point p2, Point p3,Point p4){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
        this.p4=p4;
    }
    public Rectangle(Rectangle target){
        this.p1=target.p1;
        this.p2=target.p2;
        this.p3=target.p3;
        this.p4=target.p4;
    }
    public void show(){
        System.out.print("Rectangle: ");
        p1.show();p2.show();p3.show();p4.show();
        System.out.println();
    }
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(Shape sh) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Shape getChild(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void add(Shape sh) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Shape clone() {
		// TODO Auto-generated method stub
		return new Rectangle(this);
	}
}
