package com.WebTesting.Generics;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil
{
	//first reusable code for select based dropdown

	public static void selectBasedDropdown(WebElement ele,String value)
	{
		Select sc=new Select(ele);
		  System.out.println("Is dropdown support multiple selection?: "+sc.isMultiple());
		  
				  List<WebElement> allOptions=sc.getOptions();
				  System.out.println("Total options are: "+allOptions.size());
				  for(WebElement i:allOptions)
				  {
					  System.out.println(i.getText());
					  if(i.getText().contains(value))
					  {
						  i.click();
						  break;
					  }
				  }
		  
		  
	}
	
}
