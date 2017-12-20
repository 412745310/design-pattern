package com.chelsea.design_pattern.command;

/**
 * 命令接口实现类
 * 
 * @author shevchenko
 *
 */
public class MyCommand implements Command {

	private Receiver receiver;

	public MyCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void exe() {
		receiver.action();
	}

}
