package com.qa.runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/java/com/qa/features"}
,glue={"com/qa/stepdefinitions"}
,plugin = {"pretty", "html:target/cucumber"}
, tags ={"@web"}
)
@Test
public class testRunner extends AbstractTestNGCucumberTests{

}
