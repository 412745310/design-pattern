package com.chelsea.design_pattern.singleton;

/**
 * 单例模式
 * 
 * @author shevchenko
 *
 */
public class Singleton {

	private static class SingletonFactory {
		private static Singleton instance = new Singleton();
	}

	private Singleton() {
	}

	public static Singleton getInstance() {
		return SingletonFactory.instance;
	}

	public void doSomething() {
		System.out.println("this is a Singleton");
	}

}
