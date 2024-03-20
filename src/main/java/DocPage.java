import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DocPage {
    WebDriver driver;
    String ExchangeWaiverprice="//div[@class=\"left\" and contains(normalize-space(text()),'Exchange a Waiver')]" +
            "/following-sibling::div/descendant::span[text()='Free']";
    public DocPage(WebDriver driver){
        this.driver=driver;
    }
    public String getPrice(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ExchangeWaiverprice)));

        String priceSelected=driver.findElement(By.xpath(ExchangeWaiverprice)).getText();
        return priceSelected;
    }
}
