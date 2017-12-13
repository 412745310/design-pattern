package com.chelsea.design_pattern.factoryMethod;

public class App {

	public static void main(String[] args) {
		Sender sender1 = SendFactory.produceMail();
		Sender sender2 = SendFactory.produceSms();
		sender1.send();
		sender2.send();
	}

}
