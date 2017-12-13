package com.chelsea.design_pattern.adapterInterface;

/**
 * 接口适配器测试类
 * 
 * @author shevchenko
 *
 */
public class App {

	public static void main(String[] args) {
		Targetable targetable = new Source();
		targetable.method1();
		targetable.method2();
		targetable.method3();
	}

}
