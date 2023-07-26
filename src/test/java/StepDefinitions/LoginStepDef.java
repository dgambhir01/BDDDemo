package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStepDef {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());


	@When("user access login page")
	public void user_access_login_page() {
		loginPage.accessURL();
	}

	@And("^a user provides (.*) and (.*)$")
	public void a_user_provides_test1_and_welcome1(String username, Integer password) throws InterruptedException {

		loginPage.enterUserName(username);
		loginPage.enterPassword(password.toString());
		Thread.sleep(3000);

	}

	@And("a user clicks on login")
	public void a_user_clicks_on_login() {
		loginPage.clickLogin();
		

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {

		loginPage.checkLogoutIsDisplayed();
		System.out.println("Login working");

	}

}
