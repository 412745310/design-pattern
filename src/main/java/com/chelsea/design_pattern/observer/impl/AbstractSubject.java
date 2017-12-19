package com.chelsea.design_pattern.observer.impl;

import java.util.ArrayList;
import java.util.List;

import com.chelsea.design_pattern.observer.Observer;
import com.chelsea.design_pattern.observer.Subject;

public abstract class AbstractSubject implements Subject {

	private List<Observer> list = new ArrayList<Observer>();

	@Override
	public void add(Observer observer) {
		list.add(observer);
	}

	@Override
	public void del(Observer observer) {
		list.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : list){
			observer.update();
		}
	}

}
