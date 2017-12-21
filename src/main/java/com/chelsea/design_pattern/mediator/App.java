package com.chelsea.design_pattern.mediator;

import com.chelsea.design_pattern.mediator.impl.ColleagueA;
import com.chelsea.design_pattern.mediator.impl.ColleagueB;
import com.chelsea.design_pattern.mediator.impl.Mediator;

/**
 * 中介者模式测试类
 * 
 * @author shevchenko
 *
 */
public class App {

	public static void main(String[] args) {
		AbstractColleague colleagueA = new ColleagueA();
		AbstractColleague colleagueB = new ColleagueB();
		AbstractMediator mediator = new Mediator(colleagueA, colleagueB);
		colleagueA.setNumber(100, mediator);
		System.out.println("colleagueA : " + colleagueA.getNumber());
		System.out.println("colleagueB : " + colleagueB.getNumber());
		colleagueB.setNumber(200, mediator);
		System.out.println("colleagueA : " + colleagueA.getNumber());
		System.out.println("colleagueB : " + colleagueB.getNumber());
	}

}
