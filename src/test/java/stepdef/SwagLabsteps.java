package stepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagLabsteps 
{
	public WebDriver driver;

	@Given("Open swaglab application")
	public void open_swaglab_application() {
	    driver=new EdgeDriver();
	    driver.get("https://www.saucedemo.com/");
	}

	@When("user enter valid credentials")
	public void user_enter_valid_credentials(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.

		List<List<String>> cell=dataTable.cells();
		
		driver.findElement(By.id("user-name")).sendKeys(cell.get(0).get(0));
		driver.findElement(By.id("password")).sendKeys(cell.get(0).get(1));
	
	}

	@When("user click on swaglab login button")
	public void user_click_on_swaglab_login_button() {
	   driver.findElement(By.id("login-button")).click();
	}

	@Then("User should be login and navigated to inventory page")
	public void user_should_be_login_and_navigated_to_inventory_page() {

		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
		System.out.println("User login completed!");
	}

}
