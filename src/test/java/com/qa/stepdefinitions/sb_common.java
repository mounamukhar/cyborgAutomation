package com.qa.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sb_common {
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    System.out.println("This is GIVEN.");
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("This is WHEN.");
	}

	@When("yet another action")
	public void yet_another_action() {
		System.out.println("This is AND WHEN.");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("This is THEN.");
	}

}
