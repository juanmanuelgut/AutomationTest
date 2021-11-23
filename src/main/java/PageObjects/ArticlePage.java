package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ArticlePage extends BasePage{

    public ArticlePage(WebDriver driver){
        super(driver);
    }

    public WebElement postAuthor(){
        WebElement postAuthor = driver.findElement(By.className("post-meta__author"));
        return postAuthor;
    }

    public WebElement postTitle(){
        WebElement postTitle = driver.findElement(By.xpath("//h1[@class='heading-3 post-title']"));
        return postTitle;
    }

    public WebElement postSubTitle(String subTitle){
        String xPathSubtitle = "//h2[.='" + subTitle + "']";
        WebElement postSubTitle = driver.findElement(By.xpath(xPathSubtitle));
        return postSubTitle;
    }

    public String getURL(){
        String articleURL = driver.getCurrentUrl();
        return articleURL;
    }

    public String strPostTitle(){
        String strPostTitle = this.postTitle().getText();
        return strPostTitle;
    }
}
