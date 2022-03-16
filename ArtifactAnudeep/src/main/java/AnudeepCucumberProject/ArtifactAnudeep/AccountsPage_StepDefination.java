package AnudeepCucumberProject.ArtifactAnudeep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AccountsPage_StepDefination {
	@Given("I am on accounts page")
	public void i_am_on_accounts_page() {
		System.out.println("I am on accounts page");
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("checkbox should be unselected")
	public void checkbox_should_be_unselected() {
		System.out.println("checkbox should be unselected");
		// Write code here that turns the phrase above into concrete actions

	}

	@Given("i am on {string} page")
	public void i_am_on_client_page_page(String s) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("======I am on " + s + "=========");
	}

	@Then("print the {int}")
	public void print(int n) {
		System.out.println("===Integer value is " + n + " =====");
	}

	@And("print the colo(u)r as {string}")
	public void printcolor(String n) {
		System.out.println("===Colour value is " + n + " =====");
	}
}
