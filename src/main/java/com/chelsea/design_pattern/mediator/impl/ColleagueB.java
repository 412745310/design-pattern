package com.chelsea.design_pattern.mediator.impl;

import com.chelsea.design_pattern.mediator.AbstractColleague;
import com.chelsea.design_pattern.mediator.AbstractMediator;

public class ColleagueB extends AbstractColleague {

	@Override
	public void setNumber(int number, AbstractMediator am) {
		this.number = number;
		am.BaffectA();
	}

}
