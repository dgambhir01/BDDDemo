package StepDefinitions;

import Pages.SecondPage;
import factory.DriverFactory;
import io.cucumber.java.en.Then;

public class SecondSteps {

	private SecondPage secondPage=new SecondPage(DriverFactory.getDriver());

	
	@Then("user enters other fields")
	public void user_enters_other_fields() {
		secondPage.enterOtherDetails();
	    
	}

	@Then("user clicks on save")
	public void user_clicks_on_save() throws InterruptedException {
		secondPage.clickSave();
		Thread.sleep(3000);
	   
	}
	
	@Then("we should see correct message")
	public void we_should_see_correct_message() {
		secondPage.correctMessageIsDisplayed();
	   
	}
}
