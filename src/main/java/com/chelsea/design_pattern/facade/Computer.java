package com.chelsea.design_pattern.facade;

public class Computer {

	private Cpu cpu;
	private Disk disk;
	private Memory memory;

	public Computer() {
		cpu = new Cpu();
		disk = new Disk();
		memory = new Memory();
	}

	public void startup() {
		System.out.println("start the computer!");
		cpu.startup();
		disk.startup();
		memory.startup();
		System.out.println("start computer finished!");
	}

	public void shutdown() {
		System.out.println("begin to close the computer!");
		cpu.shutdown();
		disk.shutdown();
		memory.shutdown();
		System.out.println("computer closed!");
	}

}
