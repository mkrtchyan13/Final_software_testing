package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Entity {
    private WebDriver driver;
    public double summ;
    private By close = By.xpath("//*[@id=\"attach-close_sideSheet-link\"]");
    private By cart1 = By.xpath("//*[@id=\"nav-cart\"]");


    public Entity(WebDriver driver, double sum) {
        this.driver = driver;
        summ = sum;
    }
public double returnSum(){
        return summ;
    }

public SumPage clickSum (){
    driver.get("https://www.amazon.com/gp/cart/view.html?ref_=nav_cart");
    return new SumPage(driver);
}

}