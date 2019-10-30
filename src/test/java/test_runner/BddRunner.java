package test_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * @author Daniyal (iamdaniyalz.pro@gmail.com)
 */
@CucumberOptions(features = {"src/test/resources/features"},
        glue = {"step_definition"},
        plugin = {"pretty", "html:Reports/cucumber-reports"},
        dryRun = true,
        monochrome = true)
public class BddRunner extends AbstractTestNGCucumberTests {

}