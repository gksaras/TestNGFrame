package org.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {

	@AfterClass
	private void afterClass() {
		System.out.println("after class");
	}
	@BeforeClass
	private void beforeClass() {
		System.out.println("before class");
	}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("before method");
	}
	@AfterMethod
	private void afterMethod() {
		System.out.println("after method");
	}
	@Test
	private void test() {
		System.out.println("test");
	}
}
