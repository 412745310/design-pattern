package com.chelsea.design_pattern.interpreter;

import com.chelsea.design_pattern.interpreter.impl.Minus;
import com.chelsea.design_pattern.interpreter.impl.Plus;

/**
 * 解释器模式测试类
 * 
 * @author shevchenko
 *
 */
public class App {

	public static void main(String[] args) {
		Context context = new Context();
		context.setNum1(10);
		context.setNum2(18);
		Expression expression1 = new Plus();
		Expression expression2 = new Minus();
		int plus = expression1.interpret(context);
		int minus = expression2.interpret(context);
		System.out.println(plus);
		System.out.println(minus);
	}

}
