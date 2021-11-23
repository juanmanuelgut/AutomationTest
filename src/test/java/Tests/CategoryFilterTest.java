package Tests;

import PageObjects.BlogPage;
import PageObjects.CategoryPage;
import PageObjects.HomePage;
import org.testng.annotations.Test;

public class CategoryFilterTest extends BaseTest{

    @Test(groups = {"assesment"})
    public void filterByCategory() throws InterruptedException{
        String articleName = " Why Fintech in Latin America Is Having a Boom";
        String articleURL = "https://blankfactor.com/fintech-in-latin-america/";
        HomePage home = new HomePage(driver);
        home.openBlog();
        BlogPage blog = new BlogPage(driver);
        blog.getFintechCategory();
        CategoryPage fintechArticles = new CategoryPage(driver);
        fintechArticles.printArticleNames();
    }

}
