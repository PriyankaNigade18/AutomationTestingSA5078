package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Encapsulation=private data +public method
public class LoginPage
{
	private WebDriver driver;
	
	//to initialize driver:Constructor
	public LoginPage(WebDriver driver)//pass driver from baseclass
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);//initializing webelement
		
	}
	
	//locator
	
	@FindBy(id="user-name")
	private WebElement userNameEle;
	
	@FindBy(id="password")
	private WebElement passwordEle;
	
	@FindBy(id="login-button")
	private WebElement loginBtn;
	
	
	//Public Action methods
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getPageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public InventoryPage doLogin(String un,String psw)
	{
		userNameEle.sendKeys(un);
		passwordEle.sendKeys(psw);
		loginBtn.click();
		//navigating to inventoryPage so return inventory page object
		
		return new InventoryPage(driver);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
