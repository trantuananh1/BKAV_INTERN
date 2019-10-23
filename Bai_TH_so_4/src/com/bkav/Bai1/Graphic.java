package com.bkav.Bai1;

public class Graphic extends Shape{
	private Shape[] shapes;
	private int num=0;
	
	Graphic(){
		shapes=new Shape[10];
	}
	Graphic(Graphic target) {
		this.shapes=target.shapes;
	}
	@Override
	public void show() {
		for (Shape shape : shapes) {
			shape.show();
		}
	}
	@Override
	public void operation() {
		// TODO Auto-generated method stub
	}

	@Override
	public void add(Shape sh) {
		shapes[num++]=sh;
	}

	@Override
	public void remove(Shape sh) {
		// TODO Auto-generated method stub
	}

	@Override
	public Shape getChild(int index) {
		// TODO Auto-generated method stub
		return shapes[index];
	}
	@Override
	public Shape clone() {
		// TODO Auto-generated method stub
		return new Graphic(this);
	}

}
