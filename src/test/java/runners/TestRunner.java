package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"testCases", "testBase"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests{

}
