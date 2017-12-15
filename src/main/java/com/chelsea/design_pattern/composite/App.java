package com.chelsea.design_pattern.composite;

/**
 * 组合模式测试类
 * 
 * @author shevchenko
 *
 */
public class App {

	public static void main(String[] args) {
		TreeNode nodeA = new TreeNode("nodeA");
		TreeNode nodeB = new TreeNode("nodeB");
		nodeA.getChildren().add(nodeB);
		Tree tree = new Tree("myRoot");
		tree.getRoot().addChildren(nodeA);

		System.out.println(tree.getRoot().getChildren().get(0).getName());
		System.out.println(tree.getRoot().getChildren().get(0).getChildren()
				.get(0).getName());
	}

}
