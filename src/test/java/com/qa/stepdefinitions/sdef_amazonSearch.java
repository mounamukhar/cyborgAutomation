package com.qa.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.qa.cyborgAutomation.testCommands;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.qa.pageObjects.*;

public class sdef_amazonSearch extends testCommands{
	
	private WebDriver driver;
	
	public sdef_amazonSearch() {
		this.driver = testCommands.getDriver();
	}

	@Given("I want to make sure amazon home page open")
	public void i_want_to_make_sure_amazon_home_page_open() {
		System.out.println("Running WHEN - Amazon");
		driver.get("http://www.amazon.com");
	}
	
	@When("I search for {string} as a product")
	public void i_search_for_as_a_product(String string) {
		pg_Amzn_Home.tb_Search(driver).sendKeys(string);
		pg_Amzn_Home.btn_Search(driver).click();
	}

	@Then("I verify result displayed {string} in step")
	public void i_verify_result_displayed_in_step(String string) {
		if(string.equalsIgnoreCase("success")) {
			if(pg_Amzn_Home.txt_ProdTitle(driver).getText().contains("Fitbit Versa 2")) {
				System.out.println("PASSED: Success in product search.");
			}else {
				System.out.println("FAILED: Failed in product search.");
			}
		}else {
			if(pg_Amzn_Home.txt_ProdTitle(driver).getText().contains("Fitbit Versa 2")) {
				System.out.println("FAILED: Success in product search with incorrect keyword.");
			}else {
				System.out.println("PASSED: Failed in product search as expected.");
			}
		}
		
	}


}
