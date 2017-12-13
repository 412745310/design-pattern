package com.chelsea.design_pattern.adapterObject;

public class Adapter implements Targetable{

	private Source source;

	public Adapter(Source source) {
		this.source = source;
	}

	public void method2() {
		System.out.println("do Adapter method2");
	}

	@Override
	public void method1() {
		source.method1();
	}

}
