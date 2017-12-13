package com.chelsea.design_pattern.adapterInterface;

public abstract class Adapter implements Targetable{
	
	public void method1(){
		System.out.println("do Adapter method1");
	}
	
	public void method2(){
		System.out.println("do Adapter method2");
	}
	
	public abstract void method3();

}
