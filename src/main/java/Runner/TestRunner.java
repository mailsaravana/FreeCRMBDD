package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




	@RunWith(Cucumber.class) 
	@CucumberOptions(
			features = "/Users/Admin/eclipse-workspace/FreeCRMBDDFramework/src/main/java/Features/login.feature"
			,glue={"stepDefinitions"}
		//	,format = {"pretty","html:test-output"}
			
			) 


		
public class TestRunner {

	
}
