package com.chelsea.design_pattern.templateMethod;

public abstract class AbstractCalculator {

	public void calculate(String exp, String opt) {
		String[] arr = exp.split(opt);
		Integer value1 = Integer.valueOf(arr[0]);
		Integer value2 = Integer.valueOf(arr[1]);
		Integer result = this.calculate(value1, value2);
		System.out.println(result);
	}

	abstract Integer calculate(Integer value1, Integer value2);

}
