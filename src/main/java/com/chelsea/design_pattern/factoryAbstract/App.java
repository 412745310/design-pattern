package com.chelsea.design_pattern.factoryAbstract;

import com.chelsea.design_pattern.factoryAbstract.impl.MailSenderFactory;

public class App {

	public static void main(String[] args) {
		SenderFactory factory = new MailSenderFactory();
		Sender sender = factory.produce();
		sender.send();
	}

}
