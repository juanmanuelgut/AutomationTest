package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ThankYouPage extends BasePage{

    public ThankYouPage(WebDriver driver) {
        super(driver);
    }

    public WebElement thankYouMsg(){
        WebElement thankYouMsg = driver.findElement(By.xpath("//div[@class='section-title text-4xl font-bold custom-text-dark-color leading-none scroll-animation slide-left text-white']"));
        return thankYouMsg;
    }

    public String getURL(){
        String thkyURL = driver.getCurrentUrl();
        return thkyURL;
    }

    public String strThankYouMsg(){
        String strThankYouMsg = this.thankYouMsg().getText();
        return strThankYouMsg;
    }
}
