package com.SwagLab.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SwagLab.Pages.BaseTest;

public class InventoryPageTest extends BaseTest
{
	@BeforeClass
	public void pageSetup()
	{
		 loginPage.doLogin(prop.getValue("swagUserName"),prop.getValue("swagPassword"));
	}
	
	
  @Test(priority=1)
  public void verifyProductCount()
  {
	  int count=inventoryPage.getProductsCount();
	  AssertJUnit.assertEquals(count,6);
	  System.out.println("Product count mathced, total products are: "+count);
  }
  
  @Test(priority=2)
  public void verifyProductDetails() 
  {
	  inventoryPage.getProductDetails();
  }
  
  
  @Test(priority=3)
  public void validateAddProductToCart() 
  {
	  String pname=inventoryPage.addProductToCart(prop.getValue("product1"));
	  AssertJUnit.assertEquals(pname,"Sauce Labs Fleece Jacket");
	 
	  
	  
  }
}
