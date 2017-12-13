package com.chelsea.design_pattern.factorySimple;

/**
 * 简单工厂测试类
 * 
 * @author shevchenko
 *
 */
public class App {

	public static void main(String[] args) {
		Sender sender1 = SendFactory.produce("mail");
		Sender sender2 = SendFactory.produce("sms");
		sender1.send();
		sender2.send();
	}

}
