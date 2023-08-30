package testRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

        
	@CucumberOptions(
        		features= {"src/test/java/features/login.feature"},
        		dryRun=!true,
        		glue="steps",
        		monochrome=true
        		
        	        	)
    
        
        
        public class Runner extends AbstractTestNGCucumberTests
        {
        	
        }
