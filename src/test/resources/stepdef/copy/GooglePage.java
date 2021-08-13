package stepdef.copy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.en.Then;

public class GooglePage {
	
	WebDriver driver;
	
	
	
  @Given("^I launch google page$")
  public void given() throws Throwable {
	  
	  WebDriverManager.chromedriver().setup();  
	  driver = new ChromeDriver();
	  
	  driver.get("https://google.com");
	  
  }
  
  @When("^I Search Java Tutorial$")
  public void when() throws Throwable {
	  
	 WebElement wb = driver.findElement(By.name("q"));
	 
	 wb.sendKeys("Java Tutorial");
	 
	 wb.submit();
		 
  }
  
  @Then("^should display java result page$")
  public void then() throws Throwable {
	  Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
	  
  }
  
  
  
  @When("^I Search Selenium Tutorial$")
  public void when1() throws Throwable {
	  
	 WebElement wb = driver.findElement(By.name("q"));
	 
	 wb.sendKeys("Selenium Tutori al");
	 
	 wb.submit();
		 
  }
  
  @Then("^should display Selenium result page$")
  public void then1() throws Throwable {
	  Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");
	  
  }
  
  
  @And("^close the browser$")
  public void and() throws Throwable {
	  driver.close();
  }
  
  
  @After
  public void teardown(Scenario scenario) throws IOException
  {
	  if(scenario.isFailed())
	  {
		  TakesScreenshot screen  = (TakesScreenshot) driver;
		  File screenshot = screen.getScreenshotAs(OutputType.FILE);
		  byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
		  scenario.attach(fileContent, "image/png", "image1");
		  
	  }
  }
  
}