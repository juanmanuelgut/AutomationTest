package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlogPage extends BasePage{

    public BlogPage(WebDriver driver){
        super(driver);
    }

    private WebElement nextPageButton(){
        WebElement nextPageButton = driver.findElement(By.xpath("//div[@class='pagination-wrap']//li[@class='page-item']//a[@class='next page-numbers page-link']"));
        return nextPageButton;
    }

    private WebElement articleToOpen(String articleName){
        String xPathArticle = "//h2[@class='heading-4 post-title']//a[.='" + articleName + "']";
        WebElement article = driver.findElement(By.xpath(xPathArticle));
        return article;
    }

    private WebElement fintechTag(){
        WebElement fintechTag = driver.findElement(By.xpath("//a[@class = 'categories-list__item'][@title='Fintech']"));
        return fintechTag;
    }

    public void openArticle(String articleName){
        this.articleToOpen(articleName).click();
    }
    public void goToNextPage(){
        this.nextPageButton().click();
    }

    public String getURL(){
        String blogURL = driver.getCurrentUrl();
        return blogURL;
    }

    private WebElement emailInput(){
        WebElement emailInput = driver.findElement(By.xpath("//label//input[@name='email']"));
        return emailInput;
    }

    private WebElement subscribeButton(){
        WebElement btnSubscribe = driver.findElement(By.xpath("//button[@type='submit']"));
        return btnSubscribe;
    }

    public void subscribeNewsletter(String email){
        this.emailInput().sendKeys(email);
        this.subscribeButton().click();
        this.implicitWait(10);
    }

    public void getFintechCategory(){
        this.fintechTag().click();
    }

}

