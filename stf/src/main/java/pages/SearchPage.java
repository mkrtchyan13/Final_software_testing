package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    private WebDriver driver;
    private By product = By.xpath("//*[text()='Fujifilm Instax Mini Instant Film, 10 Sheets×5 Pack(Total 50 Shoots) [Bulk Packaging]']");
    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }
    public SearchedPage clickSearched(){
        driver.findElement(product).click();
        return new SearchedPage(driver);
    }

    public String getUrl() {
        String blah123= driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        blah123 = blah123.replace("\"", "");
        return blah123;
    }
}
