package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import pages.RegistrationPage;

public class RegistrationStepDef {

	private RegistrationPage secondPage=new RegistrationPage(DriverFactory.getDriver());

	
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
		System.out.println("Registration working...");
	   
	}
}
