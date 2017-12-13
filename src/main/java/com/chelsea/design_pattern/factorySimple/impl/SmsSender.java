package com.chelsea.design_pattern.factorySimple.impl;

import com.chelsea.design_pattern.factorySimple.Sender;

/**
 * 具体产品类
 * 
 * @author shevchenko
 *
 */
public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("send sms message");
	}

}
