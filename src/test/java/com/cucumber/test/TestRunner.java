package com.cucumber.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\com\\cucumber\\feature",
		glue="com.cucumber.stepdef",
		tags="",
		strict=false,
		dryRun=true,
		monochrome=true
		)
public class TestRunner {

}
