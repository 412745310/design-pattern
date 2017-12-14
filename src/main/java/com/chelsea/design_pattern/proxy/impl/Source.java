package com.chelsea.design_pattern.proxy.impl;

import com.chelsea.design_pattern.proxy.Sourceable;

/**
 * 被代理类
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
