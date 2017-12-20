package com.chelsea.design_pattern.state;

/**
 * 状态模式测试类
 * 
 * @author shevchenko
 *
 */
public class App {

	public static void main(String[] args) {
		State state1 = new State("state1");
		Context context = new Context(state1);
		context.method();
		State state2 = new State("state2");
		context.setState(state2);
		context.method();
	}

}
