package com.SwagLab.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLab.Pages.BaseTest;

public class OverviewPageTest  extends BaseTest
{
	

	@BeforeClass
	public void pageSetUp()
	{	inventoryPage=loginPage.doLogin(prop.getValue("swagUserName"),prop.getValue("swagPassword"));
		inventoryPage.addProductToCart(prop.getValue("product1"));
		cartPage=inventoryPage.launchCartPage();
		checkoutPage=cartPage.launchCheckoutPage();
		overviewPage=checkoutPage.doCheckout(prop.getValue("fn"),prop.getValue("ln"),prop.getValue("pc"));
	}
	
	
	@Test(priority=1)
	public void getPaymentSummaryDetails()
	{
		overviewPage.getPaymentDetails();
	}
	
  @Test(priority=1)
  public void testCheckoutProcess() 
  {
	 String message= overviewPage.completeCheckoutProcess();
	 Assert.assertEquals(message,"Thank you for your order!");
	 System.out.println(message);
  }
}
