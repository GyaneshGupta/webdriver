

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CRMStepDef2 {
	
WebDriver driver;

		@Given("User is already on login page")
		public void user_is_already_on_login_page() {
		    // Write code here that turns the phrase above into concrete actions
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://ui.cogmento.com");
			
		}


		/*
		 * @When("User enter credentials") public void user_enter_credentials() {
		 * 
		 * driver.findElement(By.name("email")).sendKeys("corpdevops@gmail.com");
		 * driver.findElement(By.name("password")).sendKeys("CrmPro123");
		 * 
		 * driver.findElement(By.
		 * xpath("//div[@class='ui fluid large blue submit button']")).click();
		 * 
		 * }
		 */
		
		/*
		 * @When("User enters {string} and {string}") public void
		 * user_enter_credentials(String uname, String pwd) {
		 * 
		 * driver.findElement(By.name("email")).sendKeys(uname);
		 * driver.findElement(By.name("password")).sendKeys(pwd);
		 * 
		 * driver.findElement(By.
		 * xpath("//div[@class='ui fluid large blue submit button']")).click();
		 * 
		 * }
		 */
		
		/*
		 * @When("User enters credentials") public void user_enter_credentials(DataTable
		 * logincred) { List<String> user = logincred.asList();
		 * 
		 * 
		 * driver.findElement(By.name("email")).sendKeys(user.get(0));
		 * driver.findElement(By.name("password")).sendKeys(user.get(1));
		 * 
		 * driver.findElement(By.
		 * xpath("//div[@class='ui fluid large blue submit button']")).click();
		 * 
		 * }
		 */
		
		// as Map
		@When("User enters credentials")
		public void user_enter_credentials(DataTable logincred) {
			List<Map<String,String>> data = logincred.asMaps();
			
		    
			driver.findElement(By.name("email")).sendKeys(data.get(0).get("username"));
			driver.findElement(By.name("password")).sendKeys(data.get(0).get("password"));
			
			driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
			
		}
		
		@Then("Should display Home page")
		public void should_display_home_page() {
	boolean isUserDisp = driver.findElement(By.className("user-display")).isDisplayed();
	Assert.assertTrue(isUserDisp);
			
		}
		@Then("close browser")
		public void close_the_browser() {
		  driver.close();
		}




}
