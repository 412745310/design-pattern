package com.chelsea.design_pattern.strategy.impl;

import com.chelsea.design_pattern.strategy.ICalculator;

public class Multiply implements ICalculator {

	@Override
	public int calculate(Integer val1, Integer val2) {
		return val1 * val2;
	}

}
