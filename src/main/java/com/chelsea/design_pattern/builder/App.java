package com.chelsea.design_pattern.builder;

import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Sender> listMailSender = Builder.produceMail(1);
		List<Sender> listSmsSender = Builder.produceSms(2);
		for (Sender sender : listMailSender) {
			sender.send();
		}
		for (Sender sender : listSmsSender) {
			sender.send();
		}
	}

}
