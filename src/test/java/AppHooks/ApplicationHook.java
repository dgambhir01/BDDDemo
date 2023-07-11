package AppHooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHook {
	
	private DriverFactory driverFactory;
    private WebDriver driver;  
    
    @Before("@ui")
    public void launchBrowser(){
        driverFactory=new DriverFactory();
        driver=driverFactory.init_driver();
    }
    
          
        
    @After("@ui")
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcePath, "image/png", screenshotName);

        }
        driver.quit();
    }
   

}
