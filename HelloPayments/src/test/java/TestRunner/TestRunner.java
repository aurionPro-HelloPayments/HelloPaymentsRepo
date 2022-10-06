package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags = "@RegressionTest"
, features="src/test/java/Features"
,glue={"StepDefinitions"}
,monochrome=true
,publish = true
,plugin = {"html:target/cucumber-report.html","json:target/cucumber-report.json"}
)

public class TestRunner extends AbstractTestNGCucumberTests {
	
}

