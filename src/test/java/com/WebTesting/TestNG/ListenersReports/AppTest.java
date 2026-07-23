package com.WebTesting.TestNG.ListenersReports;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(com.WebTesting.TestNG.ListenersReports.MyListeners.class)

public class AppTest 
{
  @Test(priority=1)
  public void appRegistartion() {
	  System.out.println("User will register");
	  AssertJUnit.assertEquals(true,true);
  }
  
  
  @Test(priority=2)
  public void appLogin() {
	  System.out.println("User will login");
	  AssertJUnit.assertEquals(true,false);
  }
}
