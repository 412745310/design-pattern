package com.chelsea.design_pattern.factoryAbstract.impl;

import com.chelsea.design_pattern.factoryAbstract.SenderFactory;
import com.chelsea.design_pattern.factoryAbstract.Sender;

/**
 * 具体工厂类
 * 
 * @author shevchenko
 *
 */
public class MailSenderFactory implements SenderFactory {

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
