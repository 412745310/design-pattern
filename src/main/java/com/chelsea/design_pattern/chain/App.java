package com.chelsea.design_pattern.chain;

import com.chelsea.design_pattern.chain.impl.MyHandler;

/**
 * 责任链模式测试类
 * 
 * @author shevchenko
 *
 */
public class App {

	public static void main(String[] args) {
		MyHandler handler1 = new MyHandler("handler1");
		MyHandler handler2 = new MyHandler("handler2");
		MyHandler handler3 = new MyHandler("handler3");
		handler1.setHandler(handler2);
		handler2.setHandler(handler3);
		handler1.operator();
	}

}
