package org.test.steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\user\\Downloads\\eclipse\\Divakar\\CucumberFramework\\src\\test\\resources\\Login.feature", glue="org.test.steps",dryRun=false,monochrome=true,plugin= {"pretty","json:target/cucumber-reports/Cucumber.json"})

public class TestRunner2 {

}
