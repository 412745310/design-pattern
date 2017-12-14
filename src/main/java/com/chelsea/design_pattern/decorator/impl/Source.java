package com.chelsea.design_pattern.decorator.impl;

import com.chelsea.design_pattern.decorator.Sourceable;

/**
 * 被装饰类
 * 
 * @author shevchenko
 *
 */
public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("do Source method");
	}

}
