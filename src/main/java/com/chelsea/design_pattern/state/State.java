package com.chelsea.design_pattern.state;

/**
 * 状态类
 * 
 * @author shevchenko
 *
 */
public class State {

	private String value;

	public State(String value) {
		this.value = value;
	}

	public void method1() {
		System.out.println("do method1");
	}

	public void method2() {
		System.out.println("do method2");
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
