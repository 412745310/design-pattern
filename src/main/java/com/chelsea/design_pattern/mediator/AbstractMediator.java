package com.chelsea.design_pattern.mediator;

/**
 * 中介者
 * 
 * @author shevchenko
 *
 */
public abstract class AbstractMediator {

	protected AbstractColleague colleagueA;
	protected AbstractColleague colleagueB;

	public AbstractMediator(AbstractColleague a, AbstractColleague b) {
		colleagueA = a;
		colleagueB = b;
	}

	public abstract void AaffectB();

	public abstract void BaffectA();

}
