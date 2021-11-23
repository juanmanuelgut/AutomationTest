package Tests;

import PageObjects.ArticlePage;
import PageObjects.BlogPage;
import PageObjects.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenArticleTest extends BaseTest {

    @Test(groups = {"assesment"})
    public void validateOpenedArticle() throws InterruptedException {
        String articleName = "Why Fintech in Latin America Is Having a Boom";
        String articleURL = "https://blankfactor.com/fintech-in-latin-america/";
        HomePage home = new HomePage(driver);
        home.openBlog();
        BlogPage blog = new BlogPage(driver);
        blog.goToNextPage();
        blog.openArticle(articleName);
        ArticlePage article = new ArticlePage(driver);
        article.waitUntilElementExists(article.postTitle());
        Assert.assertTrue(article.strPostTitle().equals(articleName));
        Assert.assertTrue(article.getURL().equals(articleURL));
    }

}
