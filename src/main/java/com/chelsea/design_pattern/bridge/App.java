package com.chelsea.design_pattern.bridge;

import com.chelsea.design_pattern.bridge.impl.MyBridge;
import com.chelsea.design_pattern.bridge.impl.SourceSubOne;
import com.chelsea.design_pattern.bridge.impl.SourceSubTwo;

/**
 * 桥接模式测试类
 * 
 * @author shevchenko
 *
 */
public class App {

	public static void main(String[] args) {
		Bridge bridge = new MyBridge();
		
		Sourceable sourceableOne = new SourceSubOne();
		bridge.setSourceable(sourceableOne);
		bridge.method();
		
		Sourceable sourceableTwo = new SourceSubTwo();
		bridge.setSourceable(sourceableTwo);
		bridge.method();
	}

}
