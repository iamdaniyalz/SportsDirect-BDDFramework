package step_definitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.Setup;
import java.io.IOException;
import java.text.ParseException;


/**
 * @author Daniyal (iamdaniyalz.pro@gmail.com)
 */

public class PriceValidation extends Setup {

    public PriceValidation(WebDriver driver) {
        super(driver);
    }

    @Given("^I am on SportsDirect home page$")
    public void i_am_on_SportsDirect_home_page() throws IOException {
        Setup.initialization("chrome");
        Assert.assertEquals(HomePage.WebsiteAccessibility(), "Website is Accessible");
    }

    @When("^I add first product in the bag$")
	public void i_add_first_product_in_the_bag() {
		Product.searchProductOne();
		Product.addProductOneToBag();
    }

    @And("I add second product in the bag")
    public void i_add_second_product_in_the_bag() {
		Product.searchProductTwo();
		Product.addProductTwoToBag();
    }

    @Then("I go to the bag")
    public void i_go_to_the_bag() {
        try {
        Assert.assertEquals(Checkout.goToCheckout(), "Navigated to checkout page");
        }
        catch (AssertionError e) {
            e.setStackTrace(new StackTraceElement[0]);
            throw e;
        }
    }

    @And("I add one more instance of first product")
    public void i_add_one_more_instance_of_first_product() throws InterruptedException {
        try {
            Assert.assertEquals(Checkout.increaseProductQuantity(), "Product quantity increased");
        }
        catch (AssertionError e) {
            e.setStackTrace(new StackTraceElement[0]);
            throw e;
        }
    }

    @Then("I ensure that the total price is calculated correctly")
    public void i_ensure_that_the_total_price_is_calculated_correctly() throws InterruptedException, ParseException {
        Checkout.getActualTotalPrice();
        Checkout.getProductPrice();
    }
}