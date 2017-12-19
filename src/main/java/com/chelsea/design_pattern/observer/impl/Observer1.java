package com.chelsea.design_pattern.observer.impl;

import com.chelsea.design_pattern.observer.Observer;

public class Observer1 implements Observer {

	@Override
	public void update() {
		System.out.println("observer1 has received!");
	}

}
