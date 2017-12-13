package com.chelsea.design_pattern.adapterObject;

/**
 * 对象适配器模式测试类
 * 
 * @author shevchenko
 *
 */
public class App {

	public static void main(String[] args) {
		Source source = new Source();
		Targetable targetable = new Adapter(source);
		targetable.method1();
		targetable.method2();
	}

}
