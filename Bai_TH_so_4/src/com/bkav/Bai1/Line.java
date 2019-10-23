package com.bkav.Bai1;

public class Line extends Shape{
	private Point p1;
    private Point p2;
    
    public Line(){}
    public Line(Point p1, Point p2){
        this.p1=p1;
        this.p2=p2;
    }
    Line(Line target){
    	this.p1=target.p1;
    	this.p2=target.p2;
    }
//    public double distance(){
//        return Math.sqrt(Math.pow((p1.x-p2.x),2)+Math.pow((p1.y-p2.y),2));
//    }
    public void show(){
        System.out.print("\nLine: ");
        p1.show();
        p2.show();
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
		return new Line(this);
	}
}
