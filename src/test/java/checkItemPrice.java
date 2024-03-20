import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class checkItemPrice {
    WebDriver driver;
    HomePage homePage;

    @BeforeClass
    public void setUp(){
        driver=new ChromeDriver();
        homePage=new HomePage(driver);
    }

    @Test
    public void checkItemPriceTest(){
        homePage.navigateToHome();
        DocPage docPage=homePage.clickOnGetPaid();
        Assert.assertEquals(docPage.getPrice(),"Free","Not the same price!!");
    }
   @AfterClass
    public void closeDriver(){
        driver.quit();
   }
}
