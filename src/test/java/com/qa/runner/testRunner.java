package com.qa.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.cyborgAutomation.cucumberTNGhelper;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/java/com/qa/features"}
,glue={"com/qa/stepdefinitions","com/qa/cyborgAutomation"}
,plugin = {"pretty", "html:target/cucumber"}
,tags ={"@web"}
)
@Test
public class testRunner extends AbstractTestNGCucumberTests{
	
	private cucumberTNGhelper testNGClass = new cucumberTNGhelper();
	
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
	
	@BeforeClass
	public void startExecution() throws Exception {
		System.out.println("I RUN ONLY ONCE. BEFORE SUITE.");	
		
		testNGClass.setUpBeforeTest();
		testNGClass.readRunProp();
	}
	
	@AfterClass
	public void endExecution() throws Exception {
		System.out.println("I RUN ONLY ONCE. AFTER SUITE.");	
		testNGClass.tearDownSuite();
	}

}
