package org.demo;

import org.testng.annotations.Test;

public class Company {

	@Test(groups = {"reg"})
	private void tc31() {
		System.out.println("tc31");
	}
	@Test(groups = {"E2E"})
	private void tc32() {
		System.out.println("tc32");
	}
	@Test(groups = {"smoke"})
	private void tc33() {
		System.out.println("tc33");
	}
	@Test(groups = {"sanity"})
	private void tc34() {
		System.out.println("tc34");
	}
	@Test(groups = {"E2E"})
	private void tc35() {
		System.out.println("tc35");
	}
}
