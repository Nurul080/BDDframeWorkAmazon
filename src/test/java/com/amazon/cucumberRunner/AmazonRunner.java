package com.amazon.cucumberRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"pretty","html:target/amazonReport.html"},
		features="src/test/resources/features",
		glue="com.amazon.stepDefinations",
		tags="@sprint4",
		snippets=SnippetType.CAMELCASE
		
		
		
		)

public class AmazonRunner {
	


}
