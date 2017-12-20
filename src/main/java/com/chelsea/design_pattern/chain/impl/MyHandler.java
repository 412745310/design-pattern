package com.chelsea.design_pattern.chain.impl;

import com.chelsea.design_pattern.chain.AbstractHandler;
import com.chelsea.design_pattern.chain.Handler;

public class MyHandler extends AbstractHandler implements Handler{

	private String name;
	
	public MyHandler(String name){
		this.name = name;
	}
	
	@Override
	public void operator() {
		System.out.println(name + " do something");
		if(getHandler() != null){
			getHandler().operator();
		}
	}

}
