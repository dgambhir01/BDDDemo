package StepDefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XHR {
	
	public static WebDriver driver;
	
	@Test
	public static void retTime()
	{
	ChromeOptions options = new ChromeOptions();
	options.setExperimentalOption("w3c", false);
	options.addArguments("--start-maximized");
	options.addArguments("--disable-extensions");
	options.addArguments("--disable-infobars");
	options.addArguments("--disable-notifications");
	options.addArguments("--remote-allow-origins=*");
	options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);

	Map<String, Object> prefs = new HashMap<String, Object>();
	prefs.put("profile.default_content_setting_values.notifications", 2);
	options.setExperimentalOption("prefs", prefs);

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver(options);

	driver.get("https://www.amazon.in/");	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("var xhr = new XMLHttpRequest(); xhr.open('GET', 'https://www.amazon.in/', true); xhr.send();");

	double responseTime = (double) js.executeScript("return performance.getEntriesByName('https://www.amazon.in/')[0].responseEnd - performance.getEntriesByName('https://www.amazon.in/')[0].requestStart;");
	System.out.println("XHR response time: " + responseTime + " ms");


	}
}
