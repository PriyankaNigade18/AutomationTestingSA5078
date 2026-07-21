package com.SwagLab.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLab.Pages.BaseTest;

public class CheckoutPageTest extends BaseTest
{
	
	@BeforeClass
	public void pageSetUp()
	{	inventoryPage=loginPage.doLogin(prop.getValue("swagUserName"),prop.getValue("swagPassword"));
		inventoryPage.addProductToCart(prop.getValue("product1"));
		cartPage=inventoryPage.launchCartPage();
		checkoutPage=cartPage.launchCheckoutPage();
	}
	
	
  @Test
  public void doCheckoutProcess() 
  {
	  checkoutPage.doCheckout(prop.getValue("fn"),prop.getValue("ln"),prop.getValue("pc"));
	  Assert.assertTrue(loginPage.getPageUrl().contains("checkout-step-two"));
	  System.out.println("Checkout process completed!Now process with step2");
	  
  }
}
