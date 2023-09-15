package in.Bank.TestSteps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "features/bank.feature",
		glue = "in.Bank.TestSteps"
		 
		)

public class TestRunner extends AbstractTestNGCucumberTests  {

}
