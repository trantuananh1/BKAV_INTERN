package com.bkav.Bai2;


public class Node {
	
	public String value;
	public Node left;
	public Node right;
	
	public Node() {
		value="";
		left=null;
		right=null;
	}
	Node(Node that){
		this.value=that.value;
		this.left=that.left; 
		this.right=that.right;
	}
	Node(String item){
		value=item;
		left=null;
		right=null;
	}
	public boolean isLeaf() {
		return ((this.left==null)&&(this.right==null));
	}
	
}
