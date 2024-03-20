import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    String url="https://www.levelset.com/";
    String getPaid="//a[@class=\"btn btn-info btn-outline mob-dropdown-btn\"]";
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public void navigateToHome(){
        driver.navigate().to(url);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(getPaid)));
    }

    public DocPage clickOnGetPaid(){
        WebElement getPaidBtn=driver.findElement(By.xpath(getPaid));
        getPaidBtn.click();
        getPaidBtn.click();

        return new DocPage(driver);
    }
}
