package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();


    public WebDriver init_driver(){
        WebDriverManager.chromedriver().setup();
        tlDriver.set(new ChromeDriver());

        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        return getDriver();
    }
    public static WebDriver getDriver(){
        return tlDriver.get();


    }

}
