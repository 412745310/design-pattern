package com.chelsea.design_pattern.templateMethod;

/**
 * 模板方法模式测试类
 * 
 * @author shevchenko
 *
 */
public class App {

	public static void main(String[] args) {
		AbstractCalculator calculator = new Plus();
		calculator.calculate("1+2", "\\+");
	}

}
