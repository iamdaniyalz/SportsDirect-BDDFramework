package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseWebPage {

    public static WebDriver driver;

    public BaseWebPage(WebDriver driver) {
        BaseWebPage.driver = driver;

    }

    public boolean Click(WebElement element){
        try{
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", element);
            return true;
        }
        catch(Exception e) {
            e.setStackTrace(new StackTraceElement[0]);
            return false;
        }
    }
    //Wait Method which if fails then catches the exception and prints it in log
    public boolean waitForElement(WebElement element) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception e) {
            e.setStackTrace(new StackTraceElement[0]);
            throw e;
        }
    }

    public boolean scrollIntoView(WebElement element) {

        try {
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].scrollIntoView();", element);
            return true;
        } catch (Exception e) {
            e.setStackTrace(new StackTraceElement[0]);
            throw e;
        }
    }
}
