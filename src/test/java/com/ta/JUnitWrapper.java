package com.ta;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
//@CucumberOptions(features="src/test/resources")
//public class JUnitWrapper {
//
//}

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", format = { "pretty", "html:target/site/cucumber-pretty",
        "json:target/cucumber.json" }, tags = { "~@ignore" })
public class JUnitWrapper {

}
