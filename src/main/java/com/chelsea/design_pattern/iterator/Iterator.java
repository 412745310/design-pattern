package com.chelsea.design_pattern.iterator;

public interface Iterator {
	
	public Object previous();
	
	public Object next();
	
	public boolean hasNext();
	
	public Object first();

}
