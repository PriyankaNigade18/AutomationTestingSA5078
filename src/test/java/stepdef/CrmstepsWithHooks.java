package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import com.Utility.BrowserProvider;

import hooks.CRMHooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CrmstepsWithHooks  //extends CRMHooks
{
	
	//Suppressed: io.cucumber.java.InvalidMethodException: You're not allowed to extend classes that define Step Definitions or hooks. class stepdef.CrmstepsWithHooks extends class hooks.CRMHooks
		
		

	public WebDriver driver=BrowserProvider.getDriver();	
//	@Before
//	public void setup()
//	{
//		System.out.println("@Before hook is running....");
//		driver=new EdgeDriver();
//		System.out.println("Driver session created...");
//	}
//	
//	@After
//	public void tearDown() throws InterruptedException
//	{
//		System.out.println("@After hook is running....");
//		Thread.sleep(1500);
//		driver.quit();
//		System.out.println("Driver session closed....");
//	}
	

@Given("Open CRM application")
public void open_crm_application() 
{
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://automationplayground.com/crm/");
    
}

@When("user click on SignIn")
public void user_click_on_sign_in() {
    driver.findElement(By.linkText("Sign In")).click();
}

@Then("It should navigate to LoginPage")
public void it_should_navigate_to_login_page() {
    Assert.assertTrue(driver.getCurrentUrl().contains("login"));
    System.out.println("User navigated to Login page!");
}

@When("user enter email {string} and enter password {string}")
public void user_enter_email_and_enter_password(String email, String psw)
{
    driver.findElement(By.id("email-id")).sendKeys(email);
    driver.findElement(By.id("password")).sendKeys(psw);
}

@When("user click on submit button")
public void user_click_on_submit_button() throws InterruptedException {
    driver.findElement(By.id("submit-id")).click();
    Thread.sleep(2000);
}

@Then("user should be login and navigate to customer page")
public void user_should_be_login_and_navigate_to_customer_page() {

Assert.assertTrue(driver.getCurrentUrl().contains("customers"));
System.out.println("User login process completed and Navigated to customers page");
}


}
