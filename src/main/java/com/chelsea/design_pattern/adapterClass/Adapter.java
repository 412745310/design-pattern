package com.chelsea.design_pattern.adapterClass;

public class Adapter extends Source implements Targetable{

	@Override
	public void method2() {
		System.out.println("do Adapter method2");
	}

}
