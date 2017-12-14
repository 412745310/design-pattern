package com.chelsea.design_pattern.proxy;

import com.chelsea.design_pattern.proxy.impl.Proxy;

/**
 * 代理模式测试类
 * 
 * @author shevchenko
 *
 */
public class App {

	public static void main(String[] args) {
		Sourceable source = new Proxy();
		source.method();
	}

}
