package com.chelsea.design_pattern.visitor.impl;

import com.chelsea.design_pattern.visitor.Subject;
import com.chelsea.design_pattern.visitor.Visitor;

public class MyVisitor implements Visitor {

	@Override
	public void visit(Subject subject) {
		System.out.println("visit the subject：" + subject.getSubject());
	}

}
