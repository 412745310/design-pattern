package com.chelsea.design_pattern.observer.impl;

import com.chelsea.design_pattern.observer.Observer;

public class Observer2 implements Observer {

	@Override
	public void update() {
		System.out.println("observer2 has received!");
	}

}
