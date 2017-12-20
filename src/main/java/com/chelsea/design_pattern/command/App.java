package com.chelsea.design_pattern.command;

/**
 * 命令模式测试类
 * 
 * @author shevchenko
 *
 */
public class App {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command command = new MyCommand(receiver);
		Invoker invoker = new Invoker(command);
		invoker.action();
	}

}
