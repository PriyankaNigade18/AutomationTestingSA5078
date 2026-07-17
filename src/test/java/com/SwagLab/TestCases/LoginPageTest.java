package com.SwagLab.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SwagLab.Pages.BaseTest;

public class LoginPageTest extends BaseTest
{
  @Test(priority=1)
  public void verifyUrl() 
  {
	  String appUrl=loginPage.getPageUrl();
	  AssertJUnit.assertTrue(appUrl.contains("saucedemo"));
	  System.out.println("Url matched: "+appUrl);
  }
  
  
  @Test(priority=2)
  public void verifyTitle() 
  {
	  String appTitle=loginPage.getPageTitle();
	  AssertJUnit.assertEquals(appTitle,"Swag Labs");
	  System.out.println("Title matched: "+appTitle);
  }
  
  
  @Test(priority=3)
  public void validateLogin() 
  {
	  loginPage.doLogin("standard_user","secret_sauce");
	  //assert next page url
	  AssertJUnit.assertTrue(loginPage.getPageUrl().contains("inventory"));
	  System.out.println("Login completed...User Navigated to InventoryPage");
  }
}
