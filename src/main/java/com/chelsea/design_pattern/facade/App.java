package com.chelsea.design_pattern.facade;

/**
 * 观察者模式测试类
 * 
 * @author shevchenko
 *
 */
public class App {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}

}
