package com.bkav.Bai1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree=new BinaryTree();
		
		tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
        
        tree.insert(90);
        //System.out.println(tree.root.getValue());
        tree.order(3);
	}

}
