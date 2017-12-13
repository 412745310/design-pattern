package com.chelsea.design_pattern.adapterClass;

/**
 * 类适配器模式测试类
 * 
 * @author shevchenko
 *
 */
public class App {

	public static void main(String[] args) {
		Targetable targetable = new Adapter();
		targetable.method1();
		targetable.method2();
	}

}
