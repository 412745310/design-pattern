package com.chelsea.design_pattern.memento;

/**
 * 备忘录模式测试类
 * 
 * @author shevchenko
 *
 */
public class App {

	public static void main(String[] args) {
		Original original = new Original("value1");
		System.out.println("备份前value值:" + original.getValue());
		Memento memento = original.createMemento();
		Storage storage = new Storage(memento);
		System.out.println("进行属性备份");
		System.out.println("修改属性");
		original.setValue("value2");
		System.out.println("修改后value值:" + original.getValue());
		System.out.println("进行属性还原");
		original.restoreMemento(storage.getMemento());
		System.out.println("还原后value值:" + original.getValue());
	}

}
