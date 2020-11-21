package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\god\\eclipse-workspace\\Masikini\\src\\test\\resources\\signup.feature" }, glue = "org.signup")
public class TestRunner {

}
