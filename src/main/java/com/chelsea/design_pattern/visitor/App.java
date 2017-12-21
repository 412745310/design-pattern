package com.chelsea.design_pattern.visitor;

import com.chelsea.design_pattern.visitor.impl.MySubject;
import com.chelsea.design_pattern.visitor.impl.MyVisitor;

/**
 * 
 * @author shevchenko
 *
 */
public class App {

	public static void main(String[] args) {
		Visitor visitor = new MyVisitor();
		Subject subject = new MySubject();
		subject.accept(visitor);
	}

}
