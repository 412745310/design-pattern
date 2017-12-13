package com.chelsea.design_pattern.factoryMethod;

/**
 * 工厂方法测试类
 * 
 * @author shevchenko
 *
 */
public class App {

	public static void main(String[] args) {
		Sender sender1 = SendFactory.produceMail();
		Sender sender2 = SendFactory.produceSms();
		sender1.send();
		sender2.send();
	}

}
