package com.advantage.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {
                "com.advantage.steps",
                "com.advantage.utils"
        },
        tags = "@run",
        plugin = {
                "pretty",
                "html:target/reports/cucumber-report.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class AdvantageDemoRunner {
}