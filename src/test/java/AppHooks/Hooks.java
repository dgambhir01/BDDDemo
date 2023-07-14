package AppHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hooks {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("This will Run before all scenarios and only once.");
	}

	@Before
	public void beforeScenario() {
		System.out.println("This will run before each Scenario.");
	}

	@BeforeStep
	public void beforeStep() {
		System.out.println("This will run before each step.");
	}

	@AfterStep
	public void afterStep() {
		System.out.println("This will run after each step.");
	}

	@After
	public void afterScenario() {
		System.out.println("This will run after each Scenario");
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("This will Run after all scenarios and only once.");
	}

}
