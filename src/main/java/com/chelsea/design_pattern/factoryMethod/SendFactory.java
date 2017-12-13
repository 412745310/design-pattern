package com.chelsea.design_pattern.factoryMethod;

import com.chelsea.design_pattern.factoryMethod.impl.MailSender;
import com.chelsea.design_pattern.factoryMethod.impl.SmsSender;

/**
 * 具体工厂类
 * 
 * @author shevchenko
 *
 */
public class SendFactory {

	public static Sender produceMail() {
		return new MailSender();
	}

	public static Sender produceSms() {
		return new SmsSender();
	}

}
