package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	private WebDriver driver;

	private By searchBox = By.xpath("//*[@id='country']");
	private By txtaddress = By.id("address");
	private By txtemail = By.id("email");
	private By txtphone = By.id("phone");
	private By btnsave = By.id("save");
	private By savedText= By.xpath("//*[@id='saved']/h3/span");

	public RegistrationPage(WebDriver webDriver) {
		this.driver = webDriver;

//		if (!driver.getTitle().equals("TestProject Demo")) {
//			throw new IllegalStateException(
//					"This is not a second page. The current page is: " + driver.getCurrentUrl());
//		}

	}

	public void enterOtherDetails() {

		Select objSelect = new Select(driver.findElement(searchBox));
		objSelect.selectByValue("IN");
		driver.findElement(txtaddress).sendKeys("Test1");
		driver.findElement(txtemail).sendKeys("Test1@test.com");
		driver.findElement(txtphone).sendKeys("9090909090");

	}

	public void clickSave() {
		driver.findElement(btnsave).click();

	}

	public void correctMessageIsDisplayed() {
		

	}
}
