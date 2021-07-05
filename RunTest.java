package com.tcm.stepdefinitions;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "json:target/cucumber.json" },
	features = { "src/test/resources" },
	tags = { "@Authentication" })
public class RunTest {
	

}


