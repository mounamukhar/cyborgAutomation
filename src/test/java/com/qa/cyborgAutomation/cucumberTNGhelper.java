package com.qa.cyborgAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class cucumberTNGhelper extends initializer{
	
	private static WebDriver driver;
	
	public cucumberTNGhelper() {
		this.driver = super.getDriver();
	}
	
	
	@Before("@web")
	public void setUp()
	{
		
		System.out.println("BEFORE method:" + System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//resources//lib//chromedriver_mac");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//super.setDriver(driver);
	}
	
	
	@After
	public void tearDown()
	{
		System.out.println("AFTER method.");
		driver.quit();
	}
	
	
}
