package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private WebElement blogOption(){
        return this.driver.findElement(By.id("menu-item-3960"));
    }

    public void openBlog(){
        this.blogOption().click();
    }

    public String getURL(){
        String homeURL = driver.getCurrentUrl();
        return homeURL;
    }
}
