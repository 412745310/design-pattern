package com.chelsea.design_pattern.iterator.impl;

import com.chelsea.design_pattern.iterator.Collection;
import com.chelsea.design_pattern.iterator.Iterator;

public class MyCollection implements Collection{
	
	private Object[] arr;
	
	public MyCollection(Object[] arr){
		this.arr = arr;
	}

	@Override
	public Iterator iterator() {
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		return arr[i];
	}

	@Override
	public int size() {
		return arr.length;
	}

	
	
}
