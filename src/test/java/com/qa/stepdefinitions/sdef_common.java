package com.qa.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.qa.cyborgAutomation.testCommands;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.qa.pageObjects.*;

public class sdef_common extends testCommands{
	
	private WebDriver driver;
	
	public sdef_common() {
		this.driver = testCommands.getDriver();
	}
	
	@When("facebook home page loaded")
	public void facebook_home_page_loaded() {
		System.out.println("Running BACKGROUND");
		driver.get("https://www.facebook.com");
	    
	}
	
	@Given("I want to log into Facebook")
	public void i_want_to_log_into_Facebook() throws InterruptedException {
	    System.out.println("This is GIVEN.");
	    Thread.sleep(3000);
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String string) {
		System.out.println("This is WHEN.");
		if(pg_FB_Home.tb_UserName(driver).isDisplayed()) {
			System.out.println("FB home username displayed.");
			pg_FB_Home.tb_UserName(driver).sendKeys("cyborg");
		}
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String string) {
		System.out.println("This is AND WHEN.");
		if(pg_FB_Home.tb_Password(driver).isDisplayed()) {
			System.out.println("FB home password displayed.");
			pg_FB_Home.tb_Password(driver).sendKeys("Automation");
		}
	}

	@Then("I validate if I can login")
	public void i_validate_if_I_can_login() throws InterruptedException {
		pg_FB_Home.btn_Login(driver).click();
		Thread.sleep(3000);
	}

	
	@Given("FB home page is open")
	public void fb_home_page_is_open() {
	    if(driver.getCurrentUrl().contains("facebook")) {
	    	System.out.println("User is no FB home screen.");
	    }
	}

	@When("User click on Sign Up without any data")
	public void user_click_on_Sign_Up_without_any_data() throws InterruptedException {
		pg_FB_Home.btn_Signup(driver).click();
		System.out.println("Clicked on Signup button.");
		Thread.sleep(1000);
	}

	@Then("Error message displayed")
	public void error_message_displayed() {
	    if(pg_FB_Home.img_ErrorIcom(driver).isDisplayed()) {
	    	System.out.println("Error message displayed.");
	    }else {
	    	System.out.println("Error message NOT displayed.");
	    }
	}



}
