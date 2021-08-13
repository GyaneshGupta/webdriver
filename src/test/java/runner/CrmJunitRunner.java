package runner;

import org.junit.runner.RunWith;
import org.testng.TestRunner;

import io.cucumber.junit.Cucumber;

//new comment
//new comment from Git master
@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features="src\\test\\resources\\tagFeatures\\",  
		glue= {"stepdef"},
		monochrome=true,
		plugin= {"pretty"},
		/*tags= "@RegressionTest or @SmokeTest"*/
		/*tags= "@RegressionTest and @SmokeTest"*/
		tags= "@RegressionTest and not @SmokeTest"
		)


public class CrmJunitRunner{
	
	
	  public static void main(String args[]) {
	  
	  }
	 

}





