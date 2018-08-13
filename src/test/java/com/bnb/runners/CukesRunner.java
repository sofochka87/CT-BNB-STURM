package com.bnb.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin =  {"pretty", 
				"html:target/cucumber-report",
				"json:target/cucumber.json"
		},
		tags="@temp",
		features = "src/test/resources/com/bnb/features",
		glue = "com/bnb/step_definitions",
		dryRun = false
		)
public class CukesRunner {

}
