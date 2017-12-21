package com.chelsea.design_pattern.interpreter.impl;

import com.chelsea.design_pattern.interpreter.Context;
import com.chelsea.design_pattern.interpreter.Expression;

public class Plus implements Expression {

	@Override
	public int interpret(Context context) {
		return context.getNum1() + context.getNum2();
	}

}
