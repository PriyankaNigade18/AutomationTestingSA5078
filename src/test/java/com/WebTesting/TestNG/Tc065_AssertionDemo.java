package com.WebTesting.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Tc065_AssertionDemo 
{
  @Test(priority=1)
  public void testHardAssertion()
  {
	  String act="Selenium WebDriver is WebUi automation library";
	  String exp="Selenium WebDriver is WebUi automation library/tool";
	  
	  /*
	   * When assertion fail you will get AssertionError:message
	   */
	  //Assert.assertEquals(act,exp,"Test Fail: Strings are not equals");
	  
	  //assertTrue() expect true condition
	  /*Assert.assertTrue(act.equals(exp),"Test Fail: Strings are not equals");
	  System.out.println("Test Pass: Strings are equals");
	  
	  System.out.println("done!");*/
	  
	  
	  /*
	   * Assert.assertFalse(false)===>pass result
	   * -v scenario: Act string should not contains TestNG text
	   */
	  
	  Assert.assertFalse(act.contains("TestNG"),"Test Fail: As actual string contains TestNG");
	  System.out.println("Test Pass: As Actual string does not contains TestNG");
	  
	  
  }
    
  @Test(priority=2)
  public void testSoftAssertion() 
  {
	  
	  int num1=200,num2=200;
	  
	  SoftAssert sf=new SoftAssert();
//	  sf.assertEquals(num1,num2,"Test Fail: Numbers are not equals");//AssertionError
//	  System.out.println("Test Pass: Numbers are equals");
	  
	  sf.assertTrue(num1==num2);
	  System.out.println("Test Pass: Numbers are equals");
	  System.out.println("done!");
	  
	  sf.assertAll();
	  
	  
  }
}
