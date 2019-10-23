package com.bkav.Bai1;

public class Point extends Shape{
	private int x;
    private int y;
    public Point(){
        x=0; y=0;
    }
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    Point(Point target){
    	this.x=target.x;
    	this.y=target.y;
    }
    public void show(){
        System.out.print("("+x+","+y+"),");
    }
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
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
		return new Point(this);
	}
}
