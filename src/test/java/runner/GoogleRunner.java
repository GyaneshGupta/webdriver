package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		publish = true,
		 features="src\\test\\resources\\feature\\googlePage.feature", 
		/* features=".", */
		glue= {"stepdef"},
		monochrome=true,
		dryRun=false,
		plugin = {"pretty",
				
				  "html:target/Reports/Cucumebr.html", 
				/*
				 * "json:target/Reports/Cucumebrjson.json",
				 * "usage:target/Reports/Cucumebrusage.json", "rerun:target/failed.txt",
				 */
				 
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		
		)


public class GoogleRunner extends AbstractTestNGCucumberTests{
	
	/*
	 * @DataProvider(parallel=true) public Object scenarios() { return
	 * super.scenarios();
	 * 
	 * }
	 */
	 

}





