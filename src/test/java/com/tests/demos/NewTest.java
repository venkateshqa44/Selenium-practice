package com.tests.demos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	@Test
	public void testmethod1() {

		System.out.println("TestMethod1");
	}
	
	@Test
	public void testmethod2() {

		System.out.println("TestMethod2");
	}
	
	
	
	
	@BeforeMethod
	public void Testmethod2() {
		System.out.println("BeforMethod");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");

	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Beforesuite");

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Aftersuite");

	}

}
