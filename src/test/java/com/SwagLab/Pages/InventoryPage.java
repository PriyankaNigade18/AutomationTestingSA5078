package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SwagLab.Utilities.ElementUtil;

public class InventoryPage 
{
	
	private WebDriver driver;
	
	public InventoryPage(WebDriver driver)//pass driver from base class
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locator
	
	@FindBy(css="div.inventory_list div.inventory_item_name ")
	private List<WebElement> allProducts;
	
	@FindBy(id="add-to-cart")
	private WebElement addToCartBtn;
	
	@FindBy(css="a.shopping_cart_link")
	private WebElement cartOption;
	
	//public methods
	
	public CartPage launchCartPage()
	{
		 cartOption.click();
	return new CartPage(driver);	 
	}
	
	public int getProductsCount()
	{
		return allProducts.size();
	}
	
	
	public InventoryPage getProductDetails()
	{
		ElementUtil.getScreenshot(driver,"inventoryPageProducts");
		System.out.println("----Products details-----");
		for(WebElement i:allProducts)
		{
			System.out.println(i.getText());
		}
		//If method does not return anything then return current class object
		return this;
		
	}
	
	
	public String addProductToCart(String productName)
	{
		for(WebElement i:allProducts)
		{
			if(i.getText().contains(productName))
			{
				ElementUtil.getScreenshot(driver,"inventorySearchProduct");
				//click on product
				i.click();
				System.out.println("Product Found: "+productName);
				
				break;
			}
		}
		
		//add it into cart
		addToCartBtn.click();
		System.out.println(productName+" added into cart");
		return productName;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
