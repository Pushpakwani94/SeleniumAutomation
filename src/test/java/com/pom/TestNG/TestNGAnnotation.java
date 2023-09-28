package com.pom.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	//@BeforeSuite
	//@BeforeTest
    //@BeforeClass
	//@BeforeMethod
    //@Test
	//@AfterMethod
    //@AfterClass
    //@AfterTest
    //@AfterSuite
 
	//==========================================================================
	//@DataProvider
	//@Factory
	//@Listeners
	//@Parameters

	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("======================Before Suite=======================");

	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("================Before Test===========================");
	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println("==============Before Class==========================");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("==============Before Method====================");
	}

	@Test
	public void TestClass1() {
		System.out.println("==============Test Class 1================");
	}

	@Test
	public void TestClass2() {
		System.out.println("=============Test Class 2=====================");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("==============After Method=================");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("=============After class================");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("===========Afer Test============");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("===========After Suite==============");
	}

}
