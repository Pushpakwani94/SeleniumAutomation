package com.pom.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	//How To Use DataProvider In TestNG?
	//Inherited DataProvider In TestNG
	//How To Pass Multiple Parameters In TestNG DataProviders?
	//DataProviders With Method As A Parameter
	
	
	
	@DataProvider (name = "dpName")
	public Object[][] dpMethod() {
	    return new Object [][] {{"pushpak@accelerationco.com","Pushpak"},{"Bhushan@accelerationco.com","Bhushan"}};
	}

	@Test (dataProvider = "dpName")
    public void myTest (String val,String name) {
        System.out.println("Passed Parameter Is : " + val   + " " + name);
    }
	
	@Test (dataProvider = "dpName1",dataProviderClass = DataProviderClass.class)
    public void outClass(String val,String name) {
        System.out.println("Passed Parameter Is : " + val   + " " + name);
    }
	  
}
