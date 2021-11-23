package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CategoryPage extends BasePage{

    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    public void printArticleNames(){
        List<WebElement> articles = driver.findElements(By.xpath("//article//h2[@class = 'heading-3 post-title']//a"));
        for (WebElement article : articles){
            String articleTitle = article.getText();
            System.out.println(articleTitle);
        }
    }
}
