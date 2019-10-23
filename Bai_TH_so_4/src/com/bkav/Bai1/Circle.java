package com.bkav.Bai1;

public class Circle extends Shape{
	private double radius;
    private Point center;
    
    public Circle(){
        center=new Point(0,0);
        radius=1;
    }
    public Circle( Point p, double r){
        radius=r;
        center=p;
    }
    Circle(Circle target){
    	this.center=target.center;
    	this.radius=target.radius;
    }
    public void show(){
        System.out.print("\nCircle:");
        center.show();
        System.out.println("r="+radius);
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
		return new Circle(this);
	}
}
