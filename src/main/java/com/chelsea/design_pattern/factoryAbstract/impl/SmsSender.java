package com.chelsea.design_pattern.factoryAbstract.impl;

import com.chelsea.design_pattern.factoryAbstract.Sender;

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
