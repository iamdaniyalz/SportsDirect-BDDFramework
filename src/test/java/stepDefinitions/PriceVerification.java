package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Daniyal (iamdaniyalz.pro@gmail.com)
 *
 */

public class PriceVerification {
	public static WebDriver driver;
	HomePage homePage;
	String BaseURL = "https://www.sportsdirect.com/";

	@Given("^I am on SportsDirect home page$")
	public void homePage() {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.logfile", "NUL");
		driver = new ChromeDriver();
		driver.get(BaseURL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		homePage = new HomePage(driver);
	}

	@When("I add first product in the bag")
	public void i_add_first_product() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("search results for {string} are displayed")
	public void search_results_are_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
		try {
			Assert.assertTrue(homePage.getTitleText().contains(string), "result title doesn't contain searched string");
		    driver.quit();
		}
		catch(AssertionError e) {
			  e.setStackTrace(new StackTraceElement[0]);
			  driver.quit();
			  throw e;
		  }
	}

	@When("I add second product in the bag")
	public void i_add_second_product_in_the_bag() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("I go to the bag")
	public void i_go_to_the_bag() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("I add one more instance of first product")
	public void i_add_one_more_instance_of_first_product() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("I ensure that the total price is calculated correctly")
	public void i_ensure_that_the_total_price_is_calculated_correctly() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

}
