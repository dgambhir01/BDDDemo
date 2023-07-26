package stepDefinitions;


import io.cucumber.java.en.*;

public class MoreKeyStepDef {
	
	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() {
		System.out.println("User navigated to login page.");

	}

	@When("I submit username and password")
	public void i_submit_username_and_password() {
		System.out.println("User enter credentials.");
	   
	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {
		System.out.println("User is logged in.");
	  
	}

	@Given("User search for iPhoneX phone")
	public void user_search_for_i_phone_x_phone() {
		System.out.println("User searching iPhoneX.");
	   
	}

	@When("Add the first iPhoneX phone that appears in the search result to the basket")
	public void add_the_first_i_phone_x_phone_that_appears_in_the_search_result_to_the_basket() {
		System.out.println("User added iPhoneX to the cart.");
	}

	@Then("User basket should display with added item")
	public void user_basket_should_display_with_added_item() {
		System.out.println("Item added to the cart.");
	}

	@Given("User navigate for windows phone")
	@Given("User navigate for android phone")
	public void user_navigate_for_phone() {
		System.out.println("User searching phone.");
	}
	
	@When("Add the windows phone to the basket")
	@When("Add the android phone to the basket")
	public void add_the_phone_to_the_basket() {
		System.out.println("User added item to the cart.");
	}

}
