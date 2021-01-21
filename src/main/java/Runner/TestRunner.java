package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;



	@RunWith(Cucumber.class) 
	@CucumberOptions(
			features="/Users/Admin/eclipse-workspace/FreeCRMBDDFramework/src/main/java/Features/login.feature",
			glue={"StepDefinitions"}
			
			) 


		
public class TestRunner {

	
}
