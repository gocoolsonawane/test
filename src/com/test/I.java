package com.test;

public interface I {

	public void m1();

	public default void cal() {
		System.out.println("Interface I cal method");
	}

}
