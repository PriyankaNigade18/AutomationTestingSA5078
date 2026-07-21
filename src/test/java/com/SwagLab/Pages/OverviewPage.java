package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SwagLab.Utilities.ElementUtil;

public class OverviewPage
{
	private WebDriver driver;

	public OverviewPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//div[@class='summary_info']//child::div[contains(@class,'summary')]")
	private List<WebElement> paymentSummary;
	
	@FindBy(id="finish")
	private WebElement finishBtn;
	
	@FindBy(tagName="h2")
	private WebElement message;
	
	
	//methods
	
	public OverviewPage getPaymentDetails()
	{
		System.out.println("======Payment Summary======");
		for(WebElement i:paymentSummary)
		{
			System.out.println(i.getText());
		}
		
		return this;
	}
	
	
	public String completeCheckoutProcess()
	{ 
		
		ElementUtil.getScreenshot(driver,"OverviewPage");
		finishBtn.click();
		 return message.getText();
		
	
	}
	
	
	
	
	
	
	

}
