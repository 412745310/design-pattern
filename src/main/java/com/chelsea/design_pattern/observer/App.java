package com.chelsea.design_pattern.observer;

import com.chelsea.design_pattern.observer.impl.MySubject;
import com.chelsea.design_pattern.observer.impl.Observer1;
import com.chelsea.design_pattern.observer.impl.Observer2;

/**
 * 观察者模式测试类
 * 
 * @author shevchenko
 *
 */
public class App {

	public static void main(String[] args) {
		Subject subject = new MySubject();
		subject.add(new Observer1());
		subject.add(new Observer2());
		subject.operation();
	}

}
