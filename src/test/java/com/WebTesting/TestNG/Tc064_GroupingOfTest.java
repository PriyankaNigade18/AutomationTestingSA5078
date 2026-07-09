package com.WebTesting.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Tc064_GroupingOfTest {

	@Test(priority=1,groups = "SmokeTest")
	  public void register()
	  {
		  System.out.println("user register");
	  }
	  
	  @Test(priority=2,groups = "SmokeTest")
	  public void login()
	  {
		  System.out.println("user login");
	  }
	  
	 
	  @Test(priority=3,groups = "RegressionTest")
	  public void search()
	  {
		  System.out.println("user search product");
	  }
	  
	  
	  @Test(priority=4,groups = {"RegressionTest","FunctionalTest"})
	  public void addToCart()
	  {
		  System.out.println("user add to cart()");
	  }
	  
	  @Test(priority=5,groups = "RegressionTest")
	  public void logout()
	  {
		  System.out.println("user logout");
	  }
	  
	  @Test(priority=6)
	  public void verifyTitle()
	  {
		  System.out.println("VerifyTitle");
	  }
}
