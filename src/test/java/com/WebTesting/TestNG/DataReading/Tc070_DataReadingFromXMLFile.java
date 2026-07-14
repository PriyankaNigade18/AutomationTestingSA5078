package com.WebTesting.TestNG.DataReading;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Tc070_DataReadingFromXMLFile
{
 @Parameters({"un","psw"})
  @Test
  public void testLogin(String usern,String password)
  {
	  
	  System.out.println("UserName is: "+usern);
	  System.out.println("Password is: "+password);
	  
	  
  }
}
