package org.runner;

import org.functinoalLibrary.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources" }, glue = {
		"org.stepdefinition" }, dryRun = false, monochrome = true, snippets = SnippetType.UNDERSCORE, plugin = {
				"pretty", "html:src\\test\\resources\\Reports", "json:src\\test\\resources\\Reports\\report.json",
				"junit:src\\test\\resources\\Reports\\junitreport.xml" })
public class TestRunner {
	@AfterClass
	public static void report() {
		JVMReport.generateJVMReport("src\\test\\resources\\Reports\\report.json");
		System.out.println("done");
	}

}
