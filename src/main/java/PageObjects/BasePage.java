package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage { //autor:  Juan Gutiérrez

    static WebDriver driver;
    static Duration timeout = Duration.ofSeconds(10);

    public BasePage(WebDriver _driver) {
        this.driver = _driver;
    }

    public void waitUntilElementExists(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void implicitWait(int time) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

    private WebElement blogOption(){
        return this.driver.findElement(By.id("menu-item-3960"));
    }

}