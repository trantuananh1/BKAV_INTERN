package com.bkav.Bai1;

public abstract class Shape {
	public abstract void operation();
	public abstract void remove(Shape sh);
	public abstract Shape getChild(int index);
	public abstract void add(Shape sh);
	public abstract void show();
	public abstract Shape clone();
}
