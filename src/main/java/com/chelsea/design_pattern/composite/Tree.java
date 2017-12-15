package com.chelsea.design_pattern.composite;

public class Tree {

	private String name;
	private TreeNode root;

	public Tree(String name) {
		this.root = new TreeNode(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

}
