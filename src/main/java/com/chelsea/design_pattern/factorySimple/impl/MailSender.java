package com.chelsea.design_pattern.factorySimple.impl;

import com.chelsea.design_pattern.factorySimple.Sender;

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
