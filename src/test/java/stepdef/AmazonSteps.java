package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSteps 
{
	WebDriver driver;
	String actTitle;
	@Given("Open Amazon application")
	public void open_amazon_application() throws InterruptedException {
	   
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
	}

	@When("User get the homepage title")
	public void user_get_the_homepage_title() 
	{
	actTitle=driver.getTitle();
	System.out.println(actTitle);
	}

	@Then("Title should matched with HomePage")
	public void title_should_matched_with_home_page() throws InterruptedException
	{
		Thread.sleep(1000);
		Assert.assertTrue(actTitle.contains("Shopping site in India"));
		System.out.println(actTitle);
	}

	@When("User open Fresh page")
	public void user_open_fresh_page() {

		driver.findElement(By.xpath("//a/span[text()='Fresh']")).click();
	}

	@When("User get the freshpage title")
	public void user_get_the_freshpage_title() {
		actTitle=driver.getTitle();
	}

	@Then("Title should matched with freshPage")
	public void title_should_matched_with_fresh_page() {
		Assert.assertTrue(actTitle.contains("groceries"));
		System.out.println(actTitle);
	}

	@When("User open Sell page")
	public void user_open_sell_page() {
	  driver.findElement(By.linkText("Sell")).click();
	}

	@When("User get the Sellpage title")
	public void user_get_the_sellpage_title() {
		actTitle=driver.getTitle();
	}

	@Then("Title should matched with SellPage")
	public void title_should_matched_with_sell_page() {
		Assert.assertTrue(actTitle.contains("All Categories"));
		System.out.println(actTitle);
	}

	@When("User open Mobilespage")
	public void user_open_mobilespage() {

		driver.findElement(By.linkText("Mobiles")).click();
	}

	@When("User get the mobilespage title")
	public void user_get_the_mobilespage_title() {
	  actTitle=driver.getTitle();
	}

	@Then("Title should matched with MobilesPage")
	public void title_should_matched_with_mobiles_page() {
		Assert.assertTrue(actTitle.contains("Phones Online"));
		System.out.println(actTitle);
	}




}
