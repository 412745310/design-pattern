package com.chelsea.design_pattern.strategy;

import com.chelsea.design_pattern.strategy.impl.Multiply;

/**
 * 策略模式测试类
 * 
 * @author shevchenko
 *
 */
public class App {

	public static void main(String[] args) {
		ICalculator calculator = new Multiply();
		System.out.println(calculator.calculate(2, 3));
	}

}
