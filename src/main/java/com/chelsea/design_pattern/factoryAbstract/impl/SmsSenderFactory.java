package com.chelsea.design_pattern.factoryAbstract.impl;

import com.chelsea.design_pattern.factoryAbstract.Sender;
import com.chelsea.design_pattern.factoryAbstract.SenderFactory;

/**
 * 具体工厂类
 * 
 * @author shevchenko
 *
 */
public class SmsSenderFactory implements SenderFactory {

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
