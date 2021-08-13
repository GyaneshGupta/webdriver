package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		 features="@target\\failed.txt", 
		 glue= {"stepdef"},
		 plugin= {"pretty"}
	
		
		)


public class RerunFailedRunner extends AbstractTestNGCucumberTests{
	
	
	  public static void main(String args[]) {
	  
	  }
	 

}





