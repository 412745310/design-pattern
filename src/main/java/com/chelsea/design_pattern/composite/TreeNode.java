package com.chelsea.design_pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

	private String name;
	private TreeNode parent;
	private List<TreeNode> children = new ArrayList<TreeNode>();

	public TreeNode(String name) {
		this.name = name;
	}

	/**
	 * 添加子节点
	 * 
	 * @param node
	 */
	public void addChildren(TreeNode node) {
		children.add(node);
	}

	/**
	 * 删除子节点
	 * 
	 * @param node
	 */
	public void removeChildren(TreeNode node) {
		children.remove(node);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	public List<TreeNode> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}

}
