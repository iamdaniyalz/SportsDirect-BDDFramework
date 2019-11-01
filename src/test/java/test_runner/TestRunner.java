package test_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * @author Daniyal (iamdaniyalz.pro@gmail.com)
 */
@CucumberOptions(features = {"src/test/resources/features"},
        glue = {"step_definitions"},
        plugin = {"pretty", "html:Reports/cucumber-reports"},
        dryRun = false,
        strict = false,
        monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {

}