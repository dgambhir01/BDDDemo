package StepDefinitions;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features",
glue = { "StepDefinitions","AppHooks" }, 
monochrome = true, 
plugin = { "pretty", "json:target/cucumber.json","html:target/HTMLReports.html" },
dryRun = false,
tags = "@focus"
//tags="not @tagSome"
)
public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
