package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import pages.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Setup {

    public static WebDriver driver;
    public static String BaseURL = "https://www.sportsdirect.com/";
    protected static HomePage HomePage;
    protected static Product Product;
    protected static Checkout Checkout;

    public Setup(WebDriver driver) {
        Setup.driver = driver;
    }

    public Setup() {
    }

    //Browser Initialization
    public static void initialization(String browser) throws IOException {
        System.out.println("Launching: " + browser);

        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            System.setProperty("webdriver.chrome.logfile", "NUL");
            driver = new ChromeDriver();
        } else if (browser.equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equals("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (browser.equals("IE")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }

        HomePage = PageFactory.initElements(driver, HomePage.class);
        Product = PageFactory.initElements(driver, Product.class);
        Checkout = PageFactory.initElements(driver, Checkout.class);

        driver.get(BaseURL);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

}
