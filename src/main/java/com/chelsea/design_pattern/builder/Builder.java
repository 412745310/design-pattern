package com.chelsea.design_pattern.builder;

import java.util.ArrayList;
import java.util.List;

import com.chelsea.design_pattern.builder.impl.MailSender;
import com.chelsea.design_pattern.builder.impl.SmsSender;

/**
 * 建造者模式
 * 
 * @author shevchenko
 *
 */
public class Builder {

	public static List<Sender> produceMail(int count) {
		List<Sender> list = new ArrayList<Sender>();
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
		return list;
	}

	public static List<Sender> produceSms(int count) {
		List<Sender> list = new ArrayList<Sender>();
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
		return list;
	}

}
