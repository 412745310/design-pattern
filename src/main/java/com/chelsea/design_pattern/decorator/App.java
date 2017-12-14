package com.chelsea.design_pattern.decorator;

import com.chelsea.design_pattern.decorator.impl.Decorator;
import com.chelsea.design_pattern.decorator.impl.Source;

/**
 * 装饰模式测试类
 * 
 * @author shevchenko
 *
 */
public class App {

	public static void main(String[] args) {
		Sourceable source = new Source();
		Sourceable decorator = new Decorator(source);
		decorator.method();
	}

}
