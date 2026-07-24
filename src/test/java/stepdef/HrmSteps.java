package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HrmSteps {

	WebDriver driver;

@Given("Open Hrm application")
public void open_hrm_application() {
  driver=new EdgeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@When("user enter {string} and enter {string}")
public void user_enter_and_enter(String un, String psw) {
   
	driver.findElement(By.name("username")).sendKeys(un);
	driver.findElement(By.name("password")).sendKeys(psw);
}

@When("User click on Hrm loginButton")
public void user_click_on_hrm_login_button() {
driver.findElement(By.xpath("//button[@type='submit']")).click();
}

@Then("as per valid dataset user should able to login")
public void as_per_valid_dataset_user_should_able_to_login() {

	Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail!");
	System.out.println("User Login is completed!");
}


}
