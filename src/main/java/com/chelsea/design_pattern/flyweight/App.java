package com.chelsea.design_pattern.flyweight;

import java.sql.Connection;

/**
 * 享元模式测试类
 * 
 * @author shevchenko
 *
 */
public class App {

	public static void main(String[] args) {
		ConnectionPool pool = new ConnectionPool();
		for(int i = 0 ; i < 12 ; i++){
			Connection conn = pool.getConnection();
			System.out.println(conn);
		}
		System.out.println("\n\n");
		for(int i = 0 ; i < 5 ; i++){
			pool.release();
		}
		for(int i = 0 ; i < 12 ; i++){
			Connection conn = pool.getConnection();
			System.out.println(conn);
		}
	}
}
