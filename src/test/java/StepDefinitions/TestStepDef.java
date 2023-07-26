package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStepDef {

	Scenario scenario;

	@Before
	public void before(Scenario scenario) {
		this.scenario = scenario;
	}

	@Given("^I want to write a step with (.*)$")
	public void i_want_to_write_a_step_with_name1(String name) {
		System.out.println("Name is: " + name);
	}

	@When("^I check for the (.*) in step$")
	public void i_check_for_the_in_step(Integer int1) {
		System.out.println("Number is: " + int1);
	}

	@Then("^I verify the (.*) in step$")
	public void i_verify_the_success_in_step(String status) {
		System.out.println("Status is: " + status);

	}

	@Given("some other extra precondition")
	public void some_other_extra_precondition() {

	}

	@Given("some other precondition")
	public void some_other_precondition() {

	}

	@When("I complete action")
	public void i_complete_action() {

		if (scenario.getName().equalsIgnoreCase("First scenario First feature")) {
			System.out.println("This is for 1st Feature file.");
		} else {
			System.out.println("This is for 2nd Feature file.");
		}

	}
	
	@Given("without login")
	public void without_login() {

	}

	@Then("All good")
	public void all_good() {

	}

	@Given("^I want to search and confirm some apps domain$")
	public void some_other_precondition_for_following_users(DataTable dataTable) {
		List<List<String>> rows = dataTable.asLists(String.class);

		for (List<String> columns : rows) {
			System.out.println("I am searching " + columns.get(0));
			System.out.println("and Getting domain " + columns.get(1));
		}

	}

	@Given("User submits a valid registration form header")
	public void userSubmitsAValidRegistrationFormHeader(DataTable dataTable) {
		List<Map<String, String>> signUpForms = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> form : signUpForms) {

			String fName = form.get("FirstName");
			String lName = form.get("LastName");
			String username = form.get("Username");
			String password = form.get("Password");
			String email = form.get("Email");
			System.out.println("Running for: " + fName + " " + lName + " " + username + " " + password + " " + email);
		}
	}

	@Then("System proceeds with registration")
	public void system_proceeds_with_registration() {
		System.out.println("Reg done");
	}

}
