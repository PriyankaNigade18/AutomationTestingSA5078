package com.SwagLab.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLab.Pages.BaseTest;

public class CartPageTest extends BaseTest
{
	
	@BeforeClass
	public void pageSetup()
	{
		inventoryPage=loginPage.doLogin(prop.getValue("swagUserName"),prop.getValue("swagPassword"));
		inventoryPage.addProductToCart(prop.getValue("product1"));
		cartPage=inventoryPage.launchCartPage();
	}
	
	
	
	
  @Test(priority=1)
  public void testForCartProductDetails()
  {
	  int count=cartPage.getCartProductDetails();
	  Assert.assertEquals(count,1);
	  System.out.println("Total Products into Cart: "+count);
	  
  }
  
  @Test(priority=2)
  public void testForCartRemoveButton()
  {
	  cartPage.removeProduct();
  }
  
  
  @Test(priority=3)
  public void testForCartContinueShopping()
  {
	  inventoryPage=cartPage.doContinueShopping();
	  inventoryPage.addProductToCart(prop.getValue("product2"));
	 cartPage=inventoryPage.launchCartPage();
  }
  
  @Test(priority=4)
  public void testForCheckoutPageLaunch()
  {
	  cartPage.launchCheckoutPage();
  }
}
