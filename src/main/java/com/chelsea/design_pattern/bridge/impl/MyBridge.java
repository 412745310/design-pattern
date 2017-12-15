package com.chelsea.design_pattern.bridge.impl;

import com.chelsea.design_pattern.bridge.Bridge;

public class MyBridge extends Bridge {
	
	public void method(){
		getSourceable().method();
	}

}
