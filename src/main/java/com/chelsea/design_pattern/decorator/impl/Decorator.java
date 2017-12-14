package com.chelsea.design_pattern.decorator.impl;

import com.chelsea.design_pattern.decorator.Sourceable;

/**
 * 装饰类
 * 
 * @author shevchenko
 *
 */
public class Decorator implements Sourceable{

	private Sourceable source;

	public Decorator(Sourceable source){
		this.source = source;
	}
	
	@Override
	public void method() {
		System.out.println("before decorator");
		source.method();
		System.out.println("after decorator");
	}

}
