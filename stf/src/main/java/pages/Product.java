package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Product {
    private WebDriver driver;
    private By button3 = By.xpath("//*[@id=\"nav-link-accountList\"]");
    public Product(WebDriver driver) {
        this.driver = driver;
    }
    public Settings chooseSetting(){
        driver.findElement(button3).click();
        return new Settings(driver);
    }}
