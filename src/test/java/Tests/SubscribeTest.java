package Tests;

import PageObjects.BlogPage;
import PageObjects.HomePage;
import PageObjects.ThankYouPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubscribeTest extends BaseTest{

    @Test(groups ={"assesment"})
    public void canSubscribeNewsletter() throws InterruptedException{
        String email = "jmemail2222@getnada.com";
        String thankYouMsg = " Thank you for your submission";
        HomePage home = new HomePage(driver);
        home.openBlog();
        BlogPage blog = new BlogPage(driver);
        blog.subscribeNewsletter(email);
        blog.implicitWait(30);
        ThankYouPage thankYou = new ThankYouPage(driver);
        Assert.assertTrue(thankYou.strThankYouMsg().equals(thankYouMsg));
        Assert.assertTrue(thankYou.getURL().equals("https://blankfactor.com/thank-you/"));
    }

}
