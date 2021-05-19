package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.NumberFormat;

public class SearchedPage {
    private WebDriver driver;
    private By addtocart = By.xpath("//*[@id=\"add-to-cart-button\"]");
    private By product2 = By.xpath("//*[text()='Fujifilm Instax Mini Instant Film, 10 Sheets of 5 Pack × 2 (100 Sheets)']");
    private By product3 = By.xpath("//*[text()='Fujifilm INSTAX Mini Instant Film 2 Pack = 20 Sheets (White) for Fujifilm Mini 8 & Mini 9 Cameras, Model:4332059078']");

    double sum=0;


    public SearchedPage(WebDriver driver) {
        this.driver = driver;
    }

    public void returnPrice(String str){
        str = str.replaceAll("[$,]", "");
        double val = Double.parseDouble(str);
        sum = sum+ val;
        sum= Math.round(sum*100.0)/100.0;
        System.out.println(sum);

    };
    public  Entity clickEntity() {
        returnPrice(driver.findElement(By.xpath("//*[@id=\"price_inside_buybox\"]")).getText());
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(addtocart));
        driver.findElement(addtocart).click();
        driver.navigate().back();
        driver.navigate().back();
        driver.findElement(product2).click();
        returnPrice(driver.findElement(By.xpath("//*[@id=\"price_inside_buybox\"]")).getText());
        wait.until(ExpectedConditions.elementToBeClickable(addtocart));
        driver.findElement(addtocart).click();
        return new Entity(driver, sum);
    }
}
