/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author Daniyal (iamdaniyalz.pro@gmail.com)
 *
 */
public class Checkout extends BaseWebPage{

    public Checkout(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "divBagTotalLink")
    private WebElement Checkout;

    @FindBy(how = How.XPATH, using = "//td[@class='productdesc']//a[@href=\"/official-vintage-band-t-shirt-rolling-stones-600311#colcode=60031126\"]" +
            "/../../..//a[@class='BasketQuantBut s-basket-plus-button']")
    private WebElement IncreaseQuantity;

    @FindBy(how = How.XPATH, using = "//a[text()='Update bag']")
    private WebElement UpdateBag;

    @FindBy(how = How.ID, using = "TotalValue")
    private WebElement ActualTotalValue;

    @FindBy(how = How.XPATH, using = "//div[@id='dnn_ctr1628848_ViewBasket_BasketDetails_gvBasketDetails']" +
            "//td[@class='itemtotalprice']//span[contains(text(),'£')]")
    private List<WebElement> ProductPrices;

    public float actualTotalPrice = 0;

    public String goToCheckout(){
        Checkout.click();
        if(waitForElement(IncreaseQuantity)){
            return "Navigated to checkout page";
        }
        return "Did not navigate to checkout page";
    }

    public String increaseProductQuantity() throws InterruptedException {
        if(waitForElement(IncreaseQuantity)) {
            IncreaseQuantity.click();
            UpdateBag.click();
            Thread.sleep(5000);
            return "Product quantity increased";
        }
        return "Product quantity did not increase";
    }

    public void getActualTotalPrice() throws InterruptedException {
        String totalPrice = ActualTotalValue.getText();
        String output = totalPrice.replace("£", "");
        actualTotalPrice = Float.valueOf(output);
    }

    public int getProductPrice() throws ParseException {

        for (WebElement element : ProductPrices) {
            String x = element.getText();
            NumberFormat format = NumberFormat.getCurrencyInstance();
            Number number = format.parse(x);
            System.out.println(number.toString());
            return Integer.parseInt(number.toString());
        }
        return Integer.parseInt(null);
    }

    public int addProductPrice() throws ParseException {
        int[] a = {getProductPrice()};
        int sum = IntStream.of(a).sum();
        System.out.println("The total price of products is " + sum);
        return sum;
    }

/*    public void validateTotalPrice() throws ParseException {
        addProductPrice();
        int number2;
        int number1;

        if (addProductPrice() == number2 )
            System.out.printf( "%d == %d\n", number1, number2 );
        if ( number1 != number2 )
            System.out.printf( "%d != %d\n", number1, number2 );
    }*/
}
