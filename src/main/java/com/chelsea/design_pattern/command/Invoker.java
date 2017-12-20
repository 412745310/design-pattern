package com.chelsea.design_pattern.command;

/**
 * 命令发起者
 * 
 * @author shevchenko
 *
 */
public class Invoker {

	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}

	public void action() {
		command.exe();
	}

}
