package com.chelsea.design_pattern.prototype;

import java.io.IOException;

/**
 * 原型模式测试类
 * 
 * @author shevchenko
 *
 */
public class App {

	public static void main(String[] args) throws CloneNotSupportedException,
			ClassNotFoundException, IOException {
		People p1 = new People();
		p1.setId("1");
		p1.setName("p1");
		Address address = new Address();
		address.setName("address1");
		p1.setAddress(address);

		// People p2 = (People)p1.clone();
		People p2 = (People) p1.deepClone();
		p2.setId("2");
		p2.setName("p2");
		p2.getAddress().setName("address2");

		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getAddress().getName());
	}

}
