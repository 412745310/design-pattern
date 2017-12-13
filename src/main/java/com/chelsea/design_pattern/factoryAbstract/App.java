package com.chelsea.design_pattern.factoryAbstract;

import com.chelsea.design_pattern.factoryAbstract.impl.MailSenderFactory;

/**
 * 抽象工厂测试类
 * 
 * @author shevchenko
 *
 */
public class App {

	public static void main(String[] args) {
		SenderFactory factory = new MailSenderFactory();
		Sender sender = factory.produce();
		sender.send();
	}

}
