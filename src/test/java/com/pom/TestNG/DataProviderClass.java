package com.pom.TestNG;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider (name = "dpName1")
	public Object[][] dpMethod() {
	    return new Object [][] {{"admin@accelerationco.com","admin"}};
	}


}
