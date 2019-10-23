package com.bkav.Bai2;

public class BinaryTree {

	public Node root;

	public BinaryTree() {
		root = null;
	}

	BinaryTree(Node value) {
		root = new Node(value);
	}

	public int evaluate(Node root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return Integer.valueOf(root.value);
		}
		int l_val = evaluate(root.left);
		int r_val = evaluate(root.right);
		int res = 0;
		switch (root.value) {
		case "+": {
			res = l_val + r_val;
			break;
		}
		case "-": {
			res = l_val - r_val;
			break;
		}
		case "*": {
			res = l_val * r_val;
			break;
		}
		case "/": {
			res = l_val / r_val;
			break;
		}
		}
		return res;
	}

	void preOrder(Node root) {
		if (root != null) {
			System.out.println(root.value);
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	void inOrder(Node root) {
		if (root != null) {

			inOrder(root.left);
			System.out.println(root.value);
			inOrder(root.right);
		}
	}

	void posOrder(Node root) {
		if (root != null) {
			posOrder(root.left);
			posOrder(root.right);
			System.out.println(root.value);
		}
	}

	void order(int choice) {
		switch (choice) {
		case 1: {
			preOrder(root);
			break;
		}
		case 2: {
			inOrder(root);
			break;
		}
		case 3: {
			posOrder(root);
			break;
		}
		}
	}
}
