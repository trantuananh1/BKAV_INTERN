package com.bkav.Bai1;

public class Node {
	
	private int value;
	private Node left;
	private Node right;
	
	public Node() {
		value=0;
		left=null;
		right=null;
	}
	public Node(Node that){
		this.value=that.value;
		this.left=that.left; 
		this.right=that.right;
	}
	Node(int item){
		value=item;
		left=null;
		right=null;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value=value;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left=left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right=right;
	}
}
