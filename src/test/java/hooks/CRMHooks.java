package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.Utility.BrowserProvider;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CRMHooks 
{
	public WebDriver driver;

	@Before
	public void setup()
	{
		System.out.println("@Before hook is running....");
		//driver=new EdgeDriver();
		driver=BrowserProvider.setDriver("edge");
		System.out.println("Driver session created...");
	}
	
	@After
	public void tearDown() throws InterruptedException
	{
		System.out.println("@After hook is running....");
		Thread.sleep(1500);
		driver.quit();
		System.out.println("Driver session closed....");
	}
}
