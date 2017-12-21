package com.chelsea.design_pattern.visitor.impl;

import com.chelsea.design_pattern.visitor.Subject;
import com.chelsea.design_pattern.visitor.Visitor;

public class MySubject implements Subject {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String getSubject() {
		return "love";
	}

}
