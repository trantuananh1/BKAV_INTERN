package com.bkav.Bai1;

public class BinaryTree {

	public Node root;
	
	public BinaryTree() {
		root=null;
	}
	BinaryTree(Node value){
		root=new Node(value);
	}
	
	
	public Node searchNode(Node root, int value) {
		if (root==null||root.getValue()==value) {
			return root;
		}
     
		if (root.getValue()<value) {
			return searchNode(root.getRight(),value );
		}
		return searchNode(root.getLeft(),value );
	}
	void insert(int key) {
		root=insertNode(root, key);
	}
	public Node insertNode(Node root,int key) {
		if (root==null) {
			root=new Node(key);
			return root;
		}
		if (key<root.getValue()) {
			root.setLeft(insertNode(root.getLeft(),key));
		}else {
			root.setRight(insertNode(root.getRight(),key));
		}
		return root;
	}
	
	void preOrder(Node root) {
		if (root!=null) {
			System.out.println(root.getValue());
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}
	void inOrder(Node root) {
		if (root!=null) {
			
			inOrder(root.getLeft());
			System.out.println(root.getValue());
			inOrder(root.getRight());
		}
	}
	void posOrder(Node root) {
		if (root!=null) {
			posOrder(root.getLeft());
			posOrder(root.getRight());
			System.out.println(root.getValue());
		}
	}
	void order(int choice) {
		switch(choice) {
		case 1: {
			preOrder(root);
			break;
		}
		case 2: {
			inOrder(root);
			break;
		}
		case 3:{
			posOrder(root);
			break;
		}
		}
	}
}
