package com.chelsea.design_pattern.templateMethod;

public class Plus extends AbstractCalculator{

	@Override
	public Integer calculate(Integer value1, Integer value2){
		return value1 + value2;
	}
	
}
