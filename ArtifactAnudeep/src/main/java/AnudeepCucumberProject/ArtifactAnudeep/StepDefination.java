package AnudeepCucumberProject.ArtifactAnudeep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.out.println("I want to write a step with precondition");
	
		// Write code here that turns the phrase above into concrete actions
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		System.out.println("some other precondition");
		// Write code here that turns the phrase above into concrete actions
		
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("I complete action");
		// Write code here that turns the phrase above into concrete actions
		
	}

	@When("some other action")
	public void some_other_action() {
		System.out.println("some other action");
		// Write code here that turns the phrase above into concrete actions
		
	}

	@When("yet another action")
	public void yet_another_action() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("yet another action");
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		System.out.println("check more outcomes");
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
	
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Given("I want to write a step with name2")
	public void i_want_to_write_a_step_with_name2() {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {
		// Write code here that turns the phrase above into concrete actions
		
	}
	@Then("print the {int}")
	public void print(int n)
	{
		System.out.println("===Integer value is "+n+" =====");
	}
	
	

}
