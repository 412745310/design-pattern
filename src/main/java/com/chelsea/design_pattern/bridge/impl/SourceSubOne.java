package com.chelsea.design_pattern.bridge.impl;

import com.chelsea.design_pattern.bridge.Sourceable;

public class SourceSubOne implements Sourceable {

	@Override
	public void method() {
		System.out.println("do SourceSubOne method");
	}

}
