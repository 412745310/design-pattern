package com.chelsea.design_pattern.iterator;

import com.chelsea.design_pattern.iterator.impl.MyCollection;

/**
 * 迭代器模式测试类
 * 
 * @author shevchenko
 *
 */
public class App {

	public static void main(String[] args) {
		String[] str = {"A", "B", "C", "D", "E"};
		Collection collection = new MyCollection(str);
		Iterator it = collection.iterator();
		while (it.hasNext()) {
			Object object = it.next();
			System.out.println(String.valueOf(object));
		}
	}

}
