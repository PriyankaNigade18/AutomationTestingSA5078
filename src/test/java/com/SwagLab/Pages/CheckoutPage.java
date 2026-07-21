package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SwagLab.Utilities.ElementUtil;

public class CheckoutPage 
{

	private WebDriver driver;
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//locator
	@FindBy(id="first-name")
	private WebElement fname;
	
	@FindBy(id="last-name")
	private WebElement lname;
	
	@FindBy(id="postal-code")
	private WebElement postalCode;
	
	@FindBy(id="continue")
	private WebElement checkoutContinueBtn;
	
	
	
	public OverviewPage doCheckout(String fn,String ln,String pc)
	{	
		fname.sendKeys(fn);
		lname.sendKeys(ln);
		postalCode.sendKeys(pc);
		ElementUtil.getScreenshot(driver,"checkoutPageDetails");
		
		System.out.println("Checkout process in Progess for user: "+fn);
		checkoutContinueBtn.click();
		return new OverviewPage(driver);
		
	}
	
	
	
	
	
	
	
	
	
}
