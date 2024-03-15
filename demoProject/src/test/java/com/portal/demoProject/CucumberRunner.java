package com.portal.demoProject;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//Runner class to run the tests
@CucumberOptions(
        features = "classpath:features",
        glue = "com.portal.demoProject.steps",
        tags =  "@Smoke",
        plugin = {
                "pretty",
                "html:target/cucumber.html"
        }
)

public class CucumberRunner extends AbstractTestNGCucumberTests {
}