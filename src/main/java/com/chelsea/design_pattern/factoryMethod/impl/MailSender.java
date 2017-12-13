package com.chelsea.design_pattern.factoryMethod.impl;

import com.chelsea.design_pattern.factoryMethod.Sender;

/**
 * 具体产品类
 * 
 * @author shevchenko
 *
 */
public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("send mail message");
	}

}
