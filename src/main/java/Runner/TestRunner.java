package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

	@RunWith(Cucumber.class) 
	@CucumberOptions(features="/FreeCRMBDDFramework/src/main/java/Features/login.feature",
	glue={"StepDefinition"}) 


		
public class TestRunner {

	
}
