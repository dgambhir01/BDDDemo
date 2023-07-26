package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By txtUserName= By.id("name");
	private By txtPassword= By.id("password");
	private By btnLogin = By.id("login");
	private By btnlogout = By.id("logout");
	
	public LoginPage(WebDriver webDriver)
	{
		this.driver = webDriver;
		
//		if(!driver.getTitle().equals("TestProject Demo"))
//		{
//			throw new IllegalStateException("This is not a login page. The current page is: " + driver.getCurrentUrl());
//		}
		
	}
	
	public void accessURL() {
		driver.navigate().to("https://example.testproject.io/web/");

	}
	
	public void enterUserName(String username) {
		driver.findElement(txtUserName).sendKeys(username);

	}

	public void enterPassword(String password) {
		driver.findElement(txtPassword).sendKeys(password);

	}

	public void clickLogin() {
		driver.findElement(btnLogin).click();

	}
	
	public void checkLogoutIsDisplayed() {
		
	}


}
