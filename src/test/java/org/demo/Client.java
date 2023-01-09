package org.demo;

import org.testng.annotations.Test;

public class Client {
	@Test(groups = {"reg"})
	private void tc21() {
		System.out.println("tc21");
	}
	@Test(groups = {"sanity"})
	private void tc22() {
		System.out.println("tc22");
	}
	@Test(groups = {"smoke"})
	private void tc23() {
		System.out.println("tc23");
		//System.out.println(4/0);
	}
	@Test(groups = {"reg"})
	private void tc24() {
		System.out.println("tc24");
	}
	@Test(groups = {"E2E"})
	private void tc25() {
		System.out.println("tc25");
	}
}
