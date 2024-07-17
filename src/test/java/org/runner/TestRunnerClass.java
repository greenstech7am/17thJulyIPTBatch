package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.utilities.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.stepdefinition",monochrome = true, dryRun = false,
snippets = SnippetType.CAMELCASE, plugin = {
		"html:target\\Reports",
		"junit:target\\Reports\\fb.xml",
		"json:target\\Reports\\face.json",
		"rerun:src\\test\\resources\\Rerun\\Failed.txt"
})
public class TestRunnerClass {
	
	
	
	@AfterClass
	public static void pullReport() {
		
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\target\\Reports\\face.json");
	}
	

	
	
	
	
	
}
