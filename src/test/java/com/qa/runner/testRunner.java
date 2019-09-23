package com.qa.runner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/java/com/qa/features"}
,glue={"com/qa/stepdefinitions","com/qa/cyborgAutomation"}
,plugin = {"pretty", "html:target/cucumber"}
,tags ={"@web"}
)
@Test
public class testRunner extends AbstractTestNGCucumberTests{
	
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
