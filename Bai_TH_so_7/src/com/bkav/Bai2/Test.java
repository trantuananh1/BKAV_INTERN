package com.bkav.Bai2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree=new BinaryTree();
		tree.root=new Node("+");
		tree.root.left=new Node("*");
		tree.root.right=new Node("/");
		tree.root.left.left=new Node("3");
		tree.root.left.right=new Node("5");
		tree.root.right.left=new Node("8");
		tree.root.right.right=new Node("4");
		
		System.out.println(tree.evaluate(tree.root));
	}

}
