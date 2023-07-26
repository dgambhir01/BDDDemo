package stepDefinitions;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
glue = { "stepDefinitions","appHooks" }, 
monochrome = true, 
plugin = { "pretty", "json:target/cucumber.json","html:target/HTMLReports.html" },
dryRun = false,
tags = "@ui"
//tags="not @tagSome"
)
public class TestRunner extends AbstractTestNGCucumberTests {

//	@Override
//	@DataProvider(parallel = true)
//	public Object[][] scenarios() {
//		return super.scenarios();
//	}

}
