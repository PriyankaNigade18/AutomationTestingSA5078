package stepdef;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStep 
{
	WebDriver driver;

@Given("Open Opencart regitration page")
public void open_opencart_regitration_page() {
   driver=new EdgeDriver();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
}

@When("user enter required data")
public void user_enter_required_data(DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
	
	List<Map<String,String>> allData=dataTable.asMaps();
	
	String emailId=allData.get(0).get("email")+System.currentTimeMillis()+"@gmail.com";
	
	driver.findElement(By.id("input-firstname")).sendKeys(allData.get(0).get("fname"));
	driver.findElement(By.id("input-lastname")).sendKeys(allData.get(0).get("lname"));
	driver.findElement(By.id("input-email")).sendKeys(emailId);
	driver.findElement(By.id("input-telephone")).sendKeys(allData.get(0).get("telephone"));
	driver.findElement(By.id("input-password")).sendKeys(allData.get(0).get("password"));
	driver.findElement(By.id("input-confirm")).sendKeys(allData.get(0).get("cpassword"));
	
	 
}

@When("user select yes newsletter")
public void user_select_yes_newsletter() {
    driver.findElement(By.xpath("//label[text()='Yes']")).click();
}

@When("user select privacy policy")
public void user_select_privacy_policy() {
  driver.findElement(By.name("agree")).click();
}

@When("user click on Continue")
public void user_click_on_continue() {
   driver.findElement(By.xpath("//input[@value='Continue']")).click();
}

@Then("new user registration should completed")
public void new_user_registration_should_completed() {
   String text=driver.findElement(By.xpath("(//h1)[2]")).getText();
      Assert.assertTrue(text.contains("Created"));
   System.out.println(text);
}


}
