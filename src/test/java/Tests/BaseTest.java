package Tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseTest { //autor:  Juan Gutiérrez
    public WebDriver driver;
    public String baseURL = "http://blankfactor.com";

    @BeforeMethod(alwaysRun = true)
    public void setUpTest() {
        setDrivers("chrome");
        driver.get(baseURL);
    }

    @AfterMethod(alwaysRun = true)
    public void TearDown() {
        driver.close();
        try {
            driver.quit();
        } catch (WebDriverException ex) {
            System.out.println("Driver session has been closed");
        }
    }

    private void setDrivers(String browser) {
        if(browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
        } else {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
    }
}
