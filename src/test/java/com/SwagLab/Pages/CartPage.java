package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SwagLab.Utilities.ElementUtil;

public class CartPage 
{
	private WebDriver driver;
	
	public CartPage(WebDriver driver)//driver from baseclass
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//locator
	@FindBy(css="div.inventory_item_name")
	private List<WebElement> productDetails;
	
	@FindBy(xpath="//button[text()='Remove']")
	private WebElement removeBtn;
	
	@FindBy(id="continue-shopping")
	private WebElement continueShoppingBtn;
	
	@FindBy(id="checkout")
	private WebElement checkoutBtn;
	
	
	
	
	
	
	public int getCartProductDetails()
	{
		ElementUtil.getScreenshot(driver,"cartPage");
		int count=productDetails.size();
		for(WebElement i:productDetails)
		{
			System.out.println(i.getText());
		}
		
		return count;
	}
	
	
	public CartPage removeProduct()
	{
		removeBtn.click();
		ElementUtil.getScreenshot(driver,"cartPageProductRemove");
		return this;
	}
	
	
	public InventoryPage doContinueShopping()
	{
		continueShoppingBtn.click();
		return new InventoryPage(driver);
		
	}
	
	
	public CheckoutPage launchCheckoutPage()
	{
		checkoutBtn.click();
		ElementUtil.getScreenshot(driver,"checkoutPage");
		//next page object
		return new CheckoutPage(driver);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
