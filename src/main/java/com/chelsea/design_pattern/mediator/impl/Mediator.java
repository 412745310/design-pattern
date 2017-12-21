package com.chelsea.design_pattern.mediator.impl;

import com.chelsea.design_pattern.mediator.AbstractColleague;
import com.chelsea.design_pattern.mediator.AbstractMediator;

public class Mediator extends AbstractMediator {

	public Mediator(AbstractColleague a, AbstractColleague b) {
		super(a, b);
	}

	@Override
	public void AaffectB() {
		int number = colleagueA.getNumber();
		colleagueB.setNumber(number * 100);
	}

	@Override
	public void BaffectA() {
		int number = colleagueB.getNumber();
		colleagueA.setNumber(number / 100);
	}

}
