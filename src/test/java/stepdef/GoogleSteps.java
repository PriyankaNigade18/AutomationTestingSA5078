package stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps 
{
	public WebDriver driver;
	String actTitle;
	@Given("Open Google application")
	public void open_google_application() {
	   
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
	}

	@When("get the current title of application")
	public void get_the_current_title_of_application()
	{
	 actTitle=driver.getTitle();  
	}

	@Then("validate title it should matched with Google")
	public void validate_title_it_should_matched_with_google() {
	   
		Assert.assertEquals(actTitle,"Google");
		System.out.println("Title matched: "+actTitle);
		
		
	}

	@When("User search for valid keyword")
	public void user_search_for_valid_keyword() {
	    driver.findElement(By.id("APjFqb")).sendKeys("Cucumber");
	}

	@Then("valid search result should display")
	public void valid_search_result_should_display() {
		
		List<WebElement> allOptions=driver.findElements(By.xpath("(//ul[@role='listbox'])[1]/li"));
		System.out.println("Total options are: "+allOptions.size());
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
		}
	}




}
