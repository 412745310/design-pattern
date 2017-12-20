package com.chelsea.design_pattern.memento;

/**
 * 原始类
 * 
 * @author shevchenko
 *
 */
public class Original {

	private String value;

	public Original(String value) {
		this.value = value;
	}

	/**
	 * 创建备份
	 * 
	 * @return
	 */
	public Memento createMemento() {
		return new Memento(value);
	}

	/**
	 * 还原备份
	 * 
	 * @param memento
	 */
	public void restoreMemento(Memento memento) {
		this.value = memento.getValue();
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
