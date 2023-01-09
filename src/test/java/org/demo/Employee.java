package org.demo;

import org.testng.annotations.Test;

public class Employee {
	
	@Test(priority=-2)
	private void tc12() {
		System.out.println("tc12");
	}
	@Test(priority=1)
	private void tc14() {
		System.out.println("tc14");
	}
	@Test(priority=-3)
	private void tc11() {
		System.out.println("tc11");
	}
	@Test(priority=1)
	private void tc13() {
		System.out.println("tc13");
	}
	@Test(invocationCount=3)
	private void tc15() {
		System.out.println("tc15");
	}
}
